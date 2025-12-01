import java.sql.SQLOutput;
import java.util.Scanner;

public class ejercicios {

    public void ejercicio01(){
        //Crea un programa que permita sumar arrays multidimensionales. Para ellp siguiente estos pasos:
        //a. Pide al usuario el tamaño de las matrices
        //b. Se crearán automáticamente dos matrices con números aleatorios entre 0 y 50
        //c. Se crea una tercera matriz llamada sumaMatrices donde se guarda la suma de las celdas de las generadas en el punto anterior
        //d. Mostrar cada una de las matrices donde cada una tiene un titulo diferente para poder identificarlas

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el tamañano de la matriz 1.");
        int[] matriz1 = new int [sc.nextInt()];

        System.out.println("Introduce el tamaño de la matriz 2.");
        int[] matriz2 =new int [sc.nextInt()];


        for (int i = 0; i < matriz1.length; i++) {
            matriz1[i] = (int) (Math.random()*50)+1;
        }

        for (int i : matriz1) {
            System.out.printf("Matriz1 = %d%n", i);
        }

        for (int i = 0; i < matriz2.length; i++) {
            matriz2[i] = (int) (Math.random()*50)+1;
        }

        for (int i : matriz2) {
            System.out.printf("Matriz2 = %d%n", i);
        }

//        int[] sumaMatrices = new int [matriz1+matriz2];





        sc.close();
    }
}
