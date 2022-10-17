package com.example._MaiVanTruong_THTuan7;

import com.example._MaiVanTruong_THTuan7.service.ChuyenBayService;
import com.example._MaiVanTruong_THTuan7.service.MayBayService;
import com.example._MaiVanTruong_THTuan7.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);
	@Autowired
	private ChuyenBayService chuyenBayService;
	@Autowired
	private MayBayService mayBayService;

	@Autowired
	private NhanVienService nhanVienService;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}


	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			chuyenBayService.chuyenBayCau20();
		};
	}

}
