package com.howtodoinjava3.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AsthmaForumPageController {

	@RequestMapping("/")
	public String viewAsthmaForumPage(Model model) {
		return "index";
	}
}
