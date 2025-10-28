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
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "detalle_entrega_id", referencedColumnName = "id")
    private DetalleEntrega detalleEntrega;

    //relacion 1:M
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "repartidor_id ", referencedColumnName = "repartidor_id")
    private Repartidor repartidor;

    //CONSTRUCTOR

    public Pedido() {
    }

    public Integer getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(Integer pedidoId) {
        this.pedidoId = pedidoId;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Integer getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
    }

    public Integer getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Integer valorTotal) {
        this.valorTotal = valorTotal;
    }
}
