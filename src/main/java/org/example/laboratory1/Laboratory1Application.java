package org.example.laboratory1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Laboratory1Application {

	public static void main(String[] args) {
		SpringApplication.run(Laboratory1Application.class, args);
	}


	@RestController


	public class HelloWorld {
		@GetMapping
		public String helloWorld() {
			return "Hello World";
		}

	}
}
