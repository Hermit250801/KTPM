package com.example.demo.service;

import com.example.demo.entity.NhanVien;
import com.example.demo.repository.NhanVienReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhanVienService {
    @Autowired
    private NhanVienReponsitory nhanVienReponsitory;

    public List<NhanVien> listNVLuongNho10000() {
        List<NhanVien> nhanVienList = nhanVienReponsitory.findNhanViensByLuongNV();
        return (List<NhanVien>) nhanVienReponsitory.saveAll(nhanVienList);
    }

    public String listNVCau8() {
        long luong = nhanVienReponsitory.findTongSoLuongPhaiTraNV();
        return "Tổng số lương phải trả cho nhân viên là: " + luong;
    }

    public List<String> listNVCau9() {
        List<String> maNV = nhanVienReponsitory.maNhanVienBoeing();
        return maNV;
    }

    public List<NhanVien> listNVCau10() {
        List<NhanVien> listNhanVien = nhanVienReponsitory.findNhanVien747();
        return listNhanVien;
    }

    public List<String> listNVCau12() {
        List<String> listNhanVien = nhanVienReponsitory.findNhanVienBoeingAndAirbus();
        return listNhanVien;
    }

    public List<String> listNVCau15() {
        List<String> listNhanVien = nhanVienReponsitory.findNhanVienBoeing();
        return listNhanVien;
    }

    public List<String> listNVCau22() {
        List<String> listNhanVien = nhanVienReponsitory.lstMaNVChiLaiDuoc3LoaiMB();
        return listNhanVien;
    }

    public List<Object[]> listNVCau23() {
        List<Object[]> listNhanVien = nhanVienReponsitory.lstNhanVienLaiHon3LoaiMB();
        return listNhanVien;
    }

    public List<Object[]> listNVCau24() {
        List<Object[]> listNhanVien = nhanVienReponsitory.lstMaNVVaTongLoaiMB();
        return listNhanVien;
    }

    public List<Object[]> listNVCau25() {
        List<Object[]> listNhanVien = nhanVienReponsitory.lstNhanVienKhongPhaiPhiCong();
        return listNhanVien;
    }

    public List<Object[]> listNVCau26() {
        List<Object[]> listNhanVien = nhanVienReponsitory.getMaNVCoLuongCaoNhat();
        return listNhanVien;
    }

    public int listNVCau27() {
       int listNhanVien = nhanVienReponsitory.getTongLuongPhiCong();
       return listNhanVien;
    }
}
