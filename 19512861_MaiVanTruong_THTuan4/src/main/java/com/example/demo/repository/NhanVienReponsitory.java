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
    public long findTongSoLuongPhaiTraNV();
    @Query(value = "SELECT DISTINCT manv, ten, luong FROM nhanvien " +
            "JOIN chungnhan c on nhanvien.manv = c.nhanvien_manv " +
            "JOIN maybay m on m.mamb = c.maybay_mamb WHERE m.mamb = 727",nativeQuery = true)
    List<NhanVien> findNhanVien747();

    @Query(value = "select DISTINCT manv from nhanvien nv\n" +
            "            join chungnhan c on nv.manv = c.nhanvien_manv\n" +
            "            join maybay m on m.mamb = c.maybay_mamb\n" +
            "            where m.loai like 'Boeing%'", nativeQuery = true)
    public List<String> maNhanVienBoeing();

    @Query(value = "SELECT distinct manv FROM nhanvien\n" +
            "                  JOIN chungnhan c on nhanvien.manv = c.nhanvien_manv\n" +
            "                  JOIN maybay m on m.mamb = c.maybay_mamb\n" +
            "WHERE nhanvien.manv IN (SELECT nhanvien_manv FROM chungnhan\n" +
            "                                               JOIN maybay m2 on m2.mamb = chungnhan.maybay_mamb\n" +
            "                                               where m2.loai LIKE 'Boeing%')\n" +
            "    AND nhanvien.manv IN (SELECT nhanvien_manv FROM chungnhan\n" +
            "                                                        JOIN maybay m2 on m2.mamb = chungnhan.maybay_mamb\n" +
            "                          where m2.loai LIKE 'Airbus%')",nativeQuery = true)
    List<String> findNhanVienBoeingAndAirbus();

    @Query(value = "SELECT DISTINCT TEN FROM nhanvien\n" +
            "    JOIN chungnhan c on nhanvien.manv = c.nhanvien_manv\n" +
            "    JOIN maybay m on m.mamb = c.maybay_mamb\n" +
            "WHERE nhanvien.manv IN (SELECT chungnhan.nhanvien_manv FROM chungnhan JOIN\n" +
            " maybay m2 on m2.mamb = chungnhan.maybay_mamb\n" +
            " WHERE m2.loai LIKE 'Boeing%')",nativeQuery = true)
    List<String> findNhanVienBoeing();

    @Query(value = "select manv from nhanvien\n" +
            "    join chungnhan c on nhanvien.manv = c.nhanvien_manv\n" +
            "    join maybay m on m.mamb = c.maybay_mamb\n" +
            "group by nhanvien.manv having COUNT(m.loai) = 3",nativeQuery = true)
    public List<String> lstMaNVChiLaiDuoc3LoaiMB();
    @Query(value = "select nv.manv, count(loai) from nhanvien nv\n" +
            "        join chungnhan c on nv.MaNV = c.nhanvien_manv\n" +
            "        join maybay m on m.mamb = c.maybay_mamb\n" +
            "        group by nv.MaNV", nativeQuery = true)
    public List<String> lstMaNVVaTongLoaiMB();

    @Query(value = "select nv.manv, max(tam_bay) from nhanvien nv\n" +
            "    join chungnhan c on nv.MaNV = c.nhanvien_manv\n" +
            "    join maybay m on m.MaMB = c.maybay_mamb\n" +
            "    group by nv.MaNV\n" +
            "    having count(m.Loai) >= 3",nativeQuery = true)
    public List<String> lstNhanVienLaiHon3LoaiMB();

    @Query(value = "select  manv,ten from nhanvien\n" +
            "        where manv not in (select nhanvien_manv from chungnhan)",nativeQuery = true)
    public List<String> lstNhanVienKhongPhaiPhiCong();

    @Query(value = "select manv,ten,luong\n" +
            "    from nhanvien where luong in (select MAX(luong) from nhanvien)",nativeQuery = true)
    public List<String> getMaNVCoLuongCaoNhat();

    @Query(value = "select SUM(luong) from nhanvien\n" +
            "            where manv in (select nhanvien_manv from chungnhan)",nativeQuery = true)
    public int getTongLuongPhiCong();

}
