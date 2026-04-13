package com.aidlog.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aidlog.proyecto.model.Insumo;
import com.aidlog.proyecto.service.InsumoService;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PutMapping;





@RestController
@RequestMapping("/api/v1/insumos")
public class InsumoController {
    @Autowired
    private InsumoService insumoService;
    
    //CREAR
    @PostMapping
    public ResponseEntity<?> postInsumo(@Valid @RequestBody Insumo insumo){
        Insumo creado = insumoService.create(insumo);
        if(creado == null){
            return ResponseEntity.status(409).body("El Insumo ya existe");
        }
        return ResponseEntity.ok("Insumo agregado correctamente");
    }

    //MOSTRAR
    @GetMapping
    public ResponseEntity<?> getInsumos(){
        List<Insumo> lista = insumoService.readAll();
        if(lista.isEmpty()){
            return ResponseEntity.status(404).body("No se encontraron insumos");
        }
        return ResponseEntity.ok(lista);
    }

    //LEER POR ID / BUSCAR
    @GetMapping("{id}")
    public ResponseEntity<?> getInsumoById(@PathVariable int id){
        Insumo insumo = insumoService.readById(id);
        if(insumo == null){
            return ResponseEntity.status(404).body("Insumo no encontrado");
        }
        return ResponseEntity.ok(insumo);
    }
    
    //ACTUALIZAR
    @PutMapping("{id}")
    public ResponseEntity<?> putInsumo (@PathVariable int id, @Valid @RequestBody Insumo insumo){
        Insumo actualizado = insumoService.updateInsumo(id, insumo);
        if(actualizado == null){
            return ResponseEntity.status(404). body("Insumo no encontrado");
        }
        return ResponseEntity.ok(actualizado);
    }
    

    
}
