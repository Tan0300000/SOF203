package Phieu_Muon_Sach;

import java.util.ArrayList;

public class QLPMS implements PhieuMuonSach_Interface {

    private ArrayList<PhieuMuonSach> list;

    public QLPMS() {
        this.list = new ArrayList<>();
    }

    @Override
    public void insert(PhieuMuonSach pms) {
        this.list.add(pms);
    }

    @Override
    public void delete(int viTri) {
        this.list.remove(viTri);
    }

    @Override
    public ArrayList<PhieuMuonSach> getList() {
        return this.list;
    }

    @Override
    public void setList(ArrayList<PhieuMuonSach> list) {
        this.list = list;
    }

}
