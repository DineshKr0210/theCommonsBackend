package be.theCommons.consumerApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ConsumerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerAppApplication.class, args);
	}

}
