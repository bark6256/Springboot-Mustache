package com.cos.viewapp.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//RestController : 데이터를 리턴한다
//Controller : 파일을 리턴한다
@Controller
public class FrontController {
	
	@GetMapping("/home")
	public String home(Model model) {	// request == model
		// ViewResolver 클래스
		// src/main/resources/templates/ (prefix, 앞에 추가)
		// .mustache (suffix, 뒤에 추가)
		// return에 추가
		
		String name = "PYS";
		model.addAttribute("name", name);
		
		List<Board> boards = new ArrayList<>();
		boards.add(new Board(1, "제목1"));
		boards.add(new Board(2, "제목2"));
		boards.add(new Board(3, "제목3"));
		
		model.addAttribute("boards", boards);
		
		return "home"; // RequestDispatcher가 자동으로 작동
	}
}
