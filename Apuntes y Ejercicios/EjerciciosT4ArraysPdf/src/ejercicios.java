import java.sql.SQLOutput;
import java.util.Scanner;

public class ejercicios {

    public void ejercicio01() {
        //Crea un programa que permita sumar arrays multidimensionales. Para ellp siguiente estos pasos:
        //a. Pide al usuario el tamaño de las matrices
        //b. Se crearán automáticamente dos matrices con números aleatorios entre 0 y 50
        //c. Se crea una tercera matriz llamada sumaMatrices donde se guarda la suma de las celdas de las generadas en el punto anterior
        //d. Mostrar cada una de las matrices donde cada una tiene un titulo diferente para poder identificarlas

        Scanner sc = new Scanner(System.in);

        int filas, columnas;

        System.out.println("Introduce el número de filas:");
        filas = sc.nextInt();
        System.out.println("Introduce el número de columnas:");
        columnas = sc.nextInt();

        int[][] matriz1 = new int[filas][columnas];
        int[][] matriz2 = new int[filas][columnas];

        System.out.println();
        System.out.println("=== MATRIZ 1 ===");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j] = (int) (Math.random() * 50) + 1;
                System.out.print(matriz1[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("=== MATRIZ 1 ===");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                matriz2[i][j] = (int) (Math.random() * 50) + 1;
                System.out.print(matriz2[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("=== SUMA DE MATRICES ===");
        int[][] sumaMatrices = new int[filas][columnas];

        for (int i = 0; i < sumaMatrices.length; i++) {
            for (int j = 0; j < sumaMatrices[i].length; j++) {
                sumaMatrices[i][j] = matriz1[i][j] + matriz2[i][j];
                System.out.print(sumaMatrices[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}
