/*

package com.sample.classmanagement.controller;

import static com.sample.classmanagement.model.dto.AcademicResponseDTO.*;

import com.sample.classmanagement.model.dto.AcademicResponseDTO;
import com.sample.classmanagement.model.entity.Academic;
import com.sample.classmanagement.service.AcademicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/academics")
public class AcademicController {

    private final AcademicService service;

    @Autowired
    public AcademicController(AcademicService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<AcademicResponseDTO> getAcademic(@RequestParam(required = false) String name) {
        return new ResponseEntity<>(service.getAllAcademics(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AcademicDTO> getAcademicById(@PathVariable String id) {
        return new ResponseEntity<>(new AcademicDTO(id, "Brian", "Student"), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> getAcademic(@RequestBody Academic academic) {
        return new ResponseEntity<>("1", HttpStatus.OK);
    }


}

 */
