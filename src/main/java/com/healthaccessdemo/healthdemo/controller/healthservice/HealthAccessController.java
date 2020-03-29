package com.healthaccessdemo.healthdemo.controller.healthservice;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.healthaccessdemo.healthdemo.service.HealthAccessService;

@RestController
public class HealthAccessController {
	
	Logger logger = Logger.getLogger(getClass().getName());
 
//	private String sessionId;
	private String response;

	
	
	@PostMapping("/")
	public String showUssd(@RequestParam String text) {
		
		if(text == "") {
		
		 logger.info("empty");

			 return "CON Welcome to Old Mutual Nigeria,\n Which of the Health Proffesional do you need? \n"
			 		+ "1. General Doctor\n"
			 		+ "2. Pediatrician\n"
			 		+ "3. Gynecologist\n"
			 		+ "4. Dentistian\n"
			 		+ "5. Optician\n"
			 		+ "6. Neurologist \n"
			 		+ "7. Quit Service";
			 
//			 logger.info("waooo! keep it up");
			 
		}
//		
		else if(text == "1") {
			
			 logger.info("option 1");
			 
			return "CON You have selected Option 1";
	
//			response =  "END Quit service";
//			logger.info("it working right");	
//
////			Integer resInt = Integer.parseInt(text);
////		
////			
////			String option = theHealthPro.getMyResponse(resInt);
////			
////			response = theHealthPro.addProffessionalRespose(option).concat("Quit service");
//		}
		}
		else if(text == "3") {
			
			 logger.info("option 3");
			 
			return "CON You have selected Pediatrician";
					
		}
		else if(text == "2") {
			
			 logger.info("option 2");
			 
			return "CON You have selected Gynecologist";
					
		}
		else if(text == "0") {
			
			 logger.info("option 0");
			return "END Service ended";
		}
		
//		else {
//			
////			if(theHealthPro.validateResponse(text)) {
//			
//				Integer resInt = Integer.parseInt(text);
//				
//				
//				String option = theHealthPro.getMyResponse(resInt);
//				
//				response = theHealthPro.addProffessionalRespose(option);
////			}
//		}
////	
		return response;
	}

}
