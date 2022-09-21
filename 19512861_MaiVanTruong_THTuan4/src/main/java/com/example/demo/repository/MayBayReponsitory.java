package com.example.demo.repository;

import com.example.demo.entity.MayBay;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MayBayReponsitory extends CrudRepository<MayBay, Integer> {

    @Query(value = "SELECT * FROM maybay WHERE tam_bay > 10000", nativeQuery = true)
    List<MayBay> findMayBaysByTamBay();

    @Query(value = "SELECT * FROM maybay WHERE loai LIKE 'Boeing%'", nativeQuery = true)
    List<MayBay> findMayBaysByLoaiBoeing();
}
