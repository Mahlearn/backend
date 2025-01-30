package com.mahlearn.backend.service;

import com.mahlearn.backend.model.Course;
import com.mahlearn.backend.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    private final CourseRepository courseRepository;


    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public List<Course> getAllCourses() {
        return this.courseRepository.findAll();
    }
}
