package repository;

import entity.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    List<Employee> findEmployeeById(long id);
    List<Employee> findEmployeeByLastName(String lastName);
}
