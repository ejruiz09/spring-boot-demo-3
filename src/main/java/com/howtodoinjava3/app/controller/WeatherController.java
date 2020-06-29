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

import com.howtodoinjava3.app.entity.Weather;
import com.howtodoinjava3.app.service.WeatherService;

@Controller
public class WeatherController {

	@Autowired
	private WeatherService service;
	
	@RequestMapping("/weather")
	public String viewWeatherPage(Model model) {
		List<Weather> listWeather = service.listAll();
		model.addAttribute("listWeather", listWeather);
		return "weatherindex";
	}
	
	@RequestMapping("/newweather")
	public String showNewWeatherPage(Model model) {
		Weather weather = new Weather();
		model.addAttribute("weather", weather);
		return "new_weather";
	}
	
	@RequestMapping(value = "/saveweather", method = RequestMethod.POST)
	public String saveWeather(@ModelAttribute("weather") Weather weather) {
		service.save(weather);
		return "redirect:/weather";
	}
	
	@RequestMapping("/editweather/{id}")
	public ModelAndView showEditWeatherPage(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edit_weather");
		Weather weather = service.get(id);
		mav.addObject("weather", weather);
		
		return mav;
	}
	
	@RequestMapping("/deleteweather/{id}")
	public String deleteWeather(@PathVariable(name = "id") int id) {
		service.delete(id);
		return "redirect:/weather";
	}
}
