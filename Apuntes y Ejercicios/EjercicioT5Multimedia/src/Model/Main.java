package Model;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Multimedia multimedia = new Multimedia();
        int opcion;
        do {
            System.out.println("1. Añadir Libro, video o audio.");
            System.out.println("2. ");
            System.out.println("3. ");
            System.out.println("0. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("Cuantas paginas tiene el libro?");
                    int nPaginas = sc.nextInt();
                }
                case 2 -> {
                    System.out.println("Que director tiene?");
                    String director = sc.next();
                    System.out.println("Y los actores?");
                    String actor = sc.next();
                }
                case 3 -> {
                    System.out.println("Que duracion tiene el audio?");
                    int duracion = sc.nextInt();
                    System.out.println("Y que soporte tienes?");
                    String soporte = sc.next();
                }

                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida");
            }
        } while (opcion != 0);



        sc.close();
    }
}
