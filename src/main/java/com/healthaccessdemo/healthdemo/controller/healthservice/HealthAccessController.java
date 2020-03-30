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
	private String res ;
	
//	private HealthAccessService theHealthPro;

	
	
	@PostMapping("/")
	public String showUssd(@RequestParam String text, HttpServletResponse response) {
		 
		
		 response.addHeader("Content-type: text/plain", "Value-HttpServletResponse");
		 	 
		 logger.info(""+text);
		   
		if(text.equals("")) {
		
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
		
		res = text;
		
		switch(res) {
		
		 case "1": 
			 
	            return "CON Connecting you to General Doctor ->>>\n Please Hold on\n"
	            		+ "0. go to Menu"+ res;
	            
		 	case "2":
			 
			 return "CON Connecting-->>>> Pediatrician\n"
			 		+ "0. quit" + res;
			 
		case "7":
			 
			 return "End QUit Service";
			 		
			 
		default:   
	            return "Thank you"; 
		}
		
		}
		
//		else if(text.equals("1")) {
//			
////			 logger.info("option 1");
////			 
//				      return "END Connecting you to the available Doctor ->>>\n"
//				      		+ "0. Quit ";
//				 	      	
				     
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
//		}
//		
//		else if(text.equals("2")) {
//			
//			 logger.info("2");
//			 
//			return "CON You have selected Pediatrician\n"
//					+ "The available Doctor will call shortly\n"
//					+ "0. to go back";
//					
//		}
//		else if(text.equals("3")) {
//			  
//			 logger.info("option 3");
//			 
//			return " CON Cnnecting you the available Doctor ->>>>>\n"
//					+ "0. To quit";
//					
//		}
//		else if(text == "4") {
//			
//			 logger.info("option 3");
//			 
//			return "CON You have selectedi Dentistian\n"
//					+ "0. To quit";
//					
//		}
//		else if(text == "5") {
//			
//			 logger.info("option 5");
//			 
//			return "CON You have selected \n"
//					+ "0. To quit";
//					
//		}
//		
//		else if(text == "6") {
//			
//			 logger.info("option 6");
//			 
//			return "CON You have selected Neurologist\n"
//					+ "0. To quit";
//					
//		}
//		else if(text == "7") {
//			
//			 logger.info("option 3");
//			 
//			return "END Thank you.";
//					
//					
//		}
//		
//		
//		return "";
////		
////		else {
//			
////			if(theHealthPro.validateResponse(text)) {
//			
////				Integer resInt = Integer.parseInt(text);
////				
//				
////	.
//	
////		return res;
//	}
	
	
//	@GetMapping("/")
//	public String showUssd(@RequestParam String text) {
//		
//		return "";
	}


