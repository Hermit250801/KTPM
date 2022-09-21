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
@Table(name = "maybay")
public class MayBay {
    @Id
    @Column(name = "MaMB")
    private Integer maMB;

    @Column(name = "Loai")
    private String loai;

    @Column(name = "TamBay")
    private Integer tamBay;

    @Override
    public String toString() {
        return "MayBay{" +
                "maMB=" + maMB +
                ", loai='" + loai + '\'' +
                ", tamBay='" + tamBay + '\'' +
                '}' +  "\n";
    }
}
