package com.mirestaurante.mirestaurante.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "restaurante")
@Getter
@Setter
public class Restaurante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "restaurante")
    private Set<ImgRestaurante> imgsRestaurante;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "restaurante")
    private Set<Horario> horarios;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "restaurante")
    private Set<ComentariosRest> comentariosRest;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "restaurante")
    private Set<Pedido> pedidos;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "restaurante")
    private Set<PlatoRestaurante> platosRestaurante;

    @OneToOne
    @PrimaryKeyJoinColumn
    private RestauranteFav restauranteFav;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "img_logo")
    private String imgLogo;

    @Column(name = "localizacion")
    private String localizacion;

    @Column(name = "rango_max_reparto")
    private int rangoMaxReparto;

    @Column(name = "destacado")
    private boolean destacado;

    @Column(name = "activo")
    private boolean activo;

    @Column(name = "date_created")
    @CreationTimestamp
    private Date dateCreated;

    @Column(name = "date_updated")
    @UpdateTimestamp
    private Date dateUpdated;

    @ManyToOne
    @JoinColumn(name = "id_restaurante")
    private Categoria categoria;

}