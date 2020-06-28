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

import com.howtodoinjava3.app.entity.User;
import com.howtodoinjava3.app.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService service;
	
	@RequestMapping("/user")
	public String viewUserPage(Model model) {
		List<User> listUser = service.listAll();
		model.addAttribute("listUser", listUser);
		return "userindex";
	}
	
	@RequestMapping("/newuser")
	public String showNewUserPage(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "new_user";
	}
	
	@RequestMapping(value = "/saveuser", method = RequestMethod.POST)
	public String saveUser(@ModelAttribute("user") User user) {
		service.save(user);
		return "redirect:/user";
	}
	
	@RequestMapping("/edituser/{userId}")
	public ModelAndView showEditUserPage(@PathVariable(name="userId") int userId) {
		ModelAndView mav = new ModelAndView("edit_user");
		User user = service.get(userId);
		mav.addObject("user", user);
		return mav;
	}
	
	@RequestMapping("/deleteuser/{userId}")
	public String deleteUser(@PathVariable(name="userId") int userId) {
		service.delete(userId);
		return "redirect:/user";
	}
	
}
