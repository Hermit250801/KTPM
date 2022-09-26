package com.example.demo;

import com.example.demo.repository.ChungNhanReponsitory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@DataJpaTest
public class ChungNhanTests {
    @Autowired
    private ChungNhanReponsitory chungNhanReponsitory;

    @Test
    public void testCau9() {
        System.out.println(chungNhanReponsitory.findNhanVienBoeing());
    }

}
