package com.springBootApp.APIcall;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class APIcalls {

    static RestTemplate restTemplate = new RestTemplate();
	static String baseUrl = "http://api.exchangeratesapi.io/v1/";

    public static String apiCallByCountry(String cur) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<Object> requestEntity = new HttpEntity<>(headers);

		ResponseEntity<String> responseEntity = restTemplate.exchange(baseUrl + "latest?access_key=d4879d010da4c852378f07dfc2ffbf95", HttpMethod.GET, requestEntity,String.class);

		HttpStatus statuscode = responseEntity.getStatusCode();
		System.out.println("status code - " + statuscode);
		String user = String.format("%s", responseEntity.getBody());
		String[] splitt = user.split(",");
		String s = '"' + cur + '"';
		String result = "";
		for (String string : splitt) {
			String[] str = string.split(":");
			boolean flag = false;
			if (str[0].equals(s)) {
				result = "Currency Rate : "+ string;
				flag = true;
			}
			if (flag) {
				break;
			}
		}
		return result;
	}	
	
}
