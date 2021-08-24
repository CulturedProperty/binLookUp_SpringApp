package com.springBootApp.controller;

import java.io.IOException;

import com.opencsv.exceptions.CsvException;
import com.springBootApp.runProject.runProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
	
	@GetMapping("/home")
	public String print() {
		return "In order to search bin of a card, Enter 10 digit bin on the link replacing home as follow: binrecord/5339521200(bin number)";
	}

	@GetMapping("/binrecord/{binValue}")
	public String getData(@PathVariable String binValue) throws NumberFormatException, IOException, CsvException{
		
		return runProject.Output(Long.parseLong(binValue));
	}	
	
}
