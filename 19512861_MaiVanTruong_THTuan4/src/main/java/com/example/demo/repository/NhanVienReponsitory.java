package com.example.demo.repository;

import com.example.demo.entity.NhanVien;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface NhanVienReponsitory extends CrudRepository<NhanVien, String> {
    public List<NhanVien> findAll();
    @Query(value = "SELECT * FROM nhanvien where Luong < 10000", nativeQuery = true)
    public List<NhanVien> findNhanViensByLuongNV();
    @Query(value = "SELECT SUM(luong) as TongSoLuongPhaiTra FROM nhanvien", nativeQuery = true)
    public int findTongSoLuongPhaiTraNV();
    @Query(value = "SELECT DISTINCT manv, ten, luong FROM nhanvien " +
            "JOIN chungnhan c on nhanvien.manv = c.nhanvien_manv " +
            "JOIN maybay m on m.mamb = c.maybay_mamb WHERE m.mamb = 727",nativeQuery = true)
    List<NhanVien> findNhanVien747();

}
