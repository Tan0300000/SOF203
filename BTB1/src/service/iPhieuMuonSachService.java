
package service;

import java.util.ArrayList;
import model.PhieuMuonSach;

public interface iPhieuMuonSachService {
    public boolean insert(PhieuMuonSach pms);

    public boolean delete(int viTri);

    public ArrayList<PhieuMuonSach> getList();

    public void setList(ArrayList<PhieuMuonSach> list);
}
