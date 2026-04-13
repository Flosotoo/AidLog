package com.aidlog.proyecto.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.aidlog.proyecto.model.Insumo;


@Repository
public class InsumoRespository {
    private final List<Insumo> listaInsumos = new ArrayList<>();

    public List<Insumo> obtenerInsumo(){
        return listaInsumos;
    }

    public Insumo insumoPorId(int id) {
        for(Insumo insumo : listaInsumos){
            if(id==insumo.getId()){
                return insumo;
            }
        }
        return null;
    }

    public Insumo agregar(Insumo insumo) {
        if(insumoPorId(insumo.getId()) != null){
            return null;
        }
        listaInsumos.add(insumo);
        return insumo;
    }

    public Insumo modificarInsumo(int id, Insumo insumo) {
        Insumo buscado = insumoPorId(id);
        if(buscado != null){
            buscado.setId(insumo.getId());
            buscado.setNombre_producto(insumo.getNombre_producto());
        }
        return buscado;
    }



}
