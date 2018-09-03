package com.xvhx.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HttpSessionReplicationHazelcastDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HttpSessionReplicationHazelcastDemoApplication.class, args);
	}

	@Value("${server.port}")
	private String port;

	@GetMapping
	public String index() {
		return "hello from : " + port;
	}
}
