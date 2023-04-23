package com.adri.crudspring.repository;

import java.beans.JavaBean;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adri.crudspring.model.Course;

@JavaBean
public interface CourseRepository extends JpaRepository<Course, Long> {

}