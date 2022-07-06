package service;

import java.util.ArrayList;
import model.Phong;

public interface IPhongService {

    public boolean insert(Phong phong);

    public boolean delete(int viTri);

    public boolean update(int viTri, Phong phong);

    public ArrayList<Phong> getList();
}
