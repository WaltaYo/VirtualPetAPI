package org.wecancodeit.Controllers;

import org.springframework.web.bind.annotation.*;
import org.wecancodeit.Models.PetTaskScheduleModel;
import org.wecancodeit.Services.PetTaskScheduleService;

import jakarta.annotation.Resource;

@RestController
@RequestMapping("/api/v1/schedules/")
public class PetTaskScheduleController {

    @Resource
    private final PetTaskScheduleService petTaskScheduleService;

    public PetTaskScheduleController(PetTaskScheduleService petTaskScheduleService) {
        this.petTaskScheduleService = petTaskScheduleService;
    }

    @GetMapping
    public Iterable<PetTaskScheduleModel> getAllPetTaskSchedules() {
        return petTaskScheduleService.findAll();
    }

    @GetMapping("{id}")
    public PetTaskScheduleModel getPetTaskScheduleModel(@PathVariable Long id) {
        return petTaskScheduleService.findById(id);
    }

    @GetMapping("byvolunteerid/{volunteerID}")
    public Iterable<PetTaskScheduleModel> getVolunteerId(@PathVariable Long volunteerID) {
        return petTaskScheduleService.findByVolunteerID(volunteerID);
    }

    @GetMapping("bypetid/{petID}")
    public Iterable<PetTaskScheduleModel> getPetId(@PathVariable Long petID) {
        return petTaskScheduleService.findByPetID(petID);
    }

    @GetMapping("bytaskid/{taskID}")
    public Iterable<PetTaskScheduleModel> getTaskId(@PathVariable Long taskID) {
        return petTaskScheduleService.findByTaskID(taskID);
    }

    @DeleteMapping("{id}")
    public boolean deletePetTaskSchedule(@PathVariable Long id) {
        return petTaskScheduleService.deletePetTaskSchedule(id);
    }

     @PostMapping
    public PetTaskScheduleModel addPetTaskSchedule(@RequestBody PetTaskScheduleModel petTaskScheduleModel) {
        return petTaskScheduleService.savePetTaskSchedule(petTaskScheduleModel);
    }

    @PutMapping
    public PetTaskScheduleModel saveAdopter(@RequestBody PetTaskScheduleModel petTaskScheduleModel) {
        return petTaskScheduleService.savePetTaskSchedule(petTaskScheduleModel);
    }
}



