package com.classrevision.cat1.services;

import com.classrevision.cat1.models.Course;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CourseService {

    public List<Course> getAll() ;

    public Course getById(Long id) throws Exception;

    public Course save(Course newCourse);

    public Course update(Long id,Course updateCourse) throws Exception;

    public Course delete(Long id) throws Exception;

}
