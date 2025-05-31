package com.metaphorce.modelo;

import java.util.ArrayList;
import java.util.List;

public class GestorPelicula {
    private List<Pelicula> peliculas;
    // Coleccion interna que almacena todas las peliculas que maneja el gestor

    public GestorPelicula() {
        this.peliculas = new ArrayList<>();
    }

    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
    }

    public boolean eliminarPelicula(int id) {
        System.out.println("Metodo para eliminar");
        return peliculas.removeIf(pelicula -> pelicula.getId() == id);
        /* removeIf(...) Elimina todas las coincidenicas (No es el caso si el ID es unico).
            Retorna en boolean (true o false) ya que permite a la clase Main saber si la opración fue exitosa
            y mostrar un mensaje adecuado
        */
    }

    public List<Pelicula> obtenerPeliculas() {
        return new ArrayList<>(peliculas);
    }

    public List<Pelicula> obtenerPeliculasDisponibles() {
        List<Pelicula> disponibles = new ArrayList<>();
        for (Pelicula pelicula : peliculas) {
            if (pelicula.isDisponible()) {
                disponibles.add(pelicula);
            }
        }
        return disponibles;
    }

    public List<Pelicula> obtenerPeliculasNoDisponibles() {
        List<Pelicula> noDisponibles = new ArrayList<>();
        for (Pelicula pelicula : peliculas) {
            if (!pelicula.isDisponible()) {
                noDisponibles.add(pelicula);
            }
        }
        return noDisponibles;
    }

    public boolean marcarPeliculaComoDisponible(int id) {
        // Permite saber si realmente se encontro la pelicula
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getId() == id) {
                pelicula.setDisponible(true);
                return true;
            }
        }
        return false;
    }

    public Pelicula buscarPorNombre(String nombre) {
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getNombre().equals(nombre)) {
                return pelicula;
            }
        }
        return null;
    }
}
