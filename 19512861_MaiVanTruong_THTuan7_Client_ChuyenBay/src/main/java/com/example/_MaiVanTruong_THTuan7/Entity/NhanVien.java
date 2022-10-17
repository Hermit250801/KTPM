package com.example._MaiVanTruong_THTuan7.Entity;

import lombok.*;



@NoArgsConstructor
@ToString
@Data
@AllArgsConstructor
@Builder
public class NhanVien {
    private String maNV;
    private String tenNV;
    private Integer luongNV;

    @Override
    public String toString() {
        return "NhanVien{" +
                "maNV='" + maNV + '\'' +
                ", tenNV='" + tenNV + '\'' +
                ", luongNV=" + luongNV +
                '}' + "\n";
    }
}
