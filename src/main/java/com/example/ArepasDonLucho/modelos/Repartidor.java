package com.example.ArepasDonLucho.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "repartidores")
public class Repartidor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "repartidor_id")
    private String repartidorId;

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

    //Constructor
    public Repartidor() {
    }


    //Setters Y Getters
}
