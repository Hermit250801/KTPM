package com.example._MaiVanTruong_THTuan7.Entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.sql.Timestamp;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ChuyenBay {

    private String maCB;

    private String gaDi;

    private String gaDen;

    private Integer doDai;

    private Timestamp gioDi;

    private Timestamp gioDen;

    private Integer chiPhi;

    public ChuyenBay(String maCB, String gaDi, String gaDen, Integer doDai, Timestamp gioDi, Timestamp gioDen, Integer chiPhi) {
        this.maCB = maCB;
        this.gaDi = gaDi;
        this.gaDen = gaDen;
        this.doDai = doDai;
        this.gioDi = gioDi;
        this.gioDen = gioDen;
        this.chiPhi = chiPhi;
    }

    public ChuyenBay() {
    }

    public String getMaCB() {
        return maCB;
    }

    public void setMaCB(String maCB) {
        this.maCB = maCB;
    }

    public String getGaDi() {
        return gaDi;
    }

    public void setGaDi(String gaDi) {
        this.gaDi = gaDi;
    }

    public String getGaDen() {
        return gaDen;
    }

    public void setGaDen(String gaDen) {
        this.gaDen = gaDen;
    }

    public Integer getDoDai() {
        return doDai;
    }

    public void setDoDai(Integer doDai) {
        this.doDai = doDai;
    }

    public Timestamp getGioDi() {
        return gioDi;
    }

    public void setGioDi(Timestamp gioDi) {
        this.gioDi = gioDi;
    }

    public Timestamp getGioDen() {
        return gioDen;
    }

    public void setGioDen(Timestamp gioDen) {
        this.gioDen = gioDen;
    }

    public Integer getChiPhi() {
        return chiPhi;
    }

    public void setChiPhi(Integer chiPhi) {
        this.chiPhi = chiPhi;
    }

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
