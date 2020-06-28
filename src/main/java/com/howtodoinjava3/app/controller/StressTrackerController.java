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

import com.howtodoinjava3.app.entity.StressTracker;
import com.howtodoinjava3.app.service.StressTrackerService;

@Controller
public class StressTrackerController {

	@Autowired
	private StressTrackerService service;
	
	@RequestMapping("/stresstracker")
	public String viewStressTrackerPage(Model model) {
		List<StressTracker> listStressTracker = service.listAll();
		model.addAttribute("listStressTracker", listStressTracker);
		return "stresstrackerindex";
	}
	
	@RequestMapping("/newstresstracker")
	public String showNewStressPage(Model model) {
		StressTracker stresstracker = new StressTracker();
		model.addAttribute("stresstracker", stresstracker);
		return "new_stresstracker";
	}
	
	@RequestMapping(value = "/savestresstracker", method = RequestMethod.POST)
	public String saveStress(@ModelAttribute("stresstracker") StressTracker stresstracker) {
		service.save(stresstracker);
		return "redirect:/stresstracker";
	}
	
	@RequestMapping("/editstresstracker/{id}")
	public ModelAndView showEditStressPage(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edit_stresstracker");
		StressTracker stresstracker = service.get(id);
		mav.addObject("stresstracker", stresstracker);
		
		return mav;
	}
	
	
	@RequestMapping("/deletestresstracker/{id}")
	public String deleteStress(@PathVariable(name="id") int id) {
		service.delete(id);
		return "redirect:/stresstracker";
	}
	
	
}
