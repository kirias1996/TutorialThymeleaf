package com.sutaruhin;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NowController {

	@GetMapping("/now")
	public String getNow(Model model) {

		String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
		model.addAttribute("msg","現在時刻："+now);

		return "now";
	}
}
