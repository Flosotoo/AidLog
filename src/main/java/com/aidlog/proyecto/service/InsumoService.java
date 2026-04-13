package com.aidlog.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aidlog.proyecto.controller.Insumo;
import com.aidlog.proyecto.model.Insumo;
import com.aidlog.proyecto.repository.InsumoRespository;

@Service
public class InsumoService {
    @Autowired
    public List<Insumo> readAll() {
        return InsumoRespository.obtenerInsumo();
    }

}
