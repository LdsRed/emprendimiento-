package com.jlarcher.appjoyas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombre;
    private String descripcion;
    private double precio;
    private boolean stock;
    private int cantidad;
    private String categoria;


    public Producto() {

    }

    public Producto(String nombre, String descripcion, double precio, boolean stock, int cantidad, String categoria) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.cantidad = cantidad;
        this.categoria = categoria;

    }



}
