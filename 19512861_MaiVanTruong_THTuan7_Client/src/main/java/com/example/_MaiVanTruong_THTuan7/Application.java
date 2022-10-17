package com.example._MaiVanTruong_THTuan7;

import com.example._MaiVanTruong_THTuan7.Entity.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("Hello World!!");
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	public void registerUser() {
		User user = User.builder()
				.userName("maitruong")
				.firstName("Mai")
				.lastName("Trường")
				.password("maitruong")
				.build();
		RestTemplate myRestTemplate = new RestTemplate();
		ResponseEntity<User> user2 = myRestTemplate.postForEntity("http://localhost:8080/register",
																user,User.class);
		User myUser = user2.getBody();
		System.out.println(myUser.toString());

	}

	public void loginUser() {
		User user = User.builder()
				.userName("maitruong")
				.password("maitruong")
				.build();
		RestTemplate myRestTemplate = new RestTemplate();
		ResponseEntity<User> user2 = myRestTemplate.postForEntity("http://localhost:8080/login",
				user,User.class);
		User myUser = user2.getBody();
		System.out.println(myUser.toString());

	}


	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
//			HttpHeaders headers = new HttpHeaders();
//			headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//			HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
//			ResponseEntity<List<ChuyenBay>> chuyenBays =
//					restTemplate.exchange(
//							"http://localhost:8080/chuyenBaySNGtoBMV",
//							HttpMethod.GET,
//							null,
//							new ParameterizedTypeReference<List<ChuyenBay>>() {}
//					);
//			//ChuyenBay[] listChuyenBays = chuyenBays.getBody();
//			List<ChuyenBay> listChuyenBays = chuyenBays.getBody();
//			listChuyenBays.forEach(item -> {
//				System.out.println(item);
//			});
			//registerUser();
			loginUser();
		};
	}

}
