package com.example.demo;

import com.example.demo.repository.ChuyenBayReponsitory;
import com.example.demo.repository.NhanVienReponsitory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@DataJpaTest
public class NhanVienReponsitoryTests {
    @Autowired
    private NhanVienReponsitory nhanVienReponsitory;

    @Test
    public void findAllNhanVien() {
        System.out.println(nhanVienReponsitory.findAll());
    }

    @Test
    public void findNhanViensByLuong() {
        System.out.println(nhanVienReponsitory.findNhanViensByLuongNV());
    }
    @Test
    public void testCau8() {
        System.out.println(nhanVienReponsitory.findTongSoLuongPhaiTraNV());
    }

    @Test
    public void testCau10() {
        System.out.println(nhanVienReponsitory.findNhanVien747());
    }

    @Test
    public void testCau11() {
        System.out.println(nhanVienReponsitory.findNhanVienBoeingAndAirbus());
    }

    @Test
    public void testCau15() {
        System.out.println(nhanVienReponsitory.findNhanVienBoeing());
    }

    @Test
    public void testCau22() {
        System.out.println(nhanVienReponsitory.lstMaNVChiLaiDuoc3LoaiMB());
    }

    @Test
    public void testCau23() {
        System.out.println(nhanVienReponsitory.lstNhanVienLaiHon3LoaiMB());
    }

    @Test
    public void testCau24() {
        System.out.println(nhanVienReponsitory.lstMaNVVaTongLoaiMB());
    }
    @Test
    public void testCau25() {
        System.out.println(nhanVienReponsitory.lstNhanVienKhongPhaiPhiCong());
    }

    @Test
    public void testCau26() {
        System.out.println(nhanVienReponsitory.getMaNVCoLuongCaoNhat());
    }

    @Test
    public void testCau27() {
        System.out.println(nhanVienReponsitory.getTongLuongPhiCong());
    }

}
