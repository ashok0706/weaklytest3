package org.geekster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
	public class SendMailJavaApplication {

		public static void main(String[] args) {
			SpringApplication.run(SendMailJavaApplication.class, args);
		
        System.out.println("sending maile started");

        HandleMail mailer = new HandleMail();
        mailer.sendMail();
        
        System.out.println("maile recieved");
    }
}
