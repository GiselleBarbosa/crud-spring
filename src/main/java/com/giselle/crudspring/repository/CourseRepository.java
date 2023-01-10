package com.giselle.crudspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.giselle.crudspring.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
  
}
