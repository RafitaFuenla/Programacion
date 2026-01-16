package Ejercicios;

import Model.Libro;

public class LibroMain {
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        Libro libro2 = new Libro("Don quijote", "Miguel de Cervantes");
        Libro libro3 = new Libro("Cien años de soledad", "Gabriel García Márquez", 471);

        System.out.println("Libro 1: " + libro1);
        System.out.println("Libro 2: " + libro2);
        System.out.println("Libro 3: " + libro3);

    }
}
