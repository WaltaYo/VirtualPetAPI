package org.wecancodeit.Dto;

import org.wecancodeit.Models.AdopterModel;
import org.wecancodeit.Models.ShelterModel;
import org.wecancodeit.Models.Enums.AdoptionStatusEnum;
import org.wecancodeit.Models.Enums.PetTypeEnum;


public class AdopterDto {
    private long id;
    private String name;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String email;
    private String imageUrl;
    private PetTypeEnum preferredPetType;
    private AdoptionStatusEnum adoptionStatus;
    private String notes;

    private ShelterModel shelterModel;
    // private Long shelterId;

    public AdopterDto() {
    }

    public AdopterDto(AdopterModel model) {
        this.id = model.getID();
        this.name = model.getName();
        this.addressLine1 = model.getAddressLine1();
        this.addressLine2 = model.getAddressLine2();
        this.city = model.getCity();
        this.state = model.getState();
        this.zip = model.getZip();
        this.phoneNumber = model.getPhoneNumber();
        this.email = model.getEmail();
        this.imageUrl = model.getImageUrl();
        this.preferredPetType = model.getPreferredPetType();
        this.adoptionStatus = model.getAdoptionStatus();
        this.notes = model.getNotes();
        this.shelterModel = model.getShelterModel();
        // this.shelterId= model.getShelterModelId(shelterModel);
    }

    public AdopterModel convertToModel(){
        AdopterModel model = new AdopterModel(this.name, this.addressLine1, this.addressLine2,
         this.city, this.state, this.zip, this.phoneNumber, this.email, this.imageUrl, 
         this.preferredPetType, this.adoptionStatus, this.notes);
        return model;
    }



    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddressLine1() {
        return addressLine1;
    }
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }
    public String getAddressLine2() {
        return addressLine2;
    }
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getZip() {
        return zip;
    }
    public void setZip(String zip) {
        this.zip = zip;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    public PetTypeEnum getPreferredPetType() {
        return preferredPetType;
    }
    public void setPreferredPetType(PetTypeEnum preferredPetType) {
        this.preferredPetType = preferredPetType;
    }
    public AdoptionStatusEnum getAdoptionStatus() {
        return adoptionStatus;
    }
    public void setAdoptionStatus(AdoptionStatusEnum adoptionStatus) {
        this.adoptionStatus = adoptionStatus;
    }
    public String getNotes() {
        return notes;
    }
    public void setNotes(String notes) {
        this.notes = notes;
    }
    public ShelterModel getShelterModel() {
        return shelterModel;
    }
    public void setShelterModel(ShelterModel shelterModel) {
        this.shelterModel = shelterModel;
    }
    // public Long getShelterId() {
    //     return shelterId;
    // }
    // public void setShelterId(Long shelterId) {
    //     this.shelterId = shelterId;
    // }
  
    



}
