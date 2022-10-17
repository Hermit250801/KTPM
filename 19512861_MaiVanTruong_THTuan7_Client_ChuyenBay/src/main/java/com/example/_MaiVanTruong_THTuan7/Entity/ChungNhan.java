package com.example._MaiVanTruong_THTuan7.Entity;

import lombok.*;


@NoArgsConstructor
@ToString(exclude = "MayBay, NhanVien")
@Data
@AllArgsConstructor
@Builder
public class ChungNhan {
    private int id;


    private NhanVien maNV;


    private MayBay maMB;

}
