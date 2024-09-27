package com.akashinde.fintech_loan;

// custom
import com.akashinde.fintech_loan.entities.UserEntity;
import com.akashinde.fintech_loan.repositories.UserRepository;
// spring framework
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
// logger
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class FintechLoanApplication {

	final static Logger logger = LoggerFactory.getLogger(FintechLoanApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(FintechLoanApplication.class, args);
	}

	@Bean
	public CommandLineRunner demoUser(UserRepository userRepository) {
		return args -> {
			// save a few users
			userRepository.save(new UserEntity("Jack", "Bauer@email.com", "jack123", "123456789", 0));
			userRepository.save(new UserEntity("Chloe", "Brian@email.com", "chloe123", "123456789", 0));
			userRepository.save(new UserEntity("Kim", "Ben@email.com", "kim123", "123456789", 0));
			userRepository.save(new UserEntity("David", "Palmer@email.com", "david123", "123456789", 0));
			userRepository.save(new UserEntity("Michelle", "Dessler@email.com", "michelle123", "123456789", 0));

			// fetch all users
			logger.info("Customers found with findAll():");
			logger.info("-------------------------------");
			userRepository.findAll().forEach(user -> {
				logger.info(user.getName());
			});
			logger.info("");

			// fetch an individual user by ID
			UserEntity user = userRepository.findById(1L);
			logger.info("User found with findById(1L):");
			logger.info("--------------------------------");
			logger.info(user.getName());
			logger.info("");

			// fetch user by name
			logger.info("User found with findByName('Chloe'):");
			logger.info("--------------------------------------------");
			userRepository.findByName("Chloe").forEach(bauer -> {
				logger.info(bauer.getName());
			});
			logger.info("");
		};
	}

}
