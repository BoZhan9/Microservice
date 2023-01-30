/*

package com.sample.classmanagement.service.impl;


import com.sample.classmanagement.exception.ResourceNotFoundException;
import com.sample.classmanagement.model.dto.AcademicResponseDTO;
import static com.sample.classmanagement.model.dto.AcademicResponseDTO.*;

import com.sample.classmanagement.model.entity.Academic;
import com.sample.classmanagement.repository.AcademicRepository;
import com.sample.classmanagement.service.AcademicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AcademicServiceImpl implements AcademicService {

    private final AcademicRepository academicRepository;
    @Autowired
    public AcademicServiceImpl(AcademicRepository academicRepository) {
        this.academicRepository = academicRepository;
    }


    @Override
    public AcademicDTO saveAcademic(AcademicDTO academicDTO) {
        return null;
    }

    @Override
    public AcademicResponseDTO getAllAcademics() {
        Collection<Academic> academicCollection = academicRepository.findAll();
        List<AcademicDTO> academicDTOs = academicCollection
                .stream()
                .map(a -> new AcademicDTO(a))
                .collect(Collectors.toList());
        return new AcademicResponseDTO(academicDTOs);
    }

    @Override
    public AcademicDTO getAcademicById(String id) {
        Academic academic = academicRepository.findById(id);
        if (academic == null) {
            throw new ResourceNotFoundException("professor not found with provided id: " + id);
        }
        return new AcademicDTO(academic);
    }

    @Override
    public AcademicDTO updateAcademic(AcademicDTO academicDTO) {
        return null;
    }

    @Override
    public void removeAcademicById(String id) {

    }
}

 */
