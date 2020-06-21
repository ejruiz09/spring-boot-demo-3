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

import com.howtodoinjava3.app.entity.Medication;
import com.howtodoinjava3.app.service.MedicationService;

@Controller
public class MedicationController {

	@Autowired
	private MedicationService service;
	
	@RequestMapping("/medication")
	public String viewMedicationPage(Model model) {
		List<Medication> listMedication = service.listAll();
		model.addAttribute("listMedication", listMedication);
		return "medicationindex";
	}
	
	@RequestMapping("/newmedication")
	public String showNewMedicationPage(Model model) {
		Medication medication = new Medication();
		model.addAttribute("medication", medication);
		return "new_medication";
	}
	
	@RequestMapping(value = "/savemedication", method = RequestMethod.POST)
	public String saveMedication(@ModelAttribute("medication") Medication medication) {
		service.save(medication);
		
		return "redirect:/medication";
	}
	
	@RequestMapping("/editmedication/{id}")
	public ModelAndView showEditMedicationPage(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edit_medication");
		Medication medication = service.get(id);
		mav.addObject("medication", medication);
		
		return mav;
	}
	
	@RequestMapping("/deletemedication/{id}")
	public String deleteMedication(@PathVariable(name = "id") int id) {
		service.delete(id);
		return "redirect:/medication";
	}
	
	
}
