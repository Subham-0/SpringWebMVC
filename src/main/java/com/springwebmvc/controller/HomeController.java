package com.springwebmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springwebmvc.entity.User;
import com.springwebmvc.service.UserService;

@Controller
public class HomeController {
	
	@Autowired
	private UserService service;

	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("name", "subham");
		model.addAttribute("roll", 23);
		List<String> colors = new ArrayList<String>();
		colors.add("black");
		colors.add("blue");
		colors.add("green");
		colors.add("yellow");
		colors.add("white");

		model.addAttribute("cloList", colors);

		return "home";
	}

	@GetMapping("/login")
	public ModelAndView login() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("className","12th class");
		modelAndView.addObject("section",12);
		List<String> names = new ArrayList<String>();
		names.add("rahul");
		names.add("pragyan");
		names.add("subhas");
		names.add("Abhinash");
		names.add("Alekha");
		modelAndView.addObject("allnames",names);
		
		modelAndView.setViewName("login");
		return modelAndView;
	}
	
	@GetMapping("/register")
	public String register() {
		return "register";
	}
	
	@PostMapping("/createuser")
	public String registerUser(@ModelAttribute User user,@RequestParam("imageurl") String img,Model m) {
		user.setImage(img);
		service.registerUser(user);
		
//		System.out.println(user);
//		m.addAttribute("message","Register successfully");
//		return "redirect:/register";
		
		m.addAttribute("user",user);
		return "success";
	}
	

}
