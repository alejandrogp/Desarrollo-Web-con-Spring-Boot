package com.udemy.controller;

import com.udemy.entity.Course;
import com.udemy.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/course")
public class CourseController {

    private static final String COURSES_VIEW = "courses";

    @Autowired
    @Qualifier("courseServiceImpl")
    private CourseService courseService;

    @GetMapping("/listCourses")
    public ModelAndView listAllCourses(){
        ModelAndView mav = new ModelAndView(COURSES_VIEW);
        mav.addObject("courses", courseService.listAllCourses());
        return mav;
    }

    @PostMapping("/addCourse")
    public String addCourse(@ModelAttribute("course") Course course){
        courseService.addCourse(course);
        return "redirect:/listCourses";
    }
}
