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

        ShelterModel shelterModel1 = new ShelterModel("Human Shelter", "address 1",
                "address 2", "City", "OH", "43221", "614888888",
                "wow1@gmail.com", "image path will go here", "website");
        shelterModel1.setID(1L); // EVERY ID SHOULD BE UNIQUE
        shelterService.saveShelter(shelterModel1);

        ShelterModel shelterModel2 = new ShelterModel("Organic Cat Shelter", "address 1",
                "address 2", "City", "OH", "43001", "614888888",
                "wow3@gmail.com", "image path will go here", "website");
        shelterModel2.setID(2L); // EVERY ID SHOULD BE UNIQUE
        shelterService.saveShelter(shelterModel2);

        ShelterModel shelterModel3 = new ShelterModel("Organic Dog Shelter", "address 1",
                "address 2", "City", "OH", "43002", "614888888",
                "wow5@gmail.com", "image path will go here", "website");
        shelterModel3.setID(3L); // EVERY ID SHOULD BE UNIQUE
        shelterService.saveShelter(shelterModel3);

        ShelterModel shelterModel4 = new ShelterModel("Robotic Cat Shelter", "address 1",
                "address 2", "City", "OH", "43003", "614888888",
                "wow6@gmail.com", "image path will go here", "website");
        shelterModel4.setID(4L); // EVERY ID SHOULD BE UNIQUE
        shelterService.saveShelter(shelterModel4);

        ShelterModel shelterModel5 = new ShelterModel("Robotic Dog Shelter", "address 1",
                "address 2", "City", "OH", "43004", "614888888",
                "wow16@gmail.com", "image path will go here", "website");
        shelterModel4.setID(5L); // EVERY ID SHOULD BE UNIQUE
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
        adopterService.saveAdopter(adopterModel1);

        AdopterModel adopterModel2 = new AdopterModel("Hansel", "Adress 1", "Address 2", "Birmingham",
         "MI", "22222", "689453217", "wow13@gmail.com", "pic will go here", PetTypeEnum.CAT , AdoptionStatusEnum.REQUESTED, 
         "pending review");
        adopterModel2.setID(2L);
        adopterService.saveAdopter(adopterModel2);

        AdopterModel adopterModel3 = new AdopterModel("Johann", "Adress 1", "Address 2", "Columbia",
         "SC", "22222", "689453217", "wow113@gmail.com", "pic will go here", PetTypeEnum.DOG , AdoptionStatusEnum.DENIED, 
         "needs proper paperwork");
        adopterModel3.setID(3L);
        adopterService.saveAdopter(adopterModel3);

        AdopterModel adopterModel4 = new AdopterModel("Gretel", "Adress 1", "Address 2", "Detroit",
         "MI", "22222", "689453217", "wow131@gmail.com", "pic will go here", PetTypeEnum.ROBOTIC_DOG , AdoptionStatusEnum.APPROVED, 
         "will pick kittty up tomorrow");
        adopterModel4.setID(4L);
        adopterService.saveAdopter(adopterModel4);




        OrganicPetModel organicPetModel1 = new OrganicPetModel("Bonobo", PetTypeEnum.CAT, "image url goes here",
                "calico", 3, PetHealthEnum.HEALTHY, PetMoodEnum.RELAXED, PetTemperamentEnum.THOUGHTFUL, true,
                null, null);
        organicPetModel1.setID(1L);
        organicPetService.saveOrganicPet(organicPetModel1);
        
        OrganicPetModel organicPetModel2 = new OrganicPetModel("Bruno", PetTypeEnum.DOG, "image url goes here",
                "collie", 4, PetHealthEnum.HEALTHY, PetMoodEnum.EXCITED, PetTemperamentEnum.ACTIVE, true,
                null, null);
        organicPetModel2.setID(2L);
        organicPetService.saveOrganicPet(organicPetModel2);

        OrganicPetModel organicPetModel3 = new OrganicPetModel("Bandera", PetTypeEnum.CAT, "image url goes here",
                "orange", 1, PetHealthEnum.SICK, PetMoodEnum.DEPRESSED, PetTemperamentEnum.SUSPICIOUS, true,
                null, null);
        organicPetModel3.setID(3L);
        organicPetService.saveOrganicPet(organicPetModel3);

        OrganicPetModel organicPetModel4 = new OrganicPetModel("Billy", PetTypeEnum.DOG, "image url goes here",
                "husky", 3, PetHealthEnum.HUNGRY, PetMoodEnum.ANXIOUS, PetTemperamentEnum.HOT_HEADED, true,
                null, null);
        organicPetModel4.setID(4L);
        organicPetService.saveOrganicPet(organicPetModel4);



        RoboticPetModel roboticPetModel1 = new  RoboticPetModel("Chimp", PetTypeEnum.ROBOTIC_CAT, "image url goes here",
         "2.0", "Samsung", 10, 100, RoboticPetHealthEnum.LOW_BATTERY,
        null, null);
        roboticPetModel1.setID(1L);
        roboticPetService.saveRoboticPet(roboticPetModel1);

        RoboticPetModel roboticPetModel2 = new  RoboticPetModel("Orangutan", PetTypeEnum.ROBOTIC_DOG, "image url goes here",
         "2.2", "HP", 50, 80, RoboticPetHealthEnum.NORMAL,
        null, null);
        roboticPetModel2.setID(2L);
        roboticPetService.saveRoboticPet(roboticPetModel2);

        RoboticPetModel roboticPetModel3 = new  RoboticPetModel("Coco", PetTypeEnum.ROBOTIC_CAT, "image url goes here",
         "2.0", "Boeing", 1, 1, RoboticPetHealthEnum.MALFUNCTION,
        null, null);
        roboticPetModel3.setID(3L);
        roboticPetService.saveRoboticPet(roboticPetModel3);

        RoboticPetModel roboticPetModel4 = new  RoboticPetModel("Meringue", PetTypeEnum.ROBOTIC_DOG, "image url goes here",
         "2.2", "Dell", 50, 83, RoboticPetHealthEnum.NORMAL,
        null, null);
        roboticPetModel4.setID(4L);
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
