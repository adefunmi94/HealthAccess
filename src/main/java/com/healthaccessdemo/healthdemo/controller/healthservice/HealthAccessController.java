package com.healthaccessdemo.healthdemo.controller.healthservice;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.healthaccessdemo.healthdemo.service.HealthAccessService;

@RestController
public class HealthAccessController {

	private String sessionId;
	private String response;
	
	private HealthAccessService theHealthPro;
	
	@PostMapping("/")
	public String showUssd(@RequestParam String text) {
		
		if(text == "") {
			
			 response = "CON Welcome to Old Mutual Nigeria,\n Which of the Health Proffesional do you need? \n"
			 		+ "1. General Doctor\n"
			 		+ "2. Pediatrician\n"
			 		+ "3. Gynecologist\n"
			 		+ "4. Dentistian\n"
			 		+ "5. Optician\n"
			 		+ "6. Neurologist \n"
			 		+ "7. Quit Service";
			  
			 
		}
		else if(!(text.isEmpty())) {
			
			if(theHealthPro.validateResponse(text)) {
			
				Integer resInt = Integer.parseInt(text);
				
				String option = theHealthPro.getMyResponse(resInt);
				
				response = theHealthPro.addProffessionalRespose(option);
			}
		}
	
		return response;
	}

}
