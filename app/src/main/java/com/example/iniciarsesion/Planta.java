package com.example.iniciarsesion;

public class Planta {
    private String nombreComun;
    private String nombreCientifico;
    private String tipoPlanta;
    private String categoria;
    private String informacionAdicional;

    @Override
    public String toString() {
        return "Nombre Común: " + nombreComun + ", Nombre Científico: " + nombreCientifico;
        // Puedes modificar esto para mostrar la información que desees
    }

    public Planta() {
        // Constructor vacío necesario para Firebase
    }

    public Planta(String nombreComun, String nombreCientifico, String tipoPlanta, String categoria, String informacionAdicional) {
        this.nombreComun = nombreComun;
        this.nombreCientifico = nombreCientifico;
        this.tipoPlanta = tipoPlanta;
        this.categoria = categoria;
        this.informacionAdicional = informacionAdicional;
    }

    // Getters
    public String getNombreComun() {
        return nombreComun;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public String getTipoPlanta() {
        return tipoPlanta;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getInformacionAdicional() {
        return informacionAdicional;
    }

    // Setters
    public void setNombreComun(String nombreComun) {
        this.nombreComun = nombreComun;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public void setTipoPlanta(String tipoPlanta) {
        this.tipoPlanta = tipoPlanta;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setInformacionAdicional(String informacionAdicional) {
        this.informacionAdicional = informacionAdicional;
    }
}
