package com.rediscrud._MaiVanTruong_THTuan9_RedisCrud;

import com.rediscrud._MaiVanTruong_THTuan9_RedisCrud.entity.Employee;
import com.rediscrud._MaiVanTruong_THTuan9_RedisCrud.respository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/employee")
public class Application {
	private final Logger LOG = LoggerFactory.getLogger(getClass());

	@Autowired
	private EmployeeRepository dao;

	@PostMapping
	public Employee save(@RequestBody Employee employee) {
		return dao.save(employee);
	}

	@GetMapping
	public List<Employee> getAllEmployees() {
		return dao.findAll();
	}

	@GetMapping("/{id}")
	public Employee findEmployee(@PathVariable int id) {
		return dao.findEmployeeById(id);
	}
	@DeleteMapping("/{id}")
	public String remove(@PathVariable int id)   {
		return dao.deleteEmployee(id);
	}


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


}
