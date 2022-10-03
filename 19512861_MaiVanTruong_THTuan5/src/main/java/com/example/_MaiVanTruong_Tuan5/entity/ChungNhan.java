package com.example._MaiVanTruong_Tuan5.entity;

import lombok.*;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;

@NoArgsConstructor
@ToString(exclude = "MayBay, NhanVien")
@Entity
@Data
@AllArgsConstructor
@Builder

@Table(name = "chungnhan")
public class ChungNhan {
    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    @JoinColumn(name = "nhanvien_manv", nullable = false)
    private NhanVien maNV;

    @ManyToOne
    @JoinColumn(name = "maybay_mamb", nullable = false)
    private MayBay maMB;

}
