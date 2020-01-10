/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.main.controller;

import com.test.main.dao.UserDataInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author murad_isgandar
 */
@Controller
public class AllControllers {
    
    @GetMapping("/login")
    public ModelAndView login(ModelAndView modelAndView) {
        modelAndView.setViewName("login");
        return modelAndView;
    }
    
    @GetMapping("/admin")
    public ModelAndView admin(ModelAndView modelAndView) {
        modelAndView.setViewName("login");
        return modelAndView;
    }
    
    @GetMapping("/manager")
    public ModelAndView manager(ModelAndView modelAndView) {
        modelAndView.setViewName("login");
        return modelAndView;
    }
    
    @GetMapping("/user")
    public ModelAndView user(ModelAndView modelAndView) {
        modelAndView.setViewName("login");
        return modelAndView;
    }
    
    
    
    
    
    
}
