package com.example.demo;

import com.example.demo.entity.ChuyenBay;
import com.example.demo.repository.ChuyenBayReponsitory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureDataJpa;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@RunWith(SpringRunner.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@DataJpaTest
public class ChuyenBayReponsitoryTests {
    @Autowired
    private ChuyenBayReponsitory chuyenBayReponsitory;

    @Test
    public void findAll() {
        System.out.println(chuyenBayReponsitory.findAll());
    }

    @Test
    public void testCau1() {
        System.out.println(chuyenBayReponsitory.findChuyenBayByGaDen("DAD"));
    }

    @Test
    public void testCau4() {
        System.out.println(chuyenBayReponsitory.findChuyenBaysByDoDai());
    }
    @Test
    public void testCau5() {
        System.out.println(chuyenBayReponsitory.findChuyenBaysSGNtoBMV());
    }

    @Test
    public void testCau6() {
        System.out.println(chuyenBayReponsitory.findChuyenBayBySGN());
    }


    @Test
    public void testCau14() {
        System.out.println(chuyenBayReponsitory.findChuyenBayByVN280());
    }

    @Test
    public void testCau17() {
        System.out.println(chuyenBayReponsitory.lstChuyenBayDiThang());
    }

    @Test
    public void testCau18() {
        System.out.println(chuyenBayReponsitory.getGaDi());
    }

    @Test
    public void testCau19() {
        System.out.println(chuyenBayReponsitory.lstTongChiPhi());
    }

    @Test
    public void testCau20() {
        System.out.println(chuyenBayReponsitory.findChuyenBayByGioDiBefore12());
    }

    @Test
    public void testCau21() {

        System.out.println("Ga Đi SGN: \n" + chuyenBayReponsitory.findChuyenBayByGaDiGioBefore12("SGN"));
        System.out.println("Ga Đi HAN: \n" + chuyenBayReponsitory.findChuyenBayByGaDiGioBefore12("HAN"));
        System.out.println("Ga Đi DAD: \n" + chuyenBayReponsitory.findChuyenBayByGaDiGioBefore12("DAD"));
        System.out.println("Ga Đi VII: \n" + chuyenBayReponsitory.findChuyenBayByGaDiGioBefore12("VII"));
        System.out.println("Ga Đi PXU: \n" + chuyenBayReponsitory.findChuyenBayByGaDiGioBefore12("PXU"));
        System.out.println("Ga Đi UIH: \n" + chuyenBayReponsitory.findChuyenBayByGaDiGioBefore12("UIH"));
    }

    @Test
    public void testCau28() {
        System.out.println(chuyenBayReponsitory.lstChuyenBayBayBangBoeing());
    }
}
