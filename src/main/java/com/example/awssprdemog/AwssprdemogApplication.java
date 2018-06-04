package com.example.awssprdemog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class AwssprdemogApplication {

	public static void main(final String[] args) {
		SpringApplication.run(AwssprdemogApplication.class, args);
	}
}
