package com.example.ArepasDonLucho.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "Direccion de Entrega")
public class DireccionEntrega {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(length = 50, nullable = false)
    private String ciudad;
    @Column(length = 150, nullable = false)
    private String direccionTexto;
    @Column(length = 150, nullable = true)
    private String referencia;

    public DireccionEntrega() {
    }

    public DireccionEntrega(Integer id, String ciudad, String direccionTexto, String referencia) {
        this.id = id;
        this.ciudad = ciudad;
        this.direccionTexto = direccionTexto;
        this.referencia = referencia;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccionTexto() {
        return direccionTexto;
    }

    public void setDireccionTexto(String direccionTexto) {
        this.direccionTexto = direccionTexto;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
}
