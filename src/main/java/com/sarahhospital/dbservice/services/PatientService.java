package com.sarahhospital.dbservice.services;

import com.sarahhospital.dbservice.repository.PatientRepository;
import com.sarahhospital.dbservice.entities.Patient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    private PatientRepository patientRepository;

    public PatientService (PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

}
