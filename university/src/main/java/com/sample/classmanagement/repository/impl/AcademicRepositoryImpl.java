/*

package com.sample.classmanagement.repository.impl;

import com.sample.classmanagement.model.entity.Academic;
import com.sample.classmanagement.repository.AcademicRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
@Repository
public class AcademicRepositoryImpl implements AcademicRepository {
    private final Map<String, Academic> map = new HashMap<>();

    @PostConstruct
    public void init() {
        map.put("1", new Academic("1", "Brian", "Male", "Student", new Date(), true));
        map.put("2", new Academic("2", "Alice", "Female", "Student", new Date(), false));
        map.put("3", new Academic("3", "Cindy", "Female", "Teacher", new Date(), true));
    }

    @Override
    public Academic findById(String id) {
        return map.get(id);
    }

    @Override
    public Collection<Academic> findAll() {
        return map.values();
    }
}

 */
