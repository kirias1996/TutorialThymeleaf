package com.sutaruhin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ObjController {

	@GetMapping("/obj")
	public String getObj(Model model) {

		Member member = new Member(1,"taro","男性",27);
		model.addAttribute("member",member);

		return "obj";
	}
}
