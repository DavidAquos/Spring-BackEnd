package com.mirestaurante.mirestaurante.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "extra_pedido")
public class ExtraPedido {

    private PlatoPedido platoPedido;
}
