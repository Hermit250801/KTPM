package com.example.demo;

import com.example.demo.repository.MayBayReponsitory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@DataJpaTest
public class MayBayReponsitoryTests {
    @Autowired
    private MayBayReponsitory mayBayReponsitory;

    @Test
    public void testCau2() {
        System.out.println(mayBayReponsitory.findMayBaysByTamBay());
    }

    @Test
    public void testCau7() {
        System.out.println(mayBayReponsitory.findMayBaysByLoaiBoeing());
    }
}
