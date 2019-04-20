package com.sarahhospital.dbservice.controllers;

import com.sarahhospital.dbservice.services.PatientService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PatientController {

    private PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @ResponseBody
    @GetMapping("/person")
    public String getPersonName(){
        return patientService.getAllPatients().get(0).getName();
    }

}
