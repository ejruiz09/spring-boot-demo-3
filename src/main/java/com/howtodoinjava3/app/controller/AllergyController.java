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

import com.howtodoinjava3.app.entity.Allergy;
import com.howtodoinjava3.app.service.AllergyService;

@Controller
public class AllergyController {

	@Autowired
	private AllergyService service;
	
	@RequestMapping("/allergy")
	public String viewAllergyPage(Model model) {
		List<Allergy> listAllergy = service.listAll();
		model.addAttribute("listAllergy", listAllergy);
		return "allergyindex";
	}
	
	@RequestMapping("/newallergy")
	public String showNewAllergyPage(Model model) {
		Allergy allergy = new Allergy();
		model.addAttribute("allergy", allergy);
		return "new_allergy";
	}
	
	@RequestMapping(value = "/saveallergy", method = RequestMethod.POST)
	public String saveAllergy(@ModelAttribute("allergy") Allergy allergy) {
		service.save(allergy);
		
		return "redirect:/allergy";
	}
	
	@RequestMapping("/editallergy/{number}")
	public ModelAndView showEditAllergyPage(@PathVariable(name = "number") int number) {
		ModelAndView mav = new ModelAndView("edit_allergy");
		Allergy allergy = service.get(number);
		mav.addObject("allergy", allergy);
		
		return mav;
	}
	
	@RequestMapping("/deleteallergy/{number}")
	public String deleteAllergy(@PathVariable(name = "number") int number) {
		service.delete(number);
		return "redirect:/allergy";
	}
}
