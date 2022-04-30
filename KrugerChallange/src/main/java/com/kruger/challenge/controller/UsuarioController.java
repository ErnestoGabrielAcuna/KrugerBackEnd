package com.kruger.challenge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.kruger.challenge.entity.Usuarios;
import com.kruger.challenge.repository.RoleRepository;
import com.kruger.challenge.service.UsuarioService;

@Controller
public class UsuarioController {
	@Autowired
	RoleRepository roleRepository;
	
	@Autowired 
	UsuarioService userService;
	
	@GetMapping("/userForm")
	public String getUserForm(Model model) {
		model.addAttribute("userForm", new Usuarios());
		model.addAttribute("roles",roleRepository.findAll());
		model.addAttribute("userList", userService.getAllUsuarios());
		model.addAttribute("listTab","active");
		return "user-form/user-view";
	}
	
	@GetMapping({"/","/login"})
	public String index() {
		return "index";
	}
	}
	

