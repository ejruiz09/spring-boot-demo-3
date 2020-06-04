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

import com.howtodoinjava3.app.entity.FirstAid;
import com.howtodoinjava3.app.service.FirstAidService;

@Controller
public class FirstAidController {

	@Autowired
	private FirstAidService service;

	@RequestMapping("/firstaid")
	public String viewFirstAidPage(Model model) {
		List<FirstAid> listFirstAid = service.listAll();
		model.addAttribute("listFirstAid", listFirstAid);
		return "firstaidindex";
	}

	@RequestMapping("/newfirstaid")
	public String showNewFirstAidPage(Model model) {
		FirstAid firstaid = new FirstAid();
		model.addAttribute("firstaid", firstaid);
		return "new_firstaid";
	}

	@RequestMapping(value = "/savefirstaid", method = RequestMethod.POST)
	public String saveFirstAid(@ModelAttribute("firstaid") FirstAid firstaid) {
		service.save(firstaid);

		return "redirect:/firstaid";
	}

	@RequestMapping("/editfirstaid/{number}")
	public ModelAndView ShowEditFirstAidPage(@PathVariable(name = "number") int number) {
		ModelAndView mav = new ModelAndView("edit_firstaid");
		FirstAid firstaid = service.get(number);
		mav.addObject("firstaid", firstaid);

		return mav;
	}

	@RequestMapping("/deletefirstaid/{number}")
	public String deleteFirstAid(@PathVariable(name = "number") int number) {
		service.delete(number);
		return "redirect:/firstaid";
	}
}
