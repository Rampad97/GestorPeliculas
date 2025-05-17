package com.metaphorce.modelo;

public class Pelicula {
    private int id; // Identificador unico
    private String nombre; // Nombre del titulo
    private boolean disponible; // Indica si la pelicula esta o no disponible

    public Pelicula(int id, String nombre, boolean disponible) {
        this.id = id;
        this.nombre = nombre;
        this.disponible = disponible;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "ID =" + id +
                ", Nombre ='" + nombre + '\'' +
                ", Disponible =" + disponible +
                '}';
    }
}
