package sboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Application {

	@RequestMapping("/")
	String home(){
		return "Hellorw World";
	}
	
	public static void main(String[] args) throws Exception{
		SpringApplication app = new SpringApplication(Application.class);
		app.run(args);
//		SpringApplication.run(Example.class, args);
	}
}
