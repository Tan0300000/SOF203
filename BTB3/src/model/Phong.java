package model;

public class Phong {

    private String soPhong;
    private String khuVuc;
    private boolean loaiPhong;

    public Phong(String soPhong, String khuVuc, boolean loaiPhong) {
        this.soPhong = soPhong;
        this.khuVuc = khuVuc;
        this.loaiPhong = loaiPhong;
    }

    public Phong() {
    }

    public String getSoPhong() {
        return soPhong;
    }

    public void setSoPhong(String soPhong) {
        this.soPhong = soPhong;
    }

    public String getKhuVuc() {
        return khuVuc;
    }

    public void setKhuVuc(String khuVuc) {
        this.khuVuc = khuVuc;
    }

    public boolean isLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(boolean loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

}
