package io.user.service;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
@RequestMapping("/rest/user")
public class IoUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(IoUserServiceApplication.class, args);
	}
	
	@GetMapping(value="/hello",produces = "application/json")
	public String startCar() {
		return "Saying Hi to User Service in Thread:"+Thread.currentThread().getName()+" at time:"+LocalDateTime.now();
	}
	
	
	@GetMapping(value="/bye",produces = "application/json")
	public String stopCar() {
		return "Saying Bye to User Service in Thread:"+Thread.currentThread().getName()+" at time:"+LocalDateTime.now();
	}

}
