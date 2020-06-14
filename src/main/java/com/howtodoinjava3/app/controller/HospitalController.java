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
import com.howtodoinjava3.app.entity.Hospital;
import com.howtodoinjava3.app.service.HospitalService;

@Controller
public class HospitalController {

	@Autowired
	private HospitalService service;
	
	@RequestMapping("/hospital")
	public String viewHospitalPage(Model model) {
		List<Hospital> listHospital = service.listAll();
		model.addAttribute("listHospital", listHospital);
		return "hospitalindex";
	}
	
	@RequestMapping("/newhospital")
	public String showNewHospitalPage(Model model) {
		Hospital hospital = new Hospital();
		model.addAttribute("hospital", hospital);
		return "new_hospital";
	}
	
	@RequestMapping(value = "/savehospitalrecord", method = RequestMethod.POST)
	public String saveHospital(@ModelAttribute("hospital") Hospital hospital) {
		service.save(hospital);
		
		return "redirect:/hospital";
	}
	
	@RequestMapping("/edithospitalrecord/{id}")
	public ModelAndView showEditHospitalPage(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edit_hospital");
	    Hospital hospital = service.get(id);
	    mav.addObject("hospital", hospital);
	     
	    return mav;
	}
	
	@RequestMapping("/deletehospitalrecord/{id}")
	public String deleteHospital(@PathVariable(name = "id") int id) {
	    service.delete(id);
	    return "redirect:/hospital";       
	}
	
}
