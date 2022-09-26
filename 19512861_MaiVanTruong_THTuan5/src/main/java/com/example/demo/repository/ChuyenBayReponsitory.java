package com.example.demo.repository;

import com.example.demo.entity.ChuyenBay;
import com.example.demo.entity.NhanVien;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChuyenBayReponsitory extends CrudRepository<ChuyenBay, String> {
    public List<ChuyenBay> findAllBy();
    public List<ChuyenBay> findChuyenBayByGaDen(String gaDen);
    @Query(value = "SELECT * FROM chuyenbay WHERE do_dai > 8000 and do_dai < 10000",nativeQuery = true)
    public List<ChuyenBay> findChuyenBaysByDoDai();
    @Query(value = "SELECT * FROM chuyenbay WHERE ga_di = 'SGN' and ga_den = 'BMV' ",nativeQuery = true)
    public List<ChuyenBay> findChuyenBaysSGNtoBMV();
    @Query(value = "SELECT (count(*)) FROM chuyenbay WHERE ga_di = 'SGN'",nativeQuery = true)
    public int findChuyenBayBySGN();

    @Query(value = "SELECT * FROM chuyenbay WHERE ga_di = 'SGN'",nativeQuery = true)
    public List<ChuyenBay> findChuyenBaysBySGN();

    @Query(value = "SELECT * FROM chuyenbay where do_dai < 4168", nativeQuery = true)
    List<ChuyenBay> findChuyenBayByVN280();

    @Query(value = "SELECT * FROM chuyenbay WHERE gio_di > '12:00:00'", nativeQuery = true)
    List<ChuyenBay> findChuyenBayByGioDiBefore12();

    @Query(value = "SELECT * FROM chuyenbay WHERE ga_di like ?1 and gio_di > '12:00:00'", nativeQuery = true)
    List<ChuyenBay> findChuyenBayByGaDiGioBefore12(String gaDi);


}
