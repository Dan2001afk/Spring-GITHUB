package com.prueba1.demo.entidad;

public class frutas {

    private String nombre;
    private String colorf;
    private String tamaño;
    private String forma;
    private int precio;
    private int cantidad;

    public frutas(String nombre, String colorf, String tamaño, String forma, int precio, int cantidad) {
        this.nombre = nombre;
        this.colorf = colorf;
        this.tamaño = tamaño;
        this.forma = forma;
        this.precio = precio;
        this.cantidad = cantidad;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColorf() {
        return colorf;
    }

    public void setColorf(String colorf) {
        this.colorf = colorf;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}