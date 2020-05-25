package com.howtodoinjava3.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.howtodoinjava3.app.entity.Activities;
import com.howtodoinjava3.app.service.ActivitiesService;

@Controller
public class ActivitiesController {

	@Autowired
	private ActivitiesService service;
	
	@RequestMapping("/activities")
	public String viewActivitiesPage(Model model) {
		List<Activities> listActivities = service.listAll();
		model.addAttribute("listActivities", listActivities);
		return "activitiesindex";
	}
	
	@RequestMapping("/new")
	public String showNewActivityPage(Model model) {
		Activities activities = new Activities();
		model.addAttribute("activities", activities);
		return "new_activity";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveActivity(@ModelAttribute("activities") Activities activities) {
	    service.save(activities);
	     
	    return "redirect:/activities";
	}
	
	@RequestMapping("/edit/{number}")
	public ModelAndView showEditActivityPage(@PathVariable(name = "number") int number) {
	    ModelAndView mav = new ModelAndView("edit_activity");
	    Activities activities = service.get(number);
	    mav.addObject("activities", activities);
	     
	    return mav;
	}
	
	@RequestMapping("/delete/{number}")
	public String deleteActivity(@PathVariable(name = "number") int number) {
	    service.delete(number);
	    return "redirect:/activities";       
	}
}
