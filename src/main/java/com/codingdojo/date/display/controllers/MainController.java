package com.codingdojo.date.display.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {

    @RequestMapping("/")
    public String index() {
    	return "index.jsp";
    }
    
    @RequestMapping("/date")
    public String date(Model model){
    	Date date = new Date();
    	return "date.jsp";
    }
    
    @RequestMapping("/time")
    public String time(Model model){
    	Date date = new Date();
    	int hours = date.getHours();
    	int minutes = date.getMinutes();
    	int seconds = date.getSeconds();
    	model.addAttribute("hours", hours);
    	model.addAttribute("minutes", minutes);
    	model.addAttribute("seconds", seconds);
    	return "time.jsp";
    }
    
    
}
