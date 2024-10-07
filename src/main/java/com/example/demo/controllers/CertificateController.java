package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/certificate")
public class CertificateController {

	

	@GetMapping("/getGreeting")
	public String postCertificate(String s){
		
		return "Hello World";
	}
	
	@GetMapping("/ind")
	public String getInd(String s){
		
		return "Hello India";
	}

}

