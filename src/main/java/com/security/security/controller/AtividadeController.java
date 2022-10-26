package com.security.security.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/atividade")
@PreAuthorize("hasRole('Admin')")
@CrossOrigin
public class AtividadeController {

	@GetMapping("/aberto")
	public String getOpen() {
		//float i = 1 / 0;
		return "Só vem!";
	}

}
