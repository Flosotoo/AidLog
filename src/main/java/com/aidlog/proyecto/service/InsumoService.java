package com.aidlog.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aidlog.proyecto.model.Insumo;
import com.aidlog.proyecto.repository.InsumoRespository;

@Service
public class InsumoService {
    @Autowired
    private InsumoRespository insumoRespository;
    
    public List<Insumo> readAll() {
        return insumoRespository.obtenerInsumo();
    }

    public Insumo readById(int id) {
        return insumoRespository.insumoPorId(id);
    }

    public Insumo create(Insumo insumo) {
        return insumoRespository.agregar(insumo);
    }

    public Insumo updateInsumo(int id, Insumo insumo) {
        return insumoRespository.modificarInsumo(id, insumo);
    }

}
