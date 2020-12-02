package me.eminem.demoRSO;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoRsoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoRsoApplication.class, args);
		System.out.println("Pozdrav, aplikacija se je zaštartala");
	}

}
