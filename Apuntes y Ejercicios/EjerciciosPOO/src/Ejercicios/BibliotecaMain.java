package Ejercicios;

import Model.BibliotecaLibro;
import Model.BibliotecaUsuario;
import Model.BibliotecaPrestamo;

public class BibliotecaMain {

    public static void main(String[] args) {
        BibliotecaLibro l1 = new BibliotecaLibro("Don quijote", "Miguel de Cervantes");
        BibliotecaLibro l2 = new BibliotecaLibro("Cien años de soledad", "Gabriel Garcia Marquez");
        BibliotecaLibro l3 = new BibliotecaLibro("1984", "George Orwell");

        BibliotecaLibro[] libros = {l1, l2, l3};

        BibliotecaUsuario u1 = new BibliotecaUsuario("Juan Perez");
        BibliotecaUsuario u2 = new BibliotecaUsuario("Maria Lopez");

        BibliotecaPrestamo p1 = new BibliotecaPrestamo(l1,u1,"20/12/2025");

        System.out.println("--- BIBLIOTECA ---");
        System.out.println("Libros disponibles:");

        for (int i = 0; i < libros.length; i++) {
            if (libros[i].isDisponible()) {
                System.out.println(libros[i]);
            }
        }

        System.out.println("\n" +u1 + "intenta tomar prestado " +l1.getTitulo());
        p1.prestarLibro();

        System.out.println("\n" +u2 + "intenta tomar prestado " +l1.getTitulo());
        p1.prestarLibro();

        System.out.println("\n" +u1 + "devuelve " +l1.getTitulo());
        p1.devolverLibro();

        System.out.println("\nLibros disponibles ahora:");

        for (int i = 0; i < libros.length; i++) {
            if (libros[i].isDisponible()) {
                System.out.println(libros[i]);
            }
        }



    }
}
