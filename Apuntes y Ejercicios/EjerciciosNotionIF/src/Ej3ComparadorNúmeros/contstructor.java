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

        for (int i = 0; i < 1; i++) {
            if (numero1 > numero2 && numero1 > numero3){
                System.out.printf("El numero mayor es %d", numero1);
            }if (numero2 > numero3 && numero2 > numero1){
                System.out.printf("El numero mayor es %d",numero2);
            } else {
                System.out.printf("El numero mayor es %d", numero3);
            }


        }



        sc.close();
    }
}
