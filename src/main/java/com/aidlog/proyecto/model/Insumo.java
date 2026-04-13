package com.aidlog.proyecto.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Insumo {
    @NotNull(message="El ID no puee ir vacio")
    @Min(value=1, message="El valor debe ser mayor a 1")
    private int id;

    @NotBlank(message="El nombre del producto no puede ir vacio")
    private String nombre_producto;

    private Categoria categoria;

    @NotNull(message="La cantidad en stock no puede ser nula")
    @Min(value=0, message="No puede ser un numero negativo, el minimo es 0")
    private int stock;

    @NotNull(message="La fecha de ingreso no debe estar nula")
    private int f_ingreso;

    private NivelPrioridad nivelPrioridad;

    public Insumo(Categoria categoria, int f_ingreso, int id, NivelPrioridad nivelPrioridad, String nombre_producto, int stock) {
        this.categoria = categoria;
        this.f_ingreso = f_ingreso;
        this.id = id;
        this.nivelPrioridad = nivelPrioridad;
        this.nombre_producto = nombre_producto;
        this.stock = stock;
    }

    
}
