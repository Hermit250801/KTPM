package com.example.demo.controller;

import com.example.demo.entity.NhanVien;
import com.example.demo.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NhanVienController {
    @Autowired
    private NhanVienService nhanVienService;

    @GetMapping("/luongnho10000")
    public List<NhanVien> listNhanVienLuonggte10000() {
        return nhanVienService.listNVLuongNho10000();
    }

    @GetMapping("/nhanviencau8")
    public String luongNVCau8() {
        return nhanVienService.listNVCau8();
    }

    @GetMapping("/nhanviencau9")
    public List<String> luongNVCau9() {
        return nhanVienService.listNVCau9();
    }

    @GetMapping("/nhanviencau10")
    public List<NhanVien> luongNVCau10() {
        return nhanVienService.listNVCau10();
    }

    @GetMapping("/nhanviencau12")
    public List<String> nhanVienCau12() {
        return nhanVienService.listNVCau12();
    }

    @GetMapping("/nhanviencau15")
    public List<String> nhanVienCau15() {
        return nhanVienService.listNVCau15();
    }
}
