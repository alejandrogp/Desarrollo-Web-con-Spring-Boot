package com.udemy.service;

import com.udemy.entity.Course;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("courseService")
public interface CourseService {

    public abstract List<Course> listAllCourses();
    public abstract Course addCourse(Course course);
    public abstract int removeCourse(int id);
    public abstract Course updateCourse(Course course);
}
