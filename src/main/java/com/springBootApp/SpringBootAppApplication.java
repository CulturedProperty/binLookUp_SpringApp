package com.springBootApp;

import java.io.IOException;

import com.opencsv.exceptions.CsvException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootAppApplication {

	public static void main(String[] args) throws IOException, CsvException {
		SpringApplication.run(SpringBootAppApplication.class, args);
	}

}
