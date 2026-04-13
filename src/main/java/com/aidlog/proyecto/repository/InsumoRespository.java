package com.aidlog.proyecto.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.aidlog.proyecto.service.Insumo;

@Repository
public class InsumoRespository {
    private final List<Insumo> listaInsumos = new ArrayList<>();

    public List<Insumo> obtenerInsumo(){
        return listaInsumos;
    }



}
