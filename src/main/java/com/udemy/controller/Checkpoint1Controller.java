package com.udemy.controller;

import com.udemy.service.Checkpoint1Service;
import com.udemy.service.ExampleService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/ejercicio")
public class Checkpoint1Controller {

    private static final Log LOGGER = LogFactory.getLog(Checkpoint1Controller.class);

    public static final String CHECKPOINT1_VIEW = "checkpoint1";
    public static final String CHECKPOINT2_VIEW = "checkpoint2";

    @Autowired
    @Qualifier("checkpoint1Service")
    private Checkpoint1Service checkpoint1Service;

    @GetMapping("/check1")
    public RedirectView redirect(){
        return new RedirectView("/ejercicio/check2");
    }
/*
    @GetMapping("/check1")
    public String checkpoint(Model model){
        LOGGER.info("checkpoint1");
        return CHECKPOINT1_VIEW;
    }*/

    @GetMapping("/check2")
    //@RequestMapping(value="exampleMAV", method = RequestMethod.GET)
    public ModelAndView exampleMAV(){

        LOGGER.info("checkpoint2");

        ModelAndView modelAndView = new ModelAndView(CHECKPOINT2_VIEW);
        modelAndView.addObject("message","Mensaje");


        checkpoint1Service.showMessage();


        return modelAndView;
    }

}
