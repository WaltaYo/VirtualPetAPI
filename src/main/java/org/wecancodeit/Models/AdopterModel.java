package org.wecancodeit.Models;

import org.wecancodeit.Models.Enums.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

/**
 * Class that models the adopters
 */
@Entity
@Table(name = "t_Adopters")
public class AdopterModel extends ContactModel {
    private PetTypeEnum preferredPetType;
    private AdoptionStatusEnum adoptionStatus;
    private String notes;
    // private Long SHELTER_MODEL_ID;

    @ManyToOne
    private ShelterModel shelterModel;

    /**
     * Default Constructor
     */
    public AdopterModel() {

    }

    /**
     * Parameterized Constructor
     * 
     * @param name             adopter name
     * @param addressLine1     adopter address line 1
     * @param addressLine2     adopter address line 2
     * @param city             adopter city
     * @param state            adopter state (abbreviated)
     * @param zip              adopter zip
     * @param phoneNumber      adopter phone number US Only
     * @param email            adopter email
     * @param imageURL         adopter image URL
     * @param preferredPetType adopter preferred pet type
     * @param adoptionStatus
     * @param notes
     */
    public AdopterModel(String name, String addressLine1, String addressLine2, String city, String state, String zip,
            String phoneNumber, String email, String imageUrl, PetTypeEnum preferredPetType,
            AdoptionStatusEnum adoptionStatus, String notes) {
        super(name, addressLine1, addressLine2, city, state, zip, phoneNumber, email, imageUrl);
        this.preferredPetType = preferredPetType;
        this.adoptionStatus = adoptionStatus;
        this.notes = notes;
    }

    /**
     * Method to get the preferred pet type
     * 
     * @return preferred pet type
     */
    public PetTypeEnum getPreferredPetType() {
        return preferredPetType;
    }

    public AdoptionStatusEnum getAdoptionStatus() {
        return adoptionStatus;
    }

    public String getNotes() {
        return notes;
    }
    
    @JsonIgnore
    public ShelterModel getShelterModel() {
        return shelterModel;
    }

    @JsonIgnore
    public void setShelterModel(ShelterModel shelterModel) {
        this.shelterModel = shelterModel;
    }

    

    public Long getShelterModelId(ShelterModel shelterModel) {
        return shelterModel.getID() ;
    }

    public void setShelterModelId(ShelterModel shelterModel, Long iD) {
        this.shelterModel.getID();
    }

    /**
     * Override for the toString
     */
    @Override
    public String toString() {
        return "AdopterModel [preferredPetType=" + preferredPetType + ", adoptionStatus=" + adoptionStatus + ", notes="
                + notes + ", shelterModel=" + shelterModel + "]";
    }

}
