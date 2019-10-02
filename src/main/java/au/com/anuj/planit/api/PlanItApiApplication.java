package au.com.anuj.planit.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import au.com.anuj.persistance.annotations.EnableCorePersistance;

@SpringBootApplication
@EnableCorePersistance
@EnableAutoConfiguration
public class PlanItApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlanItApiApplication.class, args);
	}

}
