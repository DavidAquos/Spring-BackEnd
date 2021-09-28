package com.mirestaurante.mirestaurante.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "plato_restaurante")
@Getter
@Setter
public class PlatoRestaurante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column
    private String nombre;

    @Column
    private int restaurante_id;

    @Column
    private BigDecimal precio_base;

    @Column
    private String descripcion;
}
