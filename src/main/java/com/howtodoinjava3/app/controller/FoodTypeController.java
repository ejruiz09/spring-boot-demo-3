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

import com.howtodoinjava3.app.entity.FoodType;
import com.howtodoinjava3.app.service.FoodTypeService;

@Controller
public class FoodTypeController {

	@Autowired
	private FoodTypeService service;
	
	@RequestMapping("/foodtype")
	public String viewFoodTypePage(Model model) {
		List<FoodType> listFoodType = service.listAll();
		model.addAttribute("listFoodType", listFoodType);
		return "foodtypeindex";
	}
	
	@RequestMapping("/newfoodtype")
	public String showNewFoodTypePage(Model model) {
		FoodType foodtype = new FoodType();
		model.addAttribute("foodtype", foodtype);
		return "new_foodtype";
	}
	
	@RequestMapping(value = "/savefoodtype", method = RequestMethod.POST)
	public String saveFoodType(@ModelAttribute("foodtype")FoodType foodtype) {
		service.save(foodtype);
		
		return "redirect:/foodtype";
	}
	
	@RequestMapping("/editfoodtype/{number}")
	public ModelAndView showEditFoodTypePage(@PathVariable(name= "number") int number) {
		ModelAndView mav = new ModelAndView("edit_foodtype");
		FoodType foodtype = service.get(number);
		mav.addObject("foodtype", foodtype);
		
		return mav;
	}
	
	@RequestMapping("/deletefoodtype/{number}")
	public String deleteFoodType(@PathVariable(name = "number") int number) {
		service.delete(number);
		return "redirect:/foodtype";
	}
	
}
