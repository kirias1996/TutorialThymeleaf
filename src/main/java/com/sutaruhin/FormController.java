package com.sutaruhin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

	@GetMapping("/form")
	public String getForm(Model model) {
		model.addAttribute("msg","値を入力してください。");

		return "form";
	}

	@PostMapping("/form")
	public String postForm(@RequestParam("val") String val,Model model) {
		model.addAttribute("msg","入力された値は「"+val+"」です。");
		model.addAttribute("val", val);

		return "form";
	}


}
