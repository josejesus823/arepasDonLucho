package com.example.ArepasDonLucho.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "pedidos")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pedido_id")
    private Integer pedidoId;

    @Column(length = 20, unique = true, nullable = false)
    private String codigo;

    @Column(name = "fecha_creacion", nullable = false)
    private LocalDate fechaCreacion;

    @Column(nullable = false)
    private Boolean estado;

    @Column(name = "total_items")
    private Integer totalItems;

    @Column(name = "valorTotal", nullable = false)
    private Integer valorTotal;

    //RELACION 1:1 DETALLE ENTREGA

    //CONSTRUCTOR

    public Pedido() {
    }


}
