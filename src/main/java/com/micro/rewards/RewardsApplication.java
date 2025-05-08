package com.micro.rewards;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RewardsApplication {

	public static void main(String[] args) {
		SpringApplicationBuilder builder = new SpringApplicationBuilder(RewardsApplication.class);

		builder.headless(false);
		ConfigurableApplicationContext context = builder.run(args);
		//SpringApplication.run(RewardsApplication.class, args);

	}

	@Bean
	public CommandLineRunner run() {
		return args -> {
			System.out.println("Application started successfully!");
		};
	}

}
