import java.util.Scanner;


public class EjerciciosT4ArraysUni {
    public void ejercicio01() {

        String[] frutas = {"Manzana", "Plátano", "Naranja", "Fresa", "Uva"};

        for (int i = 0; i < frutas.length; i++) {
            System.out.printf("Estos son los elementos del array: %s%n", frutas[i]);
        }
    }

    public void ejercicio02(){

        int[] numeros = new int[6];

        System.out.println("Recorriendo el array:");

        for (int i = 0; i < numeros.length ; i++) {
            numeros[i] = (int) (Math.random()*100)+1;
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Posicion %d: %d\n", i, numeros[i]);
//
        }

    }
}
