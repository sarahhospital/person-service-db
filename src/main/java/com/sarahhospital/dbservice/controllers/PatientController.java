package com.sarahhospital.dbservice.controllers;

import com.sarahhospital.dbservice.controllers.model.Person;
import com.sarahhospital.dbservice.services.PatientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {

    private PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping("/person")
    public Person getPersonName(){
        String name = patientService.getAllPatients().get(0).getName();
        return new Person(name);
    }

}
