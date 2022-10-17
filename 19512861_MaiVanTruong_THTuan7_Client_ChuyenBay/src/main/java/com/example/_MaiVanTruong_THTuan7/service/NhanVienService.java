package com.example._MaiVanTruong_THTuan7.service;


import com.example._MaiVanTruong_THTuan7.Entity.MayBay;
import com.example._MaiVanTruong_THTuan7.Entity.NhanVien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class NhanVienService {
    private RestTemplate restTemplate = new RestTemplate();

    public List<NhanVien> getNhanVienApi(String url) {
        ResponseEntity<List<NhanVien>> nhanViens;
        nhanViens = restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<NhanVien>>() {}
        );
        List<NhanVien> listNV = nhanViens.getBody();
        listNV.forEach(item -> {
            System.out.println(item);
        });return listNV;
    }

    public List<String> getNhanVienApiString(String url) {
        ResponseEntity<List<String>> nhanViens;
        nhanViens = restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<String>>() {}
        );
        List<String> listNV = nhanViens.getBody();
        listNV.forEach(item -> {
            System.out.println(item);
        });return listNV;
    }
    public List<Object[]> getNhanVienApiObj(String url) {
        ResponseEntity<List<Object[]>> nhanViens;
        nhanViens = restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Object[]>>() {}
        );
        List<Object[]> listNV = nhanViens.getBody();
        listNV.forEach(item -> {
            System.out.println(item);
        });
        return listNV;
    }


    public List<NhanVien> listNVLuongNho10000() {
        return getNhanVienApi("http://localhost:8080/luongnho10000");
    }
//
    public String listNVCau8() {
        String result = restTemplate.getForObject("http://localhost:8080/nhanviencau8", String.class);
        System.out.println(result);
        return result;
    }
//
    public List<String> listNVCau9() {
        return getNhanVienApiString("http://localhost:8080/nhanviencau9");
    }
//
    public List<NhanVien> listNVCau10() {
        return getNhanVienApi("http://localhost:8080/nhanviencau10");
    }
//
    public List<String> listNVCau12() {
        return getNhanVienApiString("http://localhost:8080/nhanviencau12");
    }
//
    public List<String> listNVCau15() {
        return getNhanVienApiString("http://localhost:8080/nhanviencau15");
    }
//
    public List<String> listNVCau22() {
        return getNhanVienApiString("http://localhost:8080/nhanviencau22");
    }
//
    public List<Object[]> listNVCau23() {
        return getNhanVienApiObj("http://localhost:8080/nhanviencau23");
    }
//
    public List<Object[]> listNVCau24() {
        return getNhanVienApiObj("http://localhost:8080/nhanviencau24");
    }
//
    public List<Object[]> listNVCau25() {
        return getNhanVienApiObj("http://localhost:8080/nhanviencau25");
    }
//
    public List<Object[]> listNVCau26() {
        return getNhanVienApiObj("http://localhost:8080/nhanviencau26");
    }
//
    public int listNVCau27() {
        Integer result = restTemplate.getForObject("http://localhost:8080/nhanviencau27", Integer.class);
        System.out.println(result);
        return result;
    }
}
