package com.healthaccessdemo.healthdemo.controller.healthservice;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
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
	
	private HealthAccessService theHealthPro;
	private String message = " ";
	
	
	@PostMapping("/")
	public String showUssd(@RequestParam String text, HttpServletResponse response) {
		 
		response.addHeader("Content-type: text/plain", "Value-HttpServletResponse");
		 
		 String res;
		 
		   
		if(text.equals("")) {
		
		 logger.info("empty");

			 return "CON Welcome to Old Mutual MumTribe,\n Which of our service do need? \n"
//			 		+ "1. Register\n"
			 		+ "1. Menu\n";
//			 		+ "3. About Us\n";
			 		
//			 logger.info("waooo! keep it up");
			 
		}		
		
		else if(text.equals("1")) {
			
//			 logger.info("option 1");
				      return "CON Welcome to MumTribe 24/7 access to Health professionals\n Select your Doctor: \n"
				        + "1.  General Doctor\n"
				 		+ "2. Pediatrician\n"
				 		+ "3. Gynecologist\n"
				 		+ "4. Dentistian\n"
				 		+ "5. Optician\n"
				 		+ "6. Neurologist \n"
				 		+ "7. Quit Service";
				 
		}    
				      else if(text.equals("2")) {
							
//							 logger.info("option 1");
								      return  " END Please hold while Connecting you to General Doctor ->>>>\n"
								    	  		+ "0. to quit";
						
								      
//								      if(text.equals("1")) {
//								    	  
//								    	  return "Please hold while Connecting you to General Doctor ->>>>\n"
//								    	  		+ "0. to quit";
//								      }
						
				      
//			response =  "END Quit service";
////			logger.info("it working right");	
////
//////			Integer resInt = Integer.parseInt(text);
//////		
//////			
//////			String option = theHealthPro.getMyResponse(resInt);
//////			
//////			response = theHealthPro.addProffessionalRespose(option).concat("Quit service");
////		}
								      
		}
		else if(text.equals("2")) {
			
			 logger.info("option 2");
			 
			return "CON You have selected Pediatrician\n"
					+ "1. call the available Doctor\n"
					+ "0. to go back";
					
		}
		else if(text.equals("3")) {
			
			 logger.info("option 3");
			 
			return "END Please hold while Connecting you to General Doctor ->>>>";
					
		}
		else if(text == "0") {
			
			 logger.info("option 0");
			return "END Service ended";
		}
		return "";
//		
//		else {
			
//			if(theHealthPro.validateResponse(text)) {
			
//				Integer resInt = Integer.parseInt(text);
//				
				
//	.
	
//		return res;

		 	}
	
	
//	@GetMapping("/")
//	public String showUssd(@RequestParam String text) {
//		
//		return "";
	


	}
