package com.mirestaurante.mirestaurante.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "plato_pedido")
public class PlatoPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "pedido_id")
    @JsonBackReference
    private Pedido pedido;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "plato_id", referencedColumnName = "id")
    private PlatoRestaurante platoRestaurante;

    @Column(name = "cantidad")
    private int cantidad;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "platoPedido") // El mappedBy referencia al extra pedido , la variable platoPedido
    @JoinColumn(name = "plato_id")
    private Set<ExtraPedido> extrasPedido;



}
