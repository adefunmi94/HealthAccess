package com.healthaccessdemo.healthdemo.service;

import java.util.Map;

import org.springframework.stereotype.Service;


@Service
public class HealthAccessService {

	private Map<Integer, String> healthPofessional;
	
	private Map<String, String> healthPofessionalRespose;

	
	public void addProffessional() {
		
		healthPofessional.put(1, "CON General Doctor");
		healthPofessional.put(2, "CON Pediatrician");
		healthPofessional.put(3, "CON Gynecologist");
		healthPofessional.put(4, "CON Dentistian");
		healthPofessional.put(5, "CON Optician");
		healthPofessional.put(6, "CON Neurologist");
		
	}
	

	public String addProffessionalRespose( String option) {
		
		healthPofessionalRespose.put("General Doctor", "END Connecting you to the next available doctor");
		healthPofessionalRespose.put("Pediatrician",  "END Connecting you to the next available  Pediatrician");
		healthPofessionalRespose.put("Pediatrician",  "END Connecting you to the next available  Pediatrician");
		healthPofessionalRespose.put("Dentistian", "END Connecting you to the next available Dentist");
		healthPofessionalRespose.put("Optician", "END Connecting to you to the next available Optician");
		healthPofessionalRespose.put("Neurologist", "END Connecting to you to the next available Neurologist ");
		
		
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
