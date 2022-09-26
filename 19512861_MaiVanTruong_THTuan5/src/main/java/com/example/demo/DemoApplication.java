package com.example.demo;

import com.example.demo.entity.ChungNhan;
import com.example.demo.entity.ChuyenBay;
import com.example.demo.entity.MayBay;
import com.example.demo.entity.NhanVien;
import com.example.demo.repository.ChungNhanReponsitory;
import com.example.demo.repository.ChuyenBayReponsitory;
import com.example.demo.repository.MayBayReponsitory;
import com.example.demo.repository.NhanVienReponsitory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	private void insertChuyenBay(ChuyenBayReponsitory reponsitory) {
//		reponsitory.save(new ChuyenBay("VN269", "HAN", "CXR", 1262, "14:10:00", "15:50:00", 202));
//		reponsitory.save(new ChuyenBay("VN276", "DAD", "CXR", 1283, "09:00:00", "12:00:00", 203));
//		reponsitory.save(new ChuyenBay("VN280", "SGN", "HPH", 11979, "06:00:00", "08:00:00", 1279));
//		reponsitory.save(new ChuyenBay("VN315", "HAN", "DAD", 134, "11:45:00", "13:00:00", 112));
//		reponsitory.save(new ChuyenBay("VN317", "HAN", "UIH", 827, "15:00:00", "16:15:00", 190));
//		reponsitory.save(new ChuyenBay("VN320", "SGN", "DAD", 2798, "06:00:00", "07:10:00", 221));
//		reponsitory.save(new ChuyenBay("VN338", "SGN", "BMV", 4081, "15:25:00", "16:25:00", 375));
//		reponsitory.save(new ChuyenBay("VN374", "HAN", "VII", 510, "11:40:00", "13:25:00", 120));
//		reponsitory.save(new ChuyenBay("VN375", "VII", "CXR", 752, "14:15:00", "16:00:00", 181));
//		reponsitory.save(new ChuyenBay("VN431", "SGN", "CAH", 3693, "05:55:00", "06:55:00", 236));
//		reponsitory.save(new ChuyenBay("VN440", "SGN", "BMV", 4081, "18:30:00", "19:30:00", 426));
//		reponsitory.save(new ChuyenBay("VN464", "SGN", "DLI", 2002, "07:20:00", "08:05:00", 225));
//		reponsitory.save(new ChuyenBay("VN474", "PXU", "PQC", 1586, "08:40:00", "11:20:00", 102));
//		reponsitory.save(new ChuyenBay("VN476", "UIH", "PQC", 485, "09:15:00", "11:50:00", 117));
//		reponsitory.save(new ChuyenBay("VN651", "DAD", "SGN", 2798, "19:30:00", "08:00:00", 221));
//		reponsitory.save(new ChuyenBay("VN741", "HAN", "PXU", 395, "06:30:00", "08:30:00", 120));
//	}
	private void insertNhanVien(NhanVienReponsitory reponsitory) {
		reponsitory.save(new NhanVien("011564812", "Ton Van Quy", 153972));
		reponsitory.save(new NhanVien("141582651", "Doan Thi Mai", 178345));
		reponsitory.save(new NhanVien("142519864", "Nguyen Thi Xuan Dao", 227489));
		reponsitory.save(new NhanVien("159542516", "Le Van Ky", 48250));
		reponsitory.save(new NhanVien("242518965", "Tran Van Son", 120433));
		reponsitory.save(new NhanVien("248965255", "Tran Thi Ba", 43723));
		reponsitory.save(new NhanVien("254099823", "Nguyen Thi Quynh", 24450));
		reponsitory.save(new NhanVien("269734834", "Truong Tuan Anh", 289950));
		reponsitory.save(new NhanVien("274878974", "Mai Quoc Minh", 99890));
		reponsitory.save(new NhanVien("287321212", "Duong Van Minh", 48090));
		reponsitory.save(new NhanVien("310454876", "Ta Van Do", 212156));
		reponsitory.save(new NhanVien("310454877", "Tran Van Hao", 33546));
		reponsitory.save(new NhanVien("348121549", "Nguyen Van Thanh", 32899));
		reponsitory.save(new NhanVien("355548984", "Tran Thi Hoai An", 212156));
		reponsitory.save(new NhanVien("356187925", "Nguyen Vinh Bao", 44740));
		reponsitory.save(new NhanVien("390487451", "Le Van Luat", 212156));
		reponsitory.save(new NhanVien("489221823", "Bui Quoc Chinh", 23980));
		reponsitory.save(new NhanVien("489456522", "Nguyen Thi Quy Linh", 127984));
		reponsitory.save(new NhanVien("548977562", "Le Van Quy", 84476));
		reponsitory.save(new NhanVien("550156548", "Nguyen Thi Cam", 205187));
		reponsitory.save(new NhanVien("552455318", "La Que", 101745));
		reponsitory.save(new NhanVien("552455348", "Bui Thi Dung", 92013));
		reponsitory.save(new NhanVien("567354612", "Quan Cam Ly", 256481));
		reponsitory.save(new NhanVien("574489457", "Dui Van Lap", 20));
	}

	private void insertMayBay(MayBayReponsitory reponsitory) {
		reponsitory.save(new MayBay(154, "Tupolev 154", 6565));
		reponsitory.save(new MayBay(319, "Airbus A319", 2888));
		reponsitory.save(new MayBay(320, "Airbus A320", 4168));
		reponsitory.save(new MayBay(340, "Airbus A340 - 300", 11392));
		reponsitory.save(new MayBay(727, "Boeing 727", 2406));
		reponsitory.save(new MayBay(737, "Boeing 737 - 800", 5413));
		reponsitory.save(new MayBay(747, "Boeing 747 - 400", 13488));
		reponsitory.save(new MayBay(757, "Boeing 757 - 300", 6416));
		reponsitory.save(new MayBay(767, "Boeing 767 - 400ER", 10360));
		reponsitory.save(new MayBay(777, "Boeing 777 - 300", 10306));
	}

	private void insertChungNhan(ChungNhanReponsitory reponsitory) {
		NhanVien nhanVien1 = NhanVien.builder().maNV("269734834").build();
		NhanVien nhanVien2 = NhanVien.builder().maNV("310454876").build();
		NhanVien nhanVien3 = NhanVien.builder().maNV("355548984").build();
		NhanVien nhanVien4 = NhanVien.builder().maNV("574489457").build();
		NhanVien nhanVien5 = NhanVien.builder().maNV("390487451").build();
		NhanVien nhanVien6 = NhanVien.builder().maNV("552455318").build();
		NhanVien nhanVien7 = NhanVien.builder().maNV("142519864").build();
		NhanVien nhanVien8 = NhanVien.builder().maNV("567354612").build();
		NhanVien nhanVien9 = NhanVien.builder().maNV("011564812").build();
		NhanVien nhanVien10 = NhanVien.builder().maNV("141582651").build();
		NhanVien nhanVien11 = NhanVien.builder().maNV("242518965").build();
		NhanVien nhanVien12 = NhanVien.builder().maNV("274878974").build();

		MayBay mayBay1 = MayBay.builder().maMB(154).build();
		MayBay mayBay2 = MayBay.builder().maMB(319).build();
		MayBay mayBay3 = MayBay.builder().maMB(320).build();
		MayBay mayBay4 = MayBay.builder().maMB(340).build();
		MayBay mayBay5 = MayBay.builder().maMB(727).build();
		MayBay mayBay6 = MayBay.builder().maMB(737).build();
		MayBay mayBay7 = MayBay.builder().maMB(747).build();
		MayBay mayBay8 = MayBay.builder().maMB(757).build();
		MayBay mayBay9 = MayBay.builder().maMB(767).build();
		MayBay mayBay10 = MayBay.builder().maMB(777).build();

		reponsitory.save(ChungNhan.builder().maNV(nhanVien1).maMB(mayBay1).build());
		reponsitory.save(ChungNhan.builder().maNV(nhanVien2).maMB(mayBay1).build());
		reponsitory.save(ChungNhan.builder().maNV(nhanVien3).maMB(mayBay1).build());
		reponsitory.save(ChungNhan.builder().maNV(nhanVien4).maMB(mayBay1).build());

		reponsitory.save(ChungNhan.builder().maNV(nhanVien1).maMB(mayBay2).build());
		reponsitory.save(ChungNhan.builder().maNV(nhanVien5).maMB(mayBay2).build());
		reponsitory.save(ChungNhan.builder().maNV(nhanVien6).maMB(mayBay2).build());
		reponsitory.save(ChungNhan.builder().maNV(nhanVien7).maMB(mayBay3).build());

		reponsitory.save(ChungNhan.builder().maNV(nhanVien1).maMB(mayBay3).build());
		reponsitory.save(ChungNhan.builder().maNV(nhanVien5).maMB(mayBay3).build());
		reponsitory.save(ChungNhan.builder().maNV(nhanVien6).maMB(mayBay3).build());

		reponsitory.save(ChungNhan.builder().maNV(nhanVien7).maMB(mayBay4).build());
		reponsitory.save(ChungNhan.builder().maNV(nhanVien1).maMB(mayBay4).build());
		reponsitory.save(ChungNhan.builder().maNV(nhanVien5).maMB(mayBay4).build());
		reponsitory.save(ChungNhan.builder().maNV(nhanVien8).maMB(mayBay4).build());

		reponsitory.save(ChungNhan.builder().maNV(nhanVien1).maMB(mayBay5).build());
		reponsitory.save(ChungNhan.builder().maNV(nhanVien8).maMB(mayBay5).build());

		reponsitory.save(ChungNhan.builder().maNV(nhanVien9).maMB(mayBay6).build());
		reponsitory.save(ChungNhan.builder().maNV(nhanVien10).maMB(mayBay6).build());
		reponsitory.save(ChungNhan.builder().maNV(nhanVien7).maMB(mayBay6).build());
		reponsitory.save(ChungNhan.builder().maNV(nhanVien11).maMB(mayBay6).build());
		reponsitory.save(ChungNhan.builder().maNV(nhanVien1).maMB(mayBay6).build());
		reponsitory.save(ChungNhan.builder().maNV(nhanVien6).maMB(mayBay6).build());
		reponsitory.save(ChungNhan.builder().maNV(nhanVien8).maMB(mayBay6).build());

		reponsitory.save(ChungNhan.builder().maNV(nhanVien7).maMB(mayBay7).build());
		reponsitory.save(ChungNhan.builder().maNV(nhanVien1).maMB(mayBay7).build());
		reponsitory.save(ChungNhan.builder().maNV(nhanVien8).maMB(mayBay7).build());

		reponsitory.save(ChungNhan.builder().maNV(nhanVien9).maMB(mayBay8).build());
		reponsitory.save(ChungNhan.builder().maNV(nhanVien10).maMB(mayBay8).build());
		reponsitory.save(ChungNhan.builder().maNV(nhanVien7).maMB(mayBay8).build());
		reponsitory.save(ChungNhan.builder().maNV(nhanVien11).maMB(mayBay8).build());
		reponsitory.save(ChungNhan.builder().maNV(nhanVien1).maMB(mayBay8).build());
		reponsitory.save(ChungNhan.builder().maNV(nhanVien12).maMB(mayBay8).build());
		reponsitory.save(ChungNhan.builder().maNV(nhanVien8).maMB(mayBay8).build());

		reponsitory.save(ChungNhan.builder().maNV(nhanVien10).maMB(mayBay9).build());
		reponsitory.save(ChungNhan.builder().maNV(nhanVien7).maMB(mayBay9).build());
		reponsitory.save(ChungNhan.builder().maNV(nhanVien1).maMB(mayBay9).build());
		reponsitory.save(ChungNhan.builder().maNV(nhanVien12).maMB(mayBay9).build());
		reponsitory.save(ChungNhan.builder().maNV(nhanVien6).maMB(mayBay9).build());
		reponsitory.save(ChungNhan.builder().maNV(nhanVien8).maMB(mayBay9).build());
		reponsitory.save(ChungNhan.builder().maNV(nhanVien8).maMB(mayBay9).build());

		reponsitory.save(ChungNhan.builder().maNV(nhanVien7).maMB(mayBay10).build());
		reponsitory.save(ChungNhan.builder().maNV(nhanVien1).maMB(mayBay10).build());
		reponsitory.save(ChungNhan.builder().maNV(nhanVien8).maMB(mayBay10).build());
	}

//	@Bean
//	public CommandLineRunner run(ChungNhanReponsitory reponsitory) {
//		return (args -> {
//			insertChungNhan(reponsitory);
//			System.out.println(reponsitory.findAll());
//		});
//	}



}
