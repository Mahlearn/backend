package com.mahlearn.backend.repository;

import com.mahlearn.backend.model.Course;
import org.springframework.data.repository.ListCrudRepository;

public interface CourseRepository extends ListCrudRepository<Course, Long> {
}
