package Ej4CalculadoraNotaFinal;

import java.util.Scanner;

public class ejercicio {
    public void calculadora(){
        //Crea un programa que solicite al usuario tres notas parciales (de 0 a 10)
        // y calcule la nota final como el promedio de las tres. Además, el programa debe mostrar:
        //- Si la nota final es menor a 5: "Suspenso"
        //- Si la nota final está entre 5 y 6.9: "Aprobado"
        //- Si la nota final está entre 7 y 8.9: "Notable"
        //- Si la nota final es 9 o superior: "Sobresaliente"

        Scanner sc = new Scanner (System.in);

        System.out.println("Introduce la primera nota:");
        double nota1 = sc.nextDouble();
        System.out.println("Introduce la segunda nota:");
        double nota2 = sc.nextDouble();
        System.out.println("Introduce la tercera nota:");
        double nota3 = sc.nextDouble();

        double notaFinal = (nota1+nota2+nota3)/3;

        if (notaFinal < 5){
            System.out.println("Suspenso");
        } else if (notaFinal < 7) {
            System.out.println("Aprobado");
        } else if (notaFinal < 9) {
            System.out.println("Notable");
        }else {
            System.out.println("Sobresaliente");
        }

        sc.close();
    }
}
