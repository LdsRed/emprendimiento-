package com.jlarcher.appjoyas.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario")
    private Usuario usuario;

    @Column(nullable = false)
    private Date fecha;

    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DetallePedido> detalles;

    @Column(nullable = false)
    private Double total;



    public Pedido() {}
    public Pedido(Usuario usuario, Date fecha, List<DetallePedido> detalles, Double total) {
        this.usuario = usuario;
        this.fecha = fecha;
        this.detalles = detalles;
        this.total = total;
    }



}
