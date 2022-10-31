package com.rediscrud._MaiVanTruong_THTuan9_RedisCrud.entity;

import lombok.*;
import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;


@NoArgsConstructor
@AllArgsConstructor
@Data
@RedisHash("Employee")
public class Employee implements Serializable {
    @Id
    private Integer empId;
    private String empName;
    private Double empSalary;
}
