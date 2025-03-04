package com.bridgelabz.addressbookappdevelopment.addressbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@SpringBootApplication
public class AddressbookApplication {
	public static void main(String[] args) {
		log.info("Starting Application.......");
		SpringApplication.run(AddressbookApplication.class, args);
		log.info("Application in process.......");
	}

}
