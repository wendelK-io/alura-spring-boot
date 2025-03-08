package med.ce.api.controller;

import med.ce.api.dto.DoctorDTO;
import med.ce.api.repository.DoctorRepository;
import med.ce.api.model.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    private DoctorRepository doctorRepository;

    @PostMapping
    @Transactional
    public void addDoctor(@RequestBody DoctorDTO data){
        doctorRepository.save(new Doctor(data));
    }

}
