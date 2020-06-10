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

import com.howtodoinjava3.app.entity.Food;
import com.howtodoinjava3.app.service.FoodService;

@Controller
public class FoodController {

	@Autowired
	private FoodService service;
	
	@RequestMapping("/food")
	public String viewFoodPage(Model model) {
		List<Food> listFood = service.listAll();
		model.addAttribute("listFood", listFood);
		return "foodindex";
	}
	
	@RequestMapping("/newfood")
	public String showNewFoodPage(Model model) {
		Food food = new Food();
		model.addAttribute("food", food);
		return "new_food";
	}
	
	@RequestMapping(value = "/savefood", method = RequestMethod.POST)
	public String saveFood(@ModelAttribute("food") Food food) {
		service.save(food);
		
		return "redirect:/food";
	}
	
	@RequestMapping("/editfood/{intake}")
	public ModelAndView showEditFoodPage(@PathVariable(name="intake") int intake) {
		ModelAndView mav = new ModelAndView("edit_food");
		Food food = service.get(intake);
		mav.addObject("food", food);
		
		return mav;
	}
	
	@RequestMapping("/deletefood/{intake}")
	public String deleteFood(@PathVariable(name = "intake") int intake) {
		service.delete(intake);
		return "redirect:/food";
	}
}
