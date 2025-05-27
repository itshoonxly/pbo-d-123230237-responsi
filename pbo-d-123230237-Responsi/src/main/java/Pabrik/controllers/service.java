package Pabrik.controllers;

import Pabrik.models.pabrik;
import java.util.List;

public interface service {
    void insert(pabrik factory);
    List<pabrik>getAll();
    void update(pabrik factory);
    void delete(int idProduk);
}
