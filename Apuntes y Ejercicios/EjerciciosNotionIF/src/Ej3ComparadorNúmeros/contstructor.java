package Ej3ComparadorNúmeros;
import java.util.Scanner;

public class contstructor {
    public void ejercicio() {

        // Desarrolla un programa que solicite tres números enteros
        // y determine cuál es el mayor de los tres. Muestra el resultado en pantalla.

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero:");
        int numero1 = sc.nextInt();
        System.out.println("Introduce el segundo numero:");
        int numero2 = sc.nextInt();
        System.out.println("Introduce el tercer numero:");
        int numero3 = sc.nextInt();

        if (numero1 >= numero2 && numero1 >= numero3) { // El numero 1 es masyor igual que 2 y que el 3?
            System.out.printf("El numero mayor es %d\n", numero1);
        } else if (numero2 >= numero3) { // como ya sabemos que el numero 1 no puede ser mayor que 2, comprobomas con el 3
            System.out.printf("El numero mayor es %d\n", numero2);
        } else { // si no se cumple anda, el numero 3 es el mayor.
            System.out.printf("El numero mayor es %d\n", numero3);
        }

        sc.close();
    }
}
