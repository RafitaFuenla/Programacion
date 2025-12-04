import java.sql.SQLOutput;
import java.util.Scanner;

public class ejercicios {

    public void ejercicio01() {
        //Crea un programa que permita sumar arrays multidimensionales. Para ello siguiente estos pasos:
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
        System.out.println("=== MATRIZ 2     ===");
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

    public void ejercicio02() {
        //Crea un array de 10 posiciones y rellénalo con números aleatorios entre el  y el 20,
        // pudiendo repetirse. Una vez rellenado, crear un menú para que el usuario
        //seleccione la acción que quiere realizar:
        //a. Imprimir array
        //b. Mover a izquierda
        //c. Mover a derecha
        //d. Invertir

        Scanner sc = new Scanner(System.in);

        int[] ejemplo = new int[10];
        rellenarArray(ejemplo);
        char eleccion;
        do {
            System.out.println();
            System.out.println("Elije una opcion de las siguientes:");
            System.out.println("a. Mostrar (escibe solo la letra).");
            System.out.println("b. Mover a la izquierda (escibe solo la letra).");
            System.out.println("c. Mover a la derecha (escibe solo la letra).");
            System.out.println("d. Invertir (escibe solo la letra).");
            System.out.println("e. Salir (escibe solo la letra).");
            System.out.println();

            eleccion = sc.next().charAt(0);

            switch (eleccion) {
                case 'a' -> mostrarArray(ejemplo);
                case 'b' -> moverArrayIzquierda(ejemplo);
                case 'c' -> moverArrayDerecha(ejemplo);
                case 'd' -> invertirArray(ejemplo);
                case 'e' -> System.out.println("Hasta luego");
                default -> System.out.println("Opcion no valida.");
            }
        } while (eleccion != 'e');
        sc.close();
    }

    public void rellenarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20) + 1;
        }
    }

    public void mostrarArray(int[] array) {
        rellenarArray(array);
        System.out.print("El array es: ");
        for (int i = 0; i < array.length; i++) {  // Usa índice i
            System.out.print(array[i]);
            if (i < array.length - 1) {  // Compara índice
                System.out.print(", ");  // print, no println
            }
        }
        System.out.println();
    }

    public void moverArrayIzquierda(int[] array){
        mostrarArray(array);
        int temporal = array[0];
        for (int i = 0; i < array.length-1 ; i++) {
                array[i] = array[i+1];
        }
        array[array.length-1] = temporal;
        System.out.println("Array movido a la iszquierda:");
        mostrarArray(array);
    }

    public void moverArrayDerecha (int[] array){
        mostrarArray(array);
        int temporal = array[array.length-1];
        for (int i = array.length -1; i > 0 ; i--) {
            array[i] = array[i-1];
        }
        array[0]=temporal;

        System.out.println("Array movido a la derecha:");
        mostrarArray(array);
    }

    public void invertirArray(int[] array) {
        mostrarArray(array);
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println("Array invertido:");
        mostrarArray(array);
    }
}

