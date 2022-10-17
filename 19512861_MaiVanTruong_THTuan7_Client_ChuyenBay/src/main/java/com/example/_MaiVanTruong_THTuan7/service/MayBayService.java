package com.example._MaiVanTruong_THTuan7.service;

import com.example._MaiVanTruong_THTuan7.Entity.MayBay;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class MayBayService {
    private RestTemplate restTemplate = new RestTemplate();

    public List<MayBay> getMayBayApi(String url) {
        ResponseEntity<List<MayBay>> mayBays;
        mayBays = restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<MayBay>>() {}
        );
        List<MayBay> listMayBays = mayBays.getBody();
        listMayBays.forEach(item -> {
            System.out.println(item);
        });
        return listMayBays;
    }

    public List<Integer> getMayBayApiInteger(String url) {
        ResponseEntity<List<Integer>> mayBays;
        mayBays = restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Integer>>() {}
        );
        List<Integer> listMayBays = mayBays.getBody();
        listMayBays.forEach(item -> {
            System.out.println(item);
        });
        return listMayBays;
    }
//
    public List<MayBay> listMayBayTamBaylte10000() {
       return getMayBayApi("http://localhost:8080/maybaylte10000");
    }

    public List<MayBay> mayBayCau7() {
        return getMayBayApi("http://localhost:8080/maybaycau7");
    }
//
    public List<Integer> mayBayCau11() {
        return getMayBayApiInteger("http://localhost:8080/maybaycau11");
    }
//
    public List<String> mayBayCau16() {
        ResponseEntity<List<String>> mayBays;
        mayBays = restTemplate.exchange(
                "http://localhost:8080/maybaycau16",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<String>>() {}
        );
        List<String> listMayBays = mayBays.getBody();
        listMayBays.forEach(item -> {
            System.out.println(item);
        });
        return listMayBays;
    }
}
