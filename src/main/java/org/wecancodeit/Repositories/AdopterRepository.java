package org.wecancodeit.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.Models.AdopterModel;

/**
 * Interface that provides the adopter repository
 */
public interface AdopterRepository extends CrudRepository<AdopterModel, Long>{

    /**
     * 
     * @param name
     * @return
     */
    Iterable<AdopterModel> findByName(String name);

   
    /**
     * 
     * @param preferredPetType
     * @return
     */
    Iterable<AdopterModel> findByPreferredPetType(String preferredPetType);

    // /**
    //  * 
    //  * @param shelterId
    //  * @return
    //  */
    // Iterable<AdopterModel> findAll(long shelterId);


    
    
}
