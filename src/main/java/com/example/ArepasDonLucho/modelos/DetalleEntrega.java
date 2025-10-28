package com.example.ArepasDonLucho.modelos;

import jakarta.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name= "detalles_entregas")
public class DetalleEntrega {

    // Atributos

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private LocalTime horaSalidaCocina;

    @Column(nullable = false)
    private LocalTime horaSalidaCliente;

    @Column(nullable = false)
    private String estado;

    @Column(nullable = false)
    private String fotoPrueba;

    private Boolean intentoFallido;

    // Relaciones
        //Uno a Uno
    @OneToOne(mappedBy = "detalleEntrega")
    private Pedido pedido;

    // Constructores

    public DetalleEntrega() {
    }

    public DetalleEntrega(Integer id, LocalTime horaSalidaCocina, LocalTime horaSalidaCliente, String estado, String fotoPrueba, Boolean intentoFallido) {
        this.id = id;
        this.horaSalidaCocina = horaSalidaCocina;
        this.horaSalidaCliente = horaSalidaCliente;
        this.estado = estado;
        this.fotoPrueba = fotoPrueba;
        this.intentoFallido = intentoFallido;
    }

    // Getters y Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalTime getHoraSalidaCocina() {
        return horaSalidaCocina;
    }

    public void setHoraSalidaCocina(LocalTime horaSalidaCocina) {
        this.horaSalidaCocina = horaSalidaCocina;
    }

    public LocalTime getHoraSalidaCliente() {
        return horaSalidaCliente;
    }

    public void setHoraSalidaCliente(LocalTime horaSalidaCliente) {
        this.horaSalidaCliente = horaSalidaCliente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFotoPrueba() {
        return fotoPrueba;
    }

    public void setFotoPrueba(String fotoPrueba) {
        this.fotoPrueba = fotoPrueba;
    }

    public Boolean getIntentoFallido() {
        return intentoFallido;
    }

    public void setIntentoFallido(Boolean intentoFallido) {
        this.intentoFallido = intentoFallido;
    }

    // To String

    @Override
    public String toString() {
        return "DetalleEntrega{" +
                "id=" + id +
                ", horaSalidaCocina=" + horaSalidaCocina +
                ", horaSalidaCliente=" + horaSalidaCliente +
                ", estado='" + estado + '\'' +
                ", fotoPrueba='" + fotoPrueba + '\'' +
                ", intentoFallido=" + intentoFallido +
                '}';
    }
}
