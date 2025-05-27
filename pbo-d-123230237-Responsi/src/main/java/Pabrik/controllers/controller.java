package Pabrik.controllers;

import Pabrik.models.pabrik;
import Pabrik.models.pabrikDAO;
import java.util.List;

public class controller implements service {
    private final pabrikDAO dao = new pabrikDAO();

    @Override
    public void insert(pabrik factory) {
        dao.insert(factory);
    }

    @Override
    public List<pabrik> getAll() {
        return dao.getAll();
    }

    @Override
    public void update(pabrik factory) {
        dao.update(factory);
    }

    @Override
    public void delete(int idProduk) {
        dao.delete(idProduk);
    }
    
}
