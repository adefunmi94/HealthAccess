package com.healthaccessdemo.healthdemo.service;

import java.util.Map;

import org.springframework.stereotype.Service;


@Service
public class HealthAccessService {

	private Map<Integer, String> healthPofessional;
	
	private Map<String, String> healthPofessionalRespose;

	
	public void addProffessional() {
		
		healthPofessional.put(1, "General Doctor");
		healthPofessional.put(2, "Pediatrician");
		healthPofessional.put(3, "Gynecologist");
		healthPofessional.put(4, "Dentistian");
		healthPofessional.put(5, "Optician");
		healthPofessional.put(6, "Neurologist");
		
	}
	

	public String addProffessionalRespose( String option) {
		
		healthPofessionalRespose.put("General Doctor", "Connecting you to the next available doctor");
		healthPofessionalRespose.put("Pediatrician",  "Connecting you to the next available  Pediatrician");
		healthPofessionalRespose.put("Pediatrician",  "Connecting you to the next available  Pediatrician");
		healthPofessionalRespose.put("Dentistian", "Connecting you to the next available Dentist");
		healthPofessionalRespose.put("Optician", "Connecting to you to the next available Optician");
		healthPofessionalRespose.put("Neurologist", "Connecting to you to the next available Neurologist ");
		
		
		return healthPofessionalRespose.get(option);
	
	}

	public Map<Integer, String> getHealthPofessional() {
		return healthPofessional;
	}
	
	public String getMyResponse(Integer key) {
		
		return healthPofessional.get(key);
	}
	
	public Boolean validateResponse(String text) {
		
		Character resDigit = text.charAt(0);
		
		if(Character.isDigit(resDigit)) {
			
			return true;
		}
		else {
			return false;
		}
		
	}
}
