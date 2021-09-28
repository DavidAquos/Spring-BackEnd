package com.mirestaurante.mirestaurante.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "pedido")
@Getter
@Setter
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "estado")
    private String estado;

    private Cliente cliente;

    @Column(name = "direccion")
    private Direccion direccion;

    @Column(name = "estado")
    private Restaurante restaurante;

    @Column(name = "coste_transporte")
    private BigDecimal coste_transporte;

    @Column(name = "fecha")
    private Date fecha;

    private String cupon_descuento;

    @Column(name = "localizador")
    private String localizador;

    @Column(name = "precioTotal")
    private BigDecimal precioTotal;

    @ManyToOne
    @JoinColumn(name = "restaurante_id", nullable = false)
    private Restaurante restaurante;

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pedido")
    @JsonManagedReference
    private Set<PlatoPedido> platosPedido;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "direccion_id", referencedColumnName = "id")
    @JsonManagedReference
    private Direccion direccion;

}