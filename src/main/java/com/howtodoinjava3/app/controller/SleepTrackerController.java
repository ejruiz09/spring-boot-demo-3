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

import com.howtodoinjava3.app.entity.SleepTracker;
import com.howtodoinjava3.app.service.SleepTrackerService;

@Controller
public class SleepTrackerController {

	@Autowired
	private SleepTrackerService service;
	
	@RequestMapping("/sleeptracker")
	public String viewSleepTrackerPage(Model model) {
		List<SleepTracker> listSleepTracker = service.listAll();
		model.addAttribute("listSleepTracker", listSleepTracker);
		return "sleeptrackerindex";
	}
	
	@RequestMapping("/newsleeptracker")
	public String showNewSleepTrackerPage(Model model) {
		SleepTracker sleeptracker = new SleepTracker();
		model.addAttribute("sleeptracker", sleeptracker);
		return "new_sleeptracker";
	}
	
	@RequestMapping(value = "/savesleeptracker", method = RequestMethod.POST)
	public String saveSleepTracker(@ModelAttribute("sleeptracker") SleepTracker sleeptracker) {
		service.save(sleeptracker);
		return "redirect:/sleeptracker";
	}
	
	@RequestMapping("/editsleeptracker/{id}")
	public ModelAndView showEditSleepTrackerPage(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edit_sleeptracker");
		SleepTracker sleeptracker = service.get(id);
		mav.addObject("sleeptracker", sleeptracker);
		return mav;
	}
	
	@RequestMapping("/deletesleeptracker/{id}")
	public String deleteSleepTracker(@PathVariable(name = "id") int id) {
		service.delete(id);
		return "redirect:/sleeptracker";
	}
	
}
