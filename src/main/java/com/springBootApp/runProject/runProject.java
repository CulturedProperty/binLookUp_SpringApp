package com.springBootApp.runProject;

import java.io.IOException;

import com.opencsv.exceptions.CsvException;
import com.springBootApp.CSV.ReadDataFromCSV;
import com.springBootApp.HashCSV.HashCSV;
import com.springBootApp.APIcall.APIcalls;

public class runProject {

    public static String Output(long l) throws IOException, CsvException{
		String[] s1 = ReadDataFromCSV.readDataFromCsv(l).split("<");
		String cur = HashCSV.hashCsv(s1[1]); 
        return s1[0]+"\n"+APIcalls.apiCallByCountry(cur);
    }
	
}
