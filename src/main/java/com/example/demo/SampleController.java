package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sample")
public class SampleController {
	
	@GetMapping("/test")
	public String test(Model model) {
		model.addAttribute("titile", "takano");
		return"test";
	}
	@GetMapping("/bbo")
    public String bbo(Model model) {
		model.addAttribute("test", "jjj");
		return"bbo";
	}

}
