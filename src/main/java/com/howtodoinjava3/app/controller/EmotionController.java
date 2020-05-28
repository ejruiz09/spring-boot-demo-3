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

import com.howtodoinjava3.app.entity.Emotion;
import com.howtodoinjava3.app.service.EmotionService;

@Controller
public class EmotionController {

	@Autowired
	private EmotionService service;
	
	@RequestMapping("/emotion")
	public String viewEmotionPage(Model model) {
		List<Emotion> listEmotion = service.listAll();
		model.addAttribute("listEmotion", listEmotion);
		return "emotionindex";
	}
	
	@RequestMapping("/newemotion")
	public String showNewEmotionPage(Model model) {
		Emotion emotion = new Emotion();
		model.addAttribute("emotion", emotion);
		return "new_emotion";
	}
	
	@RequestMapping(value = "/saveemotion", method = RequestMethod.POST)
	public String saveEmotion(@ModelAttribute("emotion") Emotion emotion) {
		service.save(emotion);
		return "redirect:/emotion";
	}
	
	@RequestMapping("/editemotion/{number}")
	public ModelAndView showEditEmotionPage(@PathVariable(name = "number") int number) {
		ModelAndView mav = new ModelAndView("edit_emotion");
		Emotion emotion = service.get(number);
		mav.addObject("emotion", emotion);
		
		return mav;
	}
	
	@RequestMapping("/deleteemotion/{number}")
	public String deleteEmotion(@PathVariable(name="number") int number) {
		service.delete(number);
		return "redirect:/emotion";
	}
	
}
