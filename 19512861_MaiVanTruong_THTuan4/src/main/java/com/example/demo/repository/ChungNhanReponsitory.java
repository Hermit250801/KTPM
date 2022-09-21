package com.example.demo.repository;

import com.example.demo.entity.ChungNhan;
import com.example.demo.entity.NhanVien;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChungNhanReponsitory extends CrudRepository<ChungNhan, Integer> {
    @Query(value = "SELECT manv FROM nhanvien JOIN chungnhan c on nhanvien.manv = c.nhanvien_manv JOIN maybay m on m.mamb = c.maybay_mamb WHERE m.loai LIKE 'Boeing%'",nativeQuery = true)
    List<String> findNhanVienBoeing();

    @Query(value = "SELECT DISTINCT manv, ten, luong FROM nhanvien " +
            "JOIN chungnhan c on nhanvien.manv = c.nhanvien_manv " +
            "JOIN maybay m on m.mamb = c.maybay_mamb WHERE m.mamb = 727",nativeQuery = true)
    List<NhanVien> findNhanVien747();
}
