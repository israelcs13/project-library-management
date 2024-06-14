package org.example;
import java.util.ArrayList;
import java.util.Scanner;


// Definición de la clase Catalogo

public class Catalogo {

    // Constructor

    private ArrayList<Libro> catalogo;

    public Catalogo() {
        catalogo = new ArrayList<>();
    }

    // Método para agregar un libro
    public void agregarLibro() {
        Scanner scanner = new Scanner(System.in);

        // adding setters
        System.out.println("Introduzca el título del libro: ");
        String titulo = scanner.nextLine();

        System.out.println("Introduzca el autor del libro: ");
        String autor = scanner.nextLine();

        System.out.println("Introduzca el género del libro: ");
        String genero = scanner.nextLine();

        // Creando el objeto libro
        Libro libro = new Libro(titulo, autor, genero);

        // Añadiendo el libro al catálogo
        catalogo.add(libro);

        System.out.println("Libro añadido al catálogo.");

        scanner.close(); // cerrar el escáner
    }

    // Método para mostrar el catálogo
    public void mostrarCatalogo() {
        for (Libro libro : catalogo) {
            System.out.println(libro);
        }

    }


    // esto es para el main

    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();
        catalogo.agregarLibro();
        catalogo.mostrarCatalogo();
    }
}
}
