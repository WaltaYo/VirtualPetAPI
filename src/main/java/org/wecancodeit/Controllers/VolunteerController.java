package org.wecancodeit.Controllers;

import org.springframework.web.bind.annotation.*;
import org.wecancodeit.Models.VolunteerModel;
import org.wecancodeit.Services.VolunteerService;
import jakarta.annotation.Resource;

/**
 * Controller class that models the mapping of the volunteer services and
 * repository
 */
@RestController
@RequestMapping("/api/v1/volunteers/")
public class VolunteerController {
    @Resource
    private final VolunteerService volunteerService;

    /**
     * Parameterized Constructor
     * 
     * @param volunteerService volunteer services
     */
    public VolunteerController(VolunteerService volunteerService) {
        this.volunteerService = volunteerService;
    }

    /**
     * Method to map getting all volunteers
     * 
     * @return all volunteers
     */
    @GetMapping
    public Iterable<VolunteerModel> getAllVolunteers() {
        return volunteerService.findAll();
    }

    /**
     * Method to get a volunteer by id
     * 
     * @param id volunteer id
     * 
     * @return volunteer
     */
    @GetMapping("{id}")
    public VolunteerModel getVolunteer(@PathVariable Long id) {
        return volunteerService.findById(id);
    }

    /**
     * Method to get volunteers by name and zip
     * 
     * @param name name of volunteer
     * @param zip  zip of volunteer
     * 
     * @return list of volunteers within filter requirements
     */
    @GetMapping("{name}/{zip}")
    public Iterable<VolunteerModel> getByNameZip(@PathVariable String name, @PathVariable String zip) {
        return volunteerService.findByNameZip(name, zip);
    }

    /**
     * Method to delete a volunteer
     * 
     * @param id volunteer id
     * 
     * @return if the deletion of the volunteer was successful
     */
    @DeleteMapping("{id}")
    public boolean deleteVolunteer(@PathVariable Long id) {
        return volunteerService.deleteVolunteer(id);
    }

    /**
     * Method to add a volunteer
     * 
     * @param volunteerModel volunteer to add
     * 
     * @return volunteer added
     */
    @PostMapping
    public VolunteerModel addVolunteer(@RequestBody VolunteerModel volunteerModel) {
        return volunteerService.saveVolunteer(volunteerModel);
    }

    /**
     * Method to update a volunteer
     * 
     * @param volunteerModel volunteer to update
     * 
     * @return volunteer updated
     */
    @PutMapping
    public VolunteerModel saveVolunteer(@RequestBody VolunteerModel volunteerModel) {
        return volunteerService.saveVolunteer(volunteerModel);
    }
}
