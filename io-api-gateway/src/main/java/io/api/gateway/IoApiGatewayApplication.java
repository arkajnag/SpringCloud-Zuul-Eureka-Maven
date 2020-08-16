package io.api.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class IoApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(IoApiGatewayApplication.class, args);
	}

}
