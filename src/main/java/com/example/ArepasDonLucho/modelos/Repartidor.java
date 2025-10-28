package com.example.ArepasDonLucho.modelos;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "repartidores")
public class Repartidor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "repartidor_id")
    private Integer repartidorId;

    @Column(length = 15, nullable = false)
    private String nombre;

    @Column(length = 20, nullable = false, unique = true)
    private String documento;

    @Column(length = 15, nullable = false)
    private String telefono;

    @Column(name = "placa_vehiculo", length = 10, nullable = false, unique = true)
    private String placaVehiculo;

    @Column(name = "zona_cobertura", length = 10, nullable = false)
    private String zonaCobertura;

    @Column(nullable = false)
    private Boolean activo;

    //RELACION COMPUESTA 1:M

    @OneToMany(mappedBy = "repartidor", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Pedido> pedidos;

    //Constructor
    public Repartidor() {
    }


    //Setters Y Getters

    public Integer getRepartidorId() {
        return repartidorId;
    }

    public void setRepartidorId(Integer repartidorId) {
        this.repartidorId = repartidorId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPlacaVehiculo() {
        return placaVehiculo;
    }

    public void setPlacaVehiculo(String placaVehiculo) {
        this.placaVehiculo = placaVehiculo;
    }

    public String getZonaCobertura() {
        return zonaCobertura;
    }

    public void setZonaCobertura(String zonaCobertura) {
        this.zonaCobertura = zonaCobertura;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
}
