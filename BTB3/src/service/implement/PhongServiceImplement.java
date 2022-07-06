package service.implement;

import java.util.ArrayList;
import model.Phong;
import service.IPhongService;

public class PhongServiceImplement implements IPhongService {

    ArrayList<Phong> list = new ArrayList<>();

    @Override
    public boolean insert(Phong phong) {
        if (phong == null) {
            return false;
        }
        list.add(phong);
        return true;
    }

    @Override
    public boolean delete(int viTri) {
        if (viTri == -1) {
            return false;
        }
        list.remove(viTri);
        return true;
    }

    @Override
    public boolean update(int viTri, Phong phong) {
        if (viTri == -1 || phong == null) {
            return false;
        }
        list.set(viTri, phong);
        return true;
    }

    @Override
    public ArrayList<Phong> getList() {
        return list;
    }

}
