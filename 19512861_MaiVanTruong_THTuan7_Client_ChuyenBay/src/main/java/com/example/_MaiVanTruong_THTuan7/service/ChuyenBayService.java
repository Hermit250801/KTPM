package com.example._MaiVanTruong_THTuan7.service;

import com.example._MaiVanTruong_THTuan7.Entity.ChuyenBay;
import com.example._MaiVanTruong_THTuan7.Entity.MayBay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ChuyenBayService {
    private RestTemplate restTemplate = new RestTemplate();

    public List<ChuyenBay> getChuyenBayApi(String url) {
        ResponseEntity<List<ChuyenBay>> chuyenBays;
        chuyenBays = restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<ChuyenBay>>() {}
        );
        List<ChuyenBay> listChuyenBays = chuyenBays.getBody();
        listChuyenBays.forEach(item -> {
            System.out.println(item);
        });
        return listChuyenBays;
    }

    public List<String> getChuyenBayApiString(String url) {
        ResponseEntity<List<String>> chuyenBays;
        chuyenBays = restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<String>>() {}
        );
        List<String> listChuyenBays = chuyenBays.getBody();
        System.out.println(listChuyenBays);
        listChuyenBays.forEach(item -> {
            System.out.println(item);
        });
        return listChuyenBays;
    }

    public List<ChuyenBay> findChuyenBayByGaDen() {
        return getChuyenBayApi("http://localhost:8080/chuyenBayDAD");
    }

    public  List<ChuyenBay> chuyenBayCau4() {
        return getChuyenBayApi("http://localhost:8080/chuyenBayByDoDai");
    }

    public List<ChuyenBay> chuyenBayCau5() {

        return getChuyenBayApi("http://localhost:8080/chuyenBaySNGtoBMV");
    }

    public List<ChuyenBay> chuyenBayCau6() {
        return getChuyenBayApi("http://localhost:8080/chuyenBayCau6");
    }
//
    public List<ChuyenBay> chuyenBayCau13() {

        return getChuyenBayApi("http://localhost:8080/chuyenBayCau13");
    }

    public List<ChuyenBay> chuyenBayCau14() {
        return getChuyenBayApi("http://localhost:8080/chuyenBayCau14");
    }

    public List<ChuyenBay> chuyenBayCau17() {
        return getChuyenBayApi("http://localhost:8080/chuyenBayCau17");
    }

    public List<String> chuyenBayCau18() {
        return getChuyenBayApiString("http://localhost:8080/chuyenBayCau18");
    }

    public List<String> chuyenBayCau19() {
        return getChuyenBayApiString("http://localhost:8080/chuyenBayCau19");
    }

    public List<ChuyenBay> chuyenBayCau20() {
        return getChuyenBayApi("http://localhost:8080/chuyenBayCau20");
    }

    public List<ChuyenBay> chuyenBayCau21() {
        return getChuyenBayApi("http://localhost:8080/chuyenBayCau21");
    }

    public List<ChuyenBay> chuyenBayCau28() {
        return getChuyenBayApi("http://localhost:8080/chuyenBayCau28");
    }
}
