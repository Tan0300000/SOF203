package service.implement;

import java.util.ArrayList;
import model.PhieuMuonSach;
import service.iPhieuMuonSachService;

public class PhieuMuonSachServiceImplement implements iPhieuMuonSachService {

    private ArrayList<PhieuMuonSach> list = new ArrayList<>();

    

    @Override
    public ArrayList<PhieuMuonSach> getList() {
        return list;
    }

    @Override
    public void setList(ArrayList<PhieuMuonSach> list) {
        this.list = list;
    }

    @Override
    public boolean insert(PhieuMuonSach pms) {
        if (pms == null) {
            return false;
        }
        list.add(pms);
        return true;
    }

    @Override
    public boolean delete(int viTri) {
        if (viTri == -1){
            return false;
        }
        list.remove(viTri);
        return true;
    }

    

    

}
