package samplewebapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class FirstController {
	
	@RequestMapping("/test")
	@ResponseBody
	public String home() {
		return "Hurry my first controller";
		
	}
	
	
	public static void main(String [] args) {
		SpringApplication.run(FirstController.class, args);
		
	}
	
	

}
