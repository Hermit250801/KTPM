package com.example.demo.entity;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@ToString
@Entity
@Data
@AllArgsConstructor
@Builder
@Embeddable
@Table(name = "nhanvien")
public class NhanVien {
    @Id
    @Column(name = "manv")
    private String maNV;
    @Column(name = "ten")
    private String tenNV;
    @Column(name = "luong")
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
