package com.jlarcher.appjoyas.model;


import com.jlarcher.appjoyas.utils.Rol;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String email;
    private String direccion;
    private Rol rol;

    @OneToMany(mappedBy = "usuario")
    private List<Pedido> pedidos;


    public Usuario() {

    }

    public Usuario(String nombre, String email, String direccion, Rol rol, List<Pedido> pedidos) {
        this.nombre = nombre;
        this.email = email;
        this.direccion = direccion;
        this.rol = rol;
        this.pedidos = pedidos;
    }

}
