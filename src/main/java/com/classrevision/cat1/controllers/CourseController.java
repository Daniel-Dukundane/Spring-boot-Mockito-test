package com.classrevision.cat1.controllers;

import com.classrevision.cat1.models.Course;
import com.classrevision.cat1.serviceImplementation.CourseServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/courses")
@CrossOrigin
public class CourseController {

    @Autowired
    private CourseServiceImplementation courseServiceImplementation;

    @GetMapping
    private List<Course> getAll(){
        return courseServiceImplementation.getAll();
    }

    @GetMapping("/{id}")
    private Course findById(@RequestParam Long id) throws Exception{
        return courseServiceImplementation.getById(id);
    }


    @PostMapping
    private ResponseEntity<?> save(@RequestBody Course newCourse){
        Course savedCourse = courseServiceImplementation.save(newCourse);

        return ResponseEntity.ok(savedCourse);

    }

    @DeleteMapping("/{id}")
    private  ResponseEntity<?> delete(@RequestParam Long id)throws Exception{
        Course deletedCourse = courseServiceImplementation.delete(id);

        return ResponseEntity.ok("course is deleted!");
    }
}
