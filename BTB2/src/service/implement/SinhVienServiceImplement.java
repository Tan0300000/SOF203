package service.implement;

import java.util.ArrayList;
import model.SinhVien;
import service.ISinhVienService;

public class SinhVienServiceImplement implements ISinhVienService{
    ArrayList<SinhVien> list = new ArrayList<>();

    @Override
    public boolean insert(SinhVien sinhvien) {
        if(sinhvien == null){
            return false;
        }
        list.add(sinhvien);
        return true;
    }

    @Override
    public boolean delete(int viTri) {
        if(viTri == -1){
            return false;
        }
        list.remove(viTri);
        return true;
    }

    @Override
    public boolean update(int viTri, SinhVien sinhvien) {
        if(viTri == -1 || sinhvien == null){
            return false;
        }
        list.set(viTri, sinhvien);
        return true;
    }

    @Override
    public ArrayList<SinhVien> getList() {
        return list;
    }

    @Override
    public ArrayList<SinhVien> search(String tenSV) {
        ArrayList<SinhVien> listSV = new ArrayList<>();
        for (SinhVien sinhvien : list) {
            if (sinhvien.getTenSV().contains(tenSV)) {
                listSV.add(sinhvien);
            }
        }
        return listSV;
    }
    
}
