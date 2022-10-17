package com.example._MaiVanTruong_Tuan5;

import com.example._MaiVanTruong_Tuan5.entity.ChungNhan;
import com.example._MaiVanTruong_Tuan5.entity.ChuyenBay;
import com.example._MaiVanTruong_Tuan5.entity.MayBay;
import com.example._MaiVanTruong_Tuan5.entity.NhanVien;
import com.example._MaiVanTruong_Tuan5.repository.ChungNhanReponsitory;
import com.example._MaiVanTruong_Tuan5.repository.ChuyenBayReponsitory;
import com.example._MaiVanTruong_Tuan5.repository.MayBayReponsitory;
import com.example._MaiVanTruong_Tuan5.repository.NhanVienReponsitory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.Date;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}



}
