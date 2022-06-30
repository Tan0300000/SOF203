package Phieu_Muon_Sach;

import java.util.ArrayList;

public interface PhieuMuonSach_Interface {

    public void insert(PhieuMuonSach pms);

    public void delete(int viTri);

    public ArrayList<PhieuMuonSach> getList();

    public void setList(ArrayList<PhieuMuonSach> list);
}
