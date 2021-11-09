package com.classrevision.cat1.serviceImplementation;

import com.classrevision.cat1.models.Course;
import com.classrevision.cat1.repositories.CourseRepository;
import com.classrevision.cat1.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImplementation implements CourseService {
    @Autowired
    private CourseRepository courseRepository;

    @Override
    public List<Course> getAll() {
        return courseRepository.findAll();
    }

    @Override
    public Course getById(Long id) throws Exception{

        Optional<Course> courseOptional = courseRepository.findById(id);

        if(! courseOptional.isPresent()) throw new Exception("course is not found");

        return courseOptional.get();
    }



    @Override
    public Course save(Course newCourse) {
        return courseRepository.save(newCourse);
    }

    @Override
    public Course update(Long id, Course updateCourse) throws Exception {
        // testing if the model with this id exists
        Optional<Course> courseOptional = courseRepository.findById(id);

        if(! courseOptional.isPresent()) throw new Exception("course is not found");


        updateCourse.setId(id);

        return courseRepository.save(updateCourse);
    }

    @Override
    public Course delete(Long id) throws  Exception{

        Optional<Course> courseOptional = courseRepository.findById(id);

        if(! courseOptional.isPresent()) throw new Exception("course is not found");

        courseRepository.deleteById(id);

        return courseOptional.get();
    }
}
