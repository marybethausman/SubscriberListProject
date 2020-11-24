package com.marybeth.SubscriberList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.marybeth.SubscriberList.subscriber.Subscriber;
import com.marybeth.SubscriberList.subscriber.SubscriberRepository;


@SpringBootApplication
public class SubscriberListApplication {

	private static final Logger log = LoggerFactory.getLogger(SubscriberListApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SubscriberListApplication.class, args);
	}
	@Bean
	public CommandLineRunner demo(SubscriberRepository repository) {
		return (args) -> {
			// read all customers
			log.info("Subscribers found with findAll():");
			log.info("-------------------------------");
			for (Subscriber subscriber : repository.findAll()) {
				log.info(subscriber.toString());
			}
			log.info("");
			

			
		
		// read customers by emails with gmail
			log.info("Subscriber found with findByUserNameContains('gmail'):");
			log.info("--------------------------------------------");
			repository.findByUserNameContains("gmail").forEach(bauer -> {
				log.info(bauer.toString());
			});
				
			log.info("");
				
	
		};
		}
	}

