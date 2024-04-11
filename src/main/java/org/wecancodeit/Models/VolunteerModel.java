package org.wecancodeit.Models;

import java.util.Collection;
import jakarta.persistence.*;

/**
 * Class that models the volunteer
 */
@Entity
@Table(name = "t_Volunteer")
public class VolunteerModel extends ContactModel {

    @ManyToMany(mappedBy = "volunteers")
    private Collection<ShelterModel> shelterModels;

    /**
     * Default Constructor
     */
    public VolunteerModel() {
        super();
    }

    /**
     * Parameterized Constructor
     * 
     * @param name         volunteer's name
     * @param addressLine1 volunteer's address line 1
     * @param addressLine2 volunteer's address line 2
     * @param city         volunteer's city
     * @param state        volunteer's state (abbreviated)
     * @param zip          volunteer's zip code
     * @param phoneNumber  volunteer's phone number
     * @param email        volunteer's email
     * @param imageURL     volunteer's image url
     */
    public VolunteerModel(String name, String addressLine1, String addressLine2, String city, String state,
            String zip, String phoneNumber, String email, String imageUrl) {
        super(name, addressLine1, addressLine2, city, state,
                zip, phoneNumber, email, imageUrl);
    }

    

    /**
     * Override method for toString
     */
    @Override
    public String toString() {
        return super.toString() + "VolunteerModel []";
    }

    public Collection<ShelterModel> getShelterModels() {
        return shelterModels;
    }

    public void setShelterModels(Collection<ShelterModel> shelterModels) {
        this.shelterModels = shelterModels;
    }

}
