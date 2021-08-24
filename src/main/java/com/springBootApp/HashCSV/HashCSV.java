package com.springBootApp.HashCSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class HashCSV {

	public static String hashCsv(String s) throws IOException {
		HashMap<String, String> csvHash = new HashMap<>();
		try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Sapteru\\Downloads\\File\\MC-SBART\\countryData.csv"))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] values = line.split(",");
				csvHash.put(values[0], values[1]);
			}
		}
		return (csvHash.get(s));
	}	
	
}
