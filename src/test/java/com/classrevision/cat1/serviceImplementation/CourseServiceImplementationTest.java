package com.classrevision.cat1.serviceImplementation;

import com.classrevision.cat1.models.Course;
import com.classrevision.cat1.repositories.CourseRepository;

import static org.assertj.core.api.Java6Assertions.assertThat;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class CourseServiceImplementationTest {

    @Mock
    private CourseRepository courseRepository;

    @InjectMocks
    private CourseServiceImplementation courseService;

    @Test
    public void getAll() throws Exception{
        List<Course> allcourses = courseService.getAll();

        assertThat(allcourses.size()).isGreaterThanOrEqualTo(0);
    }

//    @Test
//    private void save(){
//
//        when(courseRepository.save(new Course("english")))
//                .thenReturn(new Course(1l,"english"));
//
//        assertEquals("english", courseService.save(new Course("english")));
//
//    }

}
