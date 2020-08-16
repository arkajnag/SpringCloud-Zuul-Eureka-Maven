package io.car.service;

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
@RequestMapping("/rest/car")
public class IoCarServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(IoCarServiceApplication.class, args);
	}

	@GetMapping(value="/start",produces = "application/json")
	public String startCar() {
		return "Started Car Service in Thread:"+Thread.currentThread().getName()+" at time:"+LocalDateTime.now();
	}
	
	
	@GetMapping(value="/stop",produces = "application/json")
	public String stopCar() {
		return "Stopped Car Service in Thread:"+Thread.currentThread().getName()+" at time:"+LocalDateTime.now();
	}
}
