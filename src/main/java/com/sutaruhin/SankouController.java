package com.sutaruhin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class SankouController {
	@GetMapping("/sankou/{val1}/{val2}")
	public String getSankou(@PathVariable int val1,@PathVariable int val2,Model model) {
		model.addAttribute("val1", val1);
		model.addAttribute("val2", val2);

		return "sankou";
	}

}
