package com.metaphorce.vista;

import com.metaphorce.modelo.GestorPelicula;
import com.metaphorce.modelo.Pelicula;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        GestorPelicula gestor = new GestorPelicula();

        // Crear peliculas
        Pelicula pelicula1 = new Pelicula(1, "Matrix", true);
        Pelicula pelicula2 = new Pelicula(2, "Titanic", true);
        Pelicula pelicula3 = new Pelicula(3, "Interestellar", false);
        Pelicula pelicula4 = new Pelicula(4, "Star Wars", false);
        Pelicula pelicula5 = new Pelicula(5, "Lord Of The Rings", true);

        // Agregar peliculas
        gestor.agregarPelicula(pelicula1);
        gestor.agregarPelicula(pelicula2);
        gestor.agregarPelicula(pelicula3);
        gestor.agregarPelicula(pelicula4);
        gestor.agregarPelicula(pelicula5);

        // Verificar si hay peliculas: comprobar si la lista esta vacia o no
        List<Pelicula> peliculas = gestor.obtenerPeliculas();
        if (peliculas.isEmpty()) {
            System.out.println("\nNo hay peliculas registradas.\n");
            return;
        }

        // Mostrar todas las peliculas
        System.out.println("\n---------- TODAS LAS PELICULAS ----------\n");
        verLista(peliculas);

        // Eliminar pelicula: se usan nuevos valores booleanos retornados
        if (gestor.eliminarPelicula(2)) {
            System.out.println("\nPelícula con ID 2 eliminada.");
        } else {
            System.out.println("\nNo se encontro la pelicula con ese ID.");
        }

        // Marcar pelicula como disponible: se usan nuevos valores booleanos retornados
        if (gestor.marcarPeliculaComoDisponible(4)) {
            System.out.println("\nPelícula con ID 4 marcada como disponible.");
        } else {
            System.out.println("\\nNo se encontro la pelicula con ese ID.\"");
        }

        // Mostrar todas las peliculas
        System.out.println("\n---------- LISTA ACTUALIZADA DE TODAS LAS PELICULAS ----------\n");
        for (Pelicula pelicula : gestor.obtenerPeliculas())
            System.out.println(pelicula);

        // Mostrar peliculas disponibles
        System.out.println("\n---------- PELICULAS DISPONIBLES ----------\n");
        List<Pelicula> disponible = gestor.obtenerPeliculasDisponibles();
        if (disponible.isEmpty()) {
            System.out.println("\nNo se encontraron peliculas disponibles.");
        } else {
            verLista(disponible);
        }

        // Mostrar las peliculas no disponibles
        System.out.println("\n---------- PELICULAS NO DISPONIBLES ----------\n");
        List<Pelicula> noDisponible = gestor.obtenerPeliculasDisponibles();
        if (noDisponible.isEmpty()) {
            System.out.println("\nNo se encontraron peliculas.");
        } else {
            verLista(noDisponible);
        }
        // Primero verifica si la lista está vacía o si existe algun elemento
    }

    // Metodo para imprimir una lista de peliculas
    private static void verLista(List<Pelicula> lista) {
        // Comprueba si la lista es nula o esta vacia
        if (lista == null || lista.isEmpty()) {
            System.out.println("\nNo hay peliculas para mostrar\n");
        }

        // Recorre cada pelicula y la imprime
        for (Pelicula pelicula : lista) {
            System.out.println(pelicula);
        }
    }
}
