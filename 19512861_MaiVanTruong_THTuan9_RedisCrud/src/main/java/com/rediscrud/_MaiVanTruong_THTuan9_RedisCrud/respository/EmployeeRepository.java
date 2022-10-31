package com.rediscrud._MaiVanTruong_THTuan9_RedisCrud.respository;

import com.rediscrud._MaiVanTruong_THTuan9_RedisCrud.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Repository
public class  EmployeeRepository {
    public static final String HASH_KEY = "Product";
    @Autowired
    private RedisTemplate template;

    public Employee save(Employee employee){
        template.opsForHash().put(HASH_KEY,employee.getEmpId(),employee);
        return employee;
    }

    public List<Employee> findAll(){
        return template.opsForHash().values(HASH_KEY);
    }

    public Employee findEmployeeById(int id){
        return (Employee) template.opsForHash().get(HASH_KEY,id);
    }


    public String deleteEmployee(int id){
        template.opsForHash().delete(HASH_KEY,id);
        return "employee removed !!";
    }


}
