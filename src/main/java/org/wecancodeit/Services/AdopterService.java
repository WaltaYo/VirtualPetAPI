package org.wecancodeit.Services;

import java.util.*;
import org.springframework.stereotype.Service;
import org.wecancodeit.Models.AdopterModel;
import org.wecancodeit.Repositories.AdopterRepository;
import jakarta.annotation.Resource;
/**
 * Service Class that models the ways to search and edit the adaptors
 */
@Service
public class AdopterService {

    @Resource
    private AdopterRepository adopterRepository;

    /**
     * Default Constructor
     */
    public AdopterService() {
    }

    /**
     * Parameterized Constructor
     * 
     * @param adopterRepository adopter repository
     */
    public AdopterService(AdopterRepository adopterRepository) {
        this.adopterRepository = adopterRepository;
    }

    // /**
    //  * Method to find all Adopters by shelter id
    //  * 
    //  * @return All adopters
    //  */
    // public Iterable<AdopterModel> findAll(long shelterId){
    //     Iterable<AdopterModel> adopters = new ArrayList<>();
    //     try {
    //         adopters = adopterRepository.findAll(shelterId);
    //     } catch (Exception ex) {
    //         throw ex;
    //     }
    //     return adopters;
    // }


    /**
     * 
     * @return
     */
    public Iterable<AdopterModel> findAll(){
        Iterable<AdopterModel> adopters = new ArrayList<>();
        try {
            adopters = adopterRepository.findAll();
        } catch (Exception ex) {
            throw ex;
        }
        return adopters;
    }


    /**
     * Method to find adopters by ID
     * 
     * @param id adopter id
     * 
     * @return the adopter
     */
    public AdopterModel findById(Long id){
        AdopterModel adopter = null;
        try {
            Optional<AdopterModel> optAdopter = adopterRepository.findById(id);
            if (optAdopter.isPresent()) {
                adopter = optAdopter.get();
            }
        } catch (Exception ex) {
            throw ex;
        }
        return adopter;
    }

    /**
     * Method to find an adopter by name and zip
     * 
     * @param name adopter name
     * @param zip adopter zip
     * 
     * @return adopters with in the given filters
     */
    public Iterable<AdopterModel> findByName(String name) {
        Iterable<AdopterModel> adopters = new ArrayList<>();
        try {
           
                 adopters = adopterRepository.findByName(name);
            }
            
         catch (Exception ex) {
            throw ex;
        }
        return adopters;
    }

    /**
     * Method to find adopters by preferred pet type and zip
     * 
     * @param preferredPetType adopters preferred pet type
     * @param zip adopters zip
     * 
     * @return adopters based on zip and pet type filter
     */
    public Iterable<AdopterModel> findByPreferredPetType(String preferredPetType) {
        Iterable<AdopterModel> adopters = new ArrayList<>();
        try {
        
                adopters = adopterRepository.findByPreferredPetType(preferredPetType);
            }
         catch (Exception ex) {
            throw ex;
        }
        return adopters;
    }

    /**
     * Method to delete an adopter by ID
     * 
     * @param id adopter ID
     * 
     * @return if the adopter was deleted
     */
    public boolean deleteAdopter(Long id){
        boolean result = false;
        try {
            adopterRepository.deleteById(id);
            Optional<AdopterModel> optAdopter = adopterRepository.findById(id);
            if (!optAdopter.isPresent()) {
                result = true;
            }
        } catch (Exception ex) {
            throw ex;
        }
        return result;
    }

    /**
     * Method to update and add an adopter
     * 
     * @param adopter the adopter to add or update
     * 
     * @return the added or updated adopter
     */
    public AdopterModel saveAdopter(AdopterModel adopter){
        try {
            if(BaseService.isValidContact(adopter)) {
                adopter = adopterRepository.save(adopter);
            }
        } catch (Exception ex) {
            throw ex;
        }
        return adopter;
    }
}
