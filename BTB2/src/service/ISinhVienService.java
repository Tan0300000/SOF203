package service;

import java.util.ArrayList;
import model.SinhVien;

public interface ISinhVienService {

    public boolean insert(SinhVien sinhvien);

    public boolean delete(int viTri);

    public boolean update(int viTri, SinhVien sinhvien);

    public ArrayList<SinhVien> getList();
    
    public ArrayList<SinhVien> search(String tenSV);
}
