package com.example.demo.entity;

import lombok.*;
import org.springframework.data.jdbc.repository.query.Modifying;

import javax.persistence.*;
import java.sql.Date;


@NoArgsConstructor
@ToString
@Entity
@Data
@AllArgsConstructor
@Builder
@Table(name = "chuyenbay")
public class ChuyenBay {
    @Id
    @Column(name = "MaCB")

    private String maCB;

    @Column(name = "GaDi")
    private String gaDi;

    @Column(name = "GaDen")
    private String gaDen;

    @Column(name = "DoDai")
    private Integer doDai;

    @Column(name = "GioDi")
    private Date gioDi;

    @Column(name = "GioDen")
    private Date gioDen;

    @Column(name = "ChiPhi")
    private Integer chiPhi;

    @Override
    public String toString() {
        return "ChuyenBay{" +
                "maCB='" + maCB + '\'' +
                ", gaDi='" + gaDi + '\'' +
                ", gaDen='" + gaDen + '\'' +
                ", doDai=" + doDai +
                ", gioDi='" + gioDi + '\'' +
                ", gioDen='" + gioDen + '\'' +
                ", chiPhi=" + chiPhi +
                '}' + '\n';
    }
}
