package com.sutaruhin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MsgController {

	@GetMapping("/msg")
	public String getMsg() {
		return "msg";
	}
	
}
