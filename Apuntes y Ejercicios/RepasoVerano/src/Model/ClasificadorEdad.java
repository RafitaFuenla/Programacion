package Model;

import java.util.Scanner;

public class ClasificadorEdad {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Que edad tienes");
        int edad = sc.nextInt();

        if (edad < 18) {
            System.out.println("menor de edad");
        } else if (edad < 65) {
            System.out.println("adulto");
        } else {
            System.out.println("senior");
        }

    }
}
