package model;

public class SinhVien {

    private String tenSV;
    private float diem;
    private int gioiTinh;
    private String lop;

    public SinhVien(String tenSV, float diem, int gioiTinh, String lop) {
        this.tenSV = tenSV;
        this.diem = diem;
        this.gioiTinh = gioiTinh;
        this.lop = lop;
    }

    public SinhVien() {
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getXepLoai(float diem) {
        String XepLoai = null;
        diem = getDiem();
        if (diem < 5) {
            XepLoai = "Yếu";
        } else {
            XepLoai = "Tốt";
        }
        return XepLoai;
    }
}
