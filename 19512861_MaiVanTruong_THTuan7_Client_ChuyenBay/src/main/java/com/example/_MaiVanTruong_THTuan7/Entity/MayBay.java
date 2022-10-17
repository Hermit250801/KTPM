package com.example._MaiVanTruong_THTuan7.Entity;

import lombok.*;


@NoArgsConstructor
@ToString
@Data
@AllArgsConstructor

@Builder
public class MayBay {

    private Integer maMB;

    private String loai;

    private Integer tamBay;


    public MayBay(Integer maMB) {
        this.maMB = maMB;
    }



    @Override
    public String toString() {
        return "MayBay{" +
                "maMB=" + maMB +
                ", loai='" + loai + '\'' +
                ", tamBay='" + tamBay + '\'' +
                '}' +  "\n";
    }
}
