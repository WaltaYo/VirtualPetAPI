package org.wecancodeit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.Models.*;
import org.wecancodeit.Models.Enums.*;
import org.wecancodeit.Services.*;

import jakarta.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {

    @Resource // ADD ALL THE SERVICES HERE, SO WE CAN POPULATE OUR DATABASE
    private final AdopterService adopterService;

    @Resource
    private final OrganicPetService organicPetService;

    @Resource
    private final RoboticPetService roboticPetService;

    @Resource
    private final PetMaintenanceService petMaintenanceService;

    @Resource
    private final PetTaskScheduleService petTaskScheduleService;

    @Resource
    private final ShelterService shelterService;

    @Resource
    private final VolunteerService volunteerService;

    // THEN GENERATE CONSTRUCTOR W/ ALL OBJECTS

    public Populator(AdopterService adopterService, OrganicPetService organicPetService,
            RoboticPetService roboticPetService, PetMaintenanceService petMaintenanceService,
            PetTaskScheduleService petTaskScheduleService, ShelterService shelterService,
            VolunteerService volunteerService) {
        this.adopterService = adopterService;
        this.organicPetService = organicPetService;
        this.roboticPetService = roboticPetService;
        this.petMaintenanceService = petMaintenanceService;
        this.petTaskScheduleService = petTaskScheduleService;
        this.shelterService = shelterService;
        this.volunteerService = volunteerService;
    }

    @Override
    public void run(String... args) throws Exception {


        // Shelter 1
        ShelterModel shelterModel1 = new ShelterModel("Human Shelter", "2125 This Way",
                "Ste 200", "Heron", "OH", "43221", "6148888888",
                "wow1@gmail.com", "image path will go here", "website");
        shelterModel1.setID(1L); 
        shelterService.saveShelter(shelterModel1);

        // Shelter 2
        ShelterModel shelterModel2 = new ShelterModel("Organic Cat Shelter", "2125 This Way",
                "Ste 201", "Heron", "OH", "43001", "614888888",
                "wow3@gmail.com", "image path will go here", "website");
        shelterModel2.setID(2L); 
        shelterService.saveShelter(shelterModel2);

        // Shelter 3
        ShelterModel shelterModel3 = new ShelterModel("Organic Dog Shelter", "2125 This Way",
                "Ste 202", "Heron", "OH", "43002", "614888888",
                "wow5@gmail.com", "image path will go here", "website");
        shelterModel3.setID(3L); 
        shelterService.saveShelter(shelterModel3);

        // Shelter 4
        ShelterModel shelterModel4 = new ShelterModel("Robotic Cat Shelter", "2125 This Way",
                "Ste 203", "Heron", "OH", "43003", "614888888",
                "wow6@gmail.com", "image path will go here", "website");
        shelterModel4.setID(4L); 
        shelterService.saveShelter(shelterModel4);

        // Shelter 5
        ShelterModel shelterModel5 = new ShelterModel("Robotic Dog Shelter", "2125 This Way",
                "Ste 204", "City", "OH", "43004", "614888888",
                "wow16@gmail.com", "image path will go here", "website");
        shelterModel4.setID(5L); 
        shelterService.saveShelter(shelterModel5);


        VolunteerModel volunteerModel1 = new VolunteerModel("Walta", "address 1",
                "address 2", "Grandview", "OH", "432012", "000000000",
                "wow2@gmail.com", "volunteer pic goes here");
        volunteerModel1.setID(1L);
        volunteerService.saveVolunteer(volunteerModel1);

        VolunteerModel volunteerModel2 = new VolunteerModel("Tammy", "address 1",
                "address 2", "Gahanna", "OH", "432012", "000000000",
                "wow4@gmail.com", "volunteer pic goes here");
        volunteerModel2.setID(2L);
        volunteerService.saveVolunteer(volunteerModel2);

        VolunteerModel volunteerModel3 = new VolunteerModel("Yacob", "address 1",
                "address 2", "Colubus", "OH", "432012", "000000000",
                "wow7@gmail.com", "volunteer pic goes here");
        volunteerModel3.setID(3L);
        volunteerService.saveVolunteer(volunteerModel3);

        VolunteerModel volunteerModel4 = new VolunteerModel("Ariam", "address 1",
                "address 2", "Reynoldsburg", "OH", "432012", "000000000",
                "wow8@gmail.com", "volunteer pic goes here");
        volunteerModel4.setID(4L);
        volunteerService.saveVolunteer(volunteerModel4);


        AdopterModel adopterModel1 = new AdopterModel("Lina", "Adress 1", "Address 2", "London",
         "OH", "00000", "222216666", "wow12@gmail.com", "image in here", PetTypeEnum.ROBOTIC_CAT, AdoptionStatusEnum.PENDING, 
         "application pending, needs new charger");
        adopterModel1.setID(1L);
        adopterModel1.setShelterModel(shelterModel1);  //added adopter to shelter 1
        adopterService.saveAdopter(adopterModel1);

        AdopterModel adopterModel2 = new AdopterModel("Hansel", "Adress 1", "Address 2", "Birmingham",
         "MI", "22222", "689453217", "wow13@gmail.com", "pic will go here", PetTypeEnum.CAT , AdoptionStatusEnum.REQUESTED, 
         "pending review");
        adopterModel2.setID(2L);
        adopterModel2.setShelterModel(shelterModel2);  //added adopter to shelter 2
        adopterService.saveAdopter(adopterModel2);

        AdopterModel adopterModel3 = new AdopterModel("Johann", "Adress 1", "Address 2", "Columbia",
         "SC", "22222", "689453217", "wow113@gmail.com", "pic will go here", PetTypeEnum.DOG , AdoptionStatusEnum.DENIED, 
         "needs proper paperwork");
        adopterModel3.setID(3L);
        adopterModel3.setShelterModel(shelterModel3);  //added adopter to shelter 3
        adopterService.saveAdopter(adopterModel3);

        AdopterModel adopterModel4 = new AdopterModel("Gretel", "Adress 1", "Address 2", "Detroit",
         "MI", "22222", "689453217", "wow131@gmail.com", "pic will go here", PetTypeEnum.ROBOTIC_DOG , AdoptionStatusEnum.APPROVED, 
         "will pick kittty up tomorrow");
        adopterModel4.setID(4L);
        adopterModel4.setShelterModel(shelterModel4);  //added adopter to shelter 4
        adopterService.saveAdopter(adopterModel4);


        OrganicPetModel organicPetModel1 = new OrganicPetModel("Bonobo", PetTypeEnum.CAT, "image url goes here",
                "calico", 3, PetHealthEnum.HEALTHY, PetMoodEnum.RELAXED, PetTemperamentEnum.THOUGHTFUL, true,
                null, null);
        organicPetModel1.setID(1L);
        organicPetModel1.setShelterModel(shelterModel1); //added organicPet to shelter 1
        organicPetService.saveOrganicPet(organicPetModel1);
        
        OrganicPetModel organicPetModel2 = new OrganicPetModel("Bruno", PetTypeEnum.DOG, "image url goes here",
                "collie", 4, PetHealthEnum.HEALTHY, PetMoodEnum.EXCITED, PetTemperamentEnum.ACTIVE, true,
                null, null);
        organicPetModel2.setID(2L);
        organicPetModel2.setShelterModel(shelterModel1); //added organicPet to shelter 1
        organicPetService.saveOrganicPet(organicPetModel2);

        OrganicPetModel organicPetModel3 = new OrganicPetModel("Bandera", PetTypeEnum.CAT, "image url goes here",
                "orange", 1, PetHealthEnum.SICK, PetMoodEnum.DEPRESSED, PetTemperamentEnum.SUSPICIOUS, true,
                null, null);
        organicPetModel3.setID(3L);
        organicPetModel3.setShelterModel(shelterModel2); //added organicPet to shelter 2
        organicPetService.saveOrganicPet(organicPetModel3);

        OrganicPetModel organicPetModel4 = new OrganicPetModel("Billy", PetTypeEnum.DOG, "image url goes here",
                "husky", 3, PetHealthEnum.HUNGRY, PetMoodEnum.ANXIOUS, PetTemperamentEnum.HOT_HEADED, true,
                null, null);
        organicPetModel4.setID(4L);
        organicPetModel4.setShelterModel(shelterModel2); //added organicPet to shelter 2
        organicPetService.saveOrganicPet(organicPetModel4);



        RoboticPetModel roboticPetModel1 = new  RoboticPetModel("Chimp", PetTypeEnum.ROBOTIC_CAT, "image url goes here",
         "2.0", "Samsung", 10, 100, RoboticPetHealthEnum.LOW_BATTERY,
        null, null);
        roboticPetModel1.setID(1L);
        roboticPetModel1.setShelterModel(shelterModel3); //added robotic pet to shelter 3
        roboticPetService.saveRoboticPet(roboticPetModel1);

        RoboticPetModel roboticPetModel2 = new  RoboticPetModel("Orangutan", PetTypeEnum.ROBOTIC_DOG, "image url goes here",
         "2.2", "HP", 50, 80, RoboticPetHealthEnum.NORMAL,
        null, null);
        roboticPetModel2.setID(2L);
        roboticPetModel2.setShelterModel(shelterModel3); //added robotic pet to shelter 3
        roboticPetService.saveRoboticPet(roboticPetModel2);

        RoboticPetModel roboticPetModel3 = new  RoboticPetModel("Coco", PetTypeEnum.ROBOTIC_CAT, "image url goes here",
         "2.0", "Boeing", 1, 1, RoboticPetHealthEnum.MALFUNCTION,
        null, null);
        roboticPetModel3.setID(3L);
        roboticPetModel3.setShelterModel(shelterModel4); //added robotic pet to shelter 4
        roboticPetService.saveRoboticPet(roboticPetModel3);

        RoboticPetModel roboticPetModel4 = new  RoboticPetModel("Meringue", PetTypeEnum.ROBOTIC_DOG, "image url goes here",
         "2.2", "Dell", 50, 83, RoboticPetHealthEnum.NORMAL,
        null, null);
        roboticPetModel4.setID(4L);
        roboticPetModel4.setShelterModel(shelterModel4); //added robotic pet to shelter 4
        roboticPetService.saveRoboticPet(roboticPetModel4);



        PetMaintenanceModel petMaintenanceModel1 = new PetMaintenanceModel("Feeding", 2, PetTypeEnum.DOG, PetTaskEnum.FEED_PET);
        petMaintenanceModel1.setId(1L);
        petMaintenanceService.savePetMaintenance(petMaintenanceModel1);

        PetMaintenanceModel petMaintenanceModel2 = new PetMaintenanceModel("Cleaning enclosure", 2, PetTypeEnum.ROBOTIC_DOG, PetTaskEnum.CLEAN_ENCLOSURE);
        petMaintenanceModel2.setId(2L);
        petMaintenanceService.savePetMaintenance(petMaintenanceModel2);

        PetMaintenanceModel petMaintenanceModel3 = new PetMaintenanceModel("Water", 2, PetTypeEnum.CAT, PetTaskEnum.WATER_PET);
        petMaintenanceModel3.setId(3L);
        petMaintenanceService.savePetMaintenance(petMaintenanceModel3);

        PetMaintenanceModel petMaintenanceModel4 = new PetMaintenanceModel("Water", 2, PetTypeEnum.ROBOTIC_CAT, PetTaskEnum.CHARGE_PET);
        petMaintenanceModel4.setId(4L);
        petMaintenanceService.savePetMaintenance(petMaintenanceModel4);


        

        PetTaskScheduleModel petTaskScheduleModel1 = new PetTaskScheduleModel(1L, 1L, 1L, null); 
        petTaskScheduleModel1.setId(1L);
        petTaskScheduleService.savePetTaskSchedule(petTaskScheduleModel1);

        PetTaskScheduleModel petTaskScheduleModel2 = new PetTaskScheduleModel(2L, 2L, 2L, null);
        petTaskScheduleModel2.setId(2L);
        petTaskScheduleService.savePetTaskSchedule(petTaskScheduleModel2);
    
    }

}
