package com.example.vaadindemo.repository;

import com.example.vaadindemo.entity.Course;

import java.util.List;

public interface CourseRepository {

    List<Course> findAll() throws Exception;

    void save(Course course) throws Exception;

    void update(Course course) throws Exception;

    void delete(int id) throws Exception;

    Course findById(int id) throws Exception;
}
