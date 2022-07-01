
package model;

import java.io.Serializable;

public class PhieuMuonSach implements Serializable{
    private String tenSV;
    private String boMon;
    private int gioiTinh;
    private String tenSach;

    public PhieuMuonSach(String tenSV, String boMon, int gioiTinh, String tenSach) {
        this.tenSV = tenSV;
        this.boMon = boMon;
        this.gioiTinh = gioiTinh;
        this.tenSach = tenSach;
    }

    public PhieuMuonSach() {
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getBoMon() {
        return boMon;
    }

    public void setBoMon(String boMon) {
        this.boMon = boMon;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }
    
    
}
