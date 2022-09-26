package com.example.demo.controller;

import com.example.demo.entity.ChuyenBay;
import com.example.demo.service.ChuyenBayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ChuyenBayController {
    @Autowired
    private ChuyenBayService chuyenBayService;

    @GetMapping("/chuyenBayDAD")
    public List<ChuyenBay> listChuyenBayDAD() {
        return chuyenBayService.findChuyenBayByGaDen("DAD");
    }

    @GetMapping("/chuyenBayByDoDai")
    public List<ChuyenBay> listChuyenBayByDoDai() {
        return chuyenBayService.chuyenBayCau4();
    }


    @GetMapping("/chuyenBaySNGtoBMV")
    public List<ChuyenBay> listChuyenBayCau5() {
        return chuyenBayService.chuyenBayCau5();
    }

    @GetMapping("/chuyenBayCau6")
    public List<ChuyenBay> listChuyenBayCau6() {
        return chuyenBayService.chuyenBayCau6();
    }
}
