package service;

import entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PostMapping;
import repository.EmployeeRepository;

public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;


    private void insertFourEmployees(EmployeeRepository repository) {
        Employee employee = Employee.builder()
                .firstName("Tien")
                .lastName("Khoi")
                .email("ntk@gmail.com")
                .build();
        repository.save(employee);
    }

    @Bean
    public CommandLineRunner run(EmployeeRepository repository) {
        return (args -> {
            insertFourEmployees(repository);
            System.out.println(repository.findAll());
        });
    }
}
