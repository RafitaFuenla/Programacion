package Ej5VerificadorAñoBisiesto;

import java.util.Scanner;

public class ejercicio {
    public void bisiesto() {
        //Escribe un programa que solicite al usuario un año
        // y determine si es bisiesto o no.
        // Un año es bisiesto si es divisible por 4,
        // excepto aquellos divisibles por 100 pero no por 400.
        //Por ejemplo: 2000 es bisiesto, 1900 no lo es, 2004 es bisiesto.

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un año, para comprobar si es bisieesto.");
        int anio = sc.nextInt();

        if (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0)) {
            System.out.printf("El año %d es bisiesto.\n", anio);
        } else {
            System.out.printf("El año %d NO es bisiesto.\n", anio);
        }
            sc.close();
    }
}
