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

import com.howtodoinjava3.app.entity.Attack;
import com.howtodoinjava3.app.service.AttackService;

@Controller
public class AttackController {

	@Autowired
	private AttackService service;
	
	@RequestMapping("/attack")
	public String viewAttackPage(Model model) {
		List<Attack> listAttack = service.listAll();
		model.addAttribute("listAttack", listAttack);
		return "attackindex";
	}
	
	@RequestMapping("/newattack")
	public String showNewAttackPage(Model model) {
		Attack attack = new Attack();
		model.addAttribute("attack", attack);
		return "new_attack";
	}
	
	@RequestMapping(value = "/saveattack", method = RequestMethod.POST)
	public String saveAttack(@ModelAttribute("attack") Attack attack) {
		service.save(attack);
		return "redirect:/attack";
	}
	
	@RequestMapping("/editattack/{number}")
	public ModelAndView showEditAttackPage(@PathVariable(name = "number") int number) {
		ModelAndView mav = new ModelAndView("edit_attack");
		Attack attack = service.get(number);
		mav.addObject("attack", attack);
		
		return mav;
	}
	
	@RequestMapping("/deleteattack/{number}")
	public String deleteAttack(@PathVariable(name="number") int number) {
		service.delete(number);
		return "redirect:/attack";
	}
}
