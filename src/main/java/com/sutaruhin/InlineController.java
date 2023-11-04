package com.sutaruhin;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InlineController {

	@GetMapping("/inline")
	public String getEach(Model model) {
		List<Member> member = new ArrayList<>();
		member.add(new Member(1, "taro", "男性", 27));
		member.add(new Member(2, "jiro", "男性", 22));
		member.add(new Member(3, "hanako", "女性", 25));

		model.addAttribute("obj", member);

		return "inline";
	}
}
