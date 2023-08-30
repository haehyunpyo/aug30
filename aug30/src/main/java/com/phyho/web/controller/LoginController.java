package com.phyho.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.phyho.web.dto.LoginDTO;
import com.phyho.web.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@GetMapping("/login")
	public String login() {
		
		return "login";
	}
	
	@PostMapping("/login")
	public String login(LoginDTO dto) {
						
		System.out.println(dto.toString()); // LoginDTO(id=아이디값, pw=비번값)
		LoginDTO result = loginService.login(dto);	// count(*), 이름, 아이디
		System.out.println(result);
		if(result != null && result.getCount() == 1) {
			//세션만들어주겠습니다.
			
			//return new RedirectView("/board");
			return "redirect:/board";
		} else {
			//return new RedirectView("/login");
			return "redirect:/login";
		}
		
	}
	
	
}
