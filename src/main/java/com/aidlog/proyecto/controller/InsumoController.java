package com.aidlog.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aidlog.proyecto.model.Insumo;
import com.aidlog.proyecto.service.InsumoService;


@RestController
@RequestMapping("/api/v1/insumos")
public class InsumoController {
    @Autowired
    private InsumoService insumoService;

    @GetMapping
    public ResponseEntity<?> getInsumos(){
        List<Insumo> lista = insumoService.readAll();
        if(lista.isEmpty()){
            return ResponseEntity.status(404).body("No se encontraron insumos");
        }
        return ResponseEntity.ok(lista);
    }
}
