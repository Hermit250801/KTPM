package com.example.demo.service;

import com.example.demo.entity.ChuyenBay;
import com.example.demo.repository.ChuyenBayReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChuyenBayService {
    @Autowired
    private ChuyenBayReponsitory chuyenBayReponsitory;

    public List<ChuyenBay> findChuyenBayByGaDen(String dad) {
        List<ChuyenBay> chuyenBays = chuyenBayReponsitory.findChuyenBayByGaDen("DAD");
        return (List<ChuyenBay>) chuyenBayReponsitory.saveAll(chuyenBays);
    }

    public  List<ChuyenBay> chuyenBayCau4() {
        List<ChuyenBay> chuyenBays = chuyenBayReponsitory.findChuyenBaysByDoDai();
        return (List<ChuyenBay>) chuyenBayReponsitory.saveAll(chuyenBays);
    }

    public List<ChuyenBay> chuyenBayCau5() {
        List<ChuyenBay> chuyenBays = chuyenBayReponsitory.findChuyenBaysSGNtoBMV();
        return (List<ChuyenBay>) chuyenBayReponsitory.saveAll(chuyenBays);
    }

    public List<ChuyenBay> chuyenBayCau6() {
       List<ChuyenBay> chuyenBays = chuyenBayReponsitory.findChuyenBaysBySGN();
        return (List<ChuyenBay>) chuyenBayReponsitory.saveAll(chuyenBays);
    }

    public List<ChuyenBay> chuyenBayCau13() {
        List<ChuyenBay> chuyenBays = chuyenBayReponsitory.findChuyenBayByVN280();
        return (List<ChuyenBay>) chuyenBayReponsitory.saveAll(chuyenBays);
    }

    public List<ChuyenBay> chuyenBayCau14() {
        List<ChuyenBay> chuyenBays = chuyenBayReponsitory.chuyenBayDuoCBayBoiAirbus320();
        return (List<ChuyenBay>) chuyenBayReponsitory.saveAll(chuyenBays);
    }

    public List<ChuyenBay> chuyenBayCau17() {
        List<ChuyenBay> chuyenBays = chuyenBayReponsitory.lstChuyenBayDiThang();
        return (List<ChuyenBay>) chuyenBayReponsitory.saveAll(chuyenBays);
    }

    public List<String> chuyenBayCau18() {
        List<String> chuyenBays = chuyenBayReponsitory.getGaDi();
        return chuyenBays;
    }
}
