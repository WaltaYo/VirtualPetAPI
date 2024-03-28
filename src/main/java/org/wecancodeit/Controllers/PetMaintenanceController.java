package org.wecancodeit.Controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wecancodeit.Models.PetMaintenanceModel;
import org.wecancodeit.Services.PetMaintenanceService;

import jakarta.annotation.Resource;

@RestController
@RequestMapping("/api/v1/petmaintenances/")
public class PetMaintenanceController {

    @Resource
    private final PetMaintenanceService petMaintenanceService;

    public PetMaintenanceController(PetMaintenanceService petMaintenanceService) {
        this.petMaintenanceService = petMaintenanceService;
    }

    @GetMapping
    public Iterable<PetMaintenanceModel> getAllPetMaintanance() {
        return petMaintenanceService.findAll();
    }
    
     @GetMapping("{id}")
    public PetMaintenanceModel getPetMaintanance(@PathVariable Long id) {
        return petMaintenanceService.findById(id);
    }

    
    @GetMapping("byname/{name}")
    public Iterable<PetMaintenanceModel> findByName(@PathVariable String name) {
        return petMaintenanceService.findByName(name);
    }


    @DeleteMapping("{id}")
    public boolean deletePetMaintenance(@PathVariable Long id) {
        return petMaintenanceService.deletePetMaintenance(id);
    }

    @PutMapping //updating
    public PetMaintenanceModel savePetMaintenance(@RequestBody PetMaintenanceModel petMaintenanceModel) {
        return petMaintenanceService.savePetMaintenance(petMaintenanceModel);
    }

    @PostMapping //adding new thing to list
    public PetMaintenanceModel addPetMaintenance(@RequestBody PetMaintenanceModel petMaintenanceModel) {
        return petMaintenanceService.savePetMaintenance(petMaintenanceModel);
    }
}
