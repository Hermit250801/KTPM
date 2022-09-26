package com.example.demo.controller;

import com.example.demo.entity.MayBay;
import com.example.demo.service.MayBayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MayBayController {
    @Autowired
    private MayBayService mayBayService;

    @GetMapping("/maybaylte10000")
    public List<MayBay> listMayBayLte10000() {
        return mayBayService.listMayBayTamBaylte10000();
    }

    @GetMapping("/maybaycau7")
    public List<MayBay> listMayBayCau7() {
        return mayBayService.mayBayCau7();
    }

    @GetMapping("/maybaycau11")
    public List<Integer> listMayBayCau11() {
        return mayBayService.mayBayCau11();
    }

    @GetMapping("/maybaycau16")
    public List<String> listMayBayCau16() {
        return mayBayService.mayBayCau16();
    }
}
