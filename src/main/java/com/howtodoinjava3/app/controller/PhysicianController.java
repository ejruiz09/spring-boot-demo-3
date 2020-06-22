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

import com.howtodoinjava3.app.entity.Physician;
import com.howtodoinjava3.app.service.PhysicianService;

@Controller
public class PhysicianController {

	@Autowired
	private PhysicianService service;
	
	@RequestMapping("/physician")
	public String viewPhysicianPage(Model model) {
		List<Physician> listPhysician = service.listAll();
		model.addAttribute("listPhysician", listPhysician);
		return "physicianindex";
	}
	
	@RequestMapping("/newphysician")
	public String showNewPhysicianPage(Model model) {
		Physician physician = new Physician();
		model.addAttribute("physician", physician);
		return "new_physician";
	}
	
	@RequestMapping(value = "/savephysician", method = RequestMethod.POST)
	public String savePhysician(@ModelAttribute("physician") Physician physician) {
		service.save(physician);
		return "redirect:/physician";
	}
	
	@RequestMapping("/editphysician/{number}")
	public ModelAndView showEditPhysicianPage(@PathVariable(name = "number") int number) {
		ModelAndView mav = new ModelAndView("edit_physician");
		Physician physician = service.get(number);
		mav.addObject("physician", physician);
		
		return mav;
	}
	
	
	@RequestMapping("/deletephysician/{number}")
	public String deletePhysician(@PathVariable(name = "number") int number) {
		service.delete(number);
		return "redirect:/physician";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
