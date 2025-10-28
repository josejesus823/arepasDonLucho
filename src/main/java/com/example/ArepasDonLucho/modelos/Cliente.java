package com.example.ArepasDonLucho.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "Cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idCliente;

    @Column(length = 50, nullable = false)
    private String nombreCliente;
    @Column(length = 20, nullable = false)
    private String tipoDocumento;
    @Column(length = 20, nullable = false)
    private String numeroDocumneto;
    @Column(length = 10, nullable = false)
    private String telefono;
    @Column(length = 50, nullable = false)
    private String email;

    public Cliente() {
    }

    public Cliente(String idCliente, String nombreCliente, String tipoDocumento, String numeroDocumneto, String telefono, String email) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumneto = numeroDocumneto;
        this.telefono = telefono;
        this.email = email;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumneto() {
        return numeroDocumneto;
    }

    public void setNumeroDocumneto(String numeroDocumneto) {
        this.numeroDocumneto = numeroDocumneto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
