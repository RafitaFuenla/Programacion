import java.util.Scanner;

public class EjerciciosT3While {
    public Scanner scanner;

    public void ejercicio01() {
        Scanner scanner = new Scanner(System.in);

        // Crea un programa que pida un número N y use un bucle while
        // para contar desde 1 hasta N, mostrando cada número.

        System.out.println("Introduce un numero:");
        int num = scanner.nextInt();

        System.out.println("Contando con While:");

        int crece = 0;

        while (crece<num){
            crece++;
            System.out.println(crece);
        }

        System.out.println("Fin del conteo.");

        scanner.close();
        scanner = null;
    }

    public void ejercicio02(){
        //Desarrolla un programa que pida al usuario una contraseña.
        // La contraseña correcta es "1234".
        // Usa un bucle do-while para seguir pidiendo la contraseña
        // hasta que el usuario la introduzca correctamente.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la contraseña de 4 digitos numericos:");
        int pass = scanner.nextInt();

        while (pass!=1234){
            System.out.println("Contraseña incorrecta. Intenta de nuevo.");
            System.out.println("Introduce la contraseña de 4 digitos numericos:");
            pass = scanner.nextInt();
        }

        System.out.println("¡Contraseña correcta! Acceso permitido.");

        scanner.close();
        scanner = null;
    }

    public void ejercicio03(){
        Scanner scanner = new Scanner(System.in);

        // Escribe un programa que pida números al usuario y los vaya sumando.
        // El bucle while debe continuar mientras el usuario introduzca números positivos.
        // Cuando introduzca un número negativo o cero,
        // el programa debe terminar y mostrar la suma total.

        System.out.println("Introduce un número para sumar (0 o negativo para terminar):");
        int num = scanner.nextInt();

        int suma = 0;

        while (num > 0){
            suma = suma + num;
            System.out.printf("Suma actual: %d\n",suma);
            System.out.println("Introduce un nuevo número para sumar (0 o negativo para terminar)::");
            num = scanner.nextInt();
        }
        System.out.printf("Programa terminado. Suma total: %d", suma);

        scanner.close();
        scanner = null;
    }

    public void ejercicio04(){
        Scanner scanner = new Scanner(System.in);

        // Crea un juego donde el programa elige un número secreto entre 1 y 10 (por ejemplo, 7).
        // Usa un bucle do-while para pedir al usuario que adivine el número.
        // El programa debe indicar si el número es mayor o menor, y continuar hasta que el usuario acierte.

        System.out.println("¡Adivina el número entre 1 y 10!");
        int secretNum = 7;
        System.out.println("Introduce tu intento:");
        int num = scanner.nextInt();
        System.out.println();

        int intentos = 1;

        while (num != secretNum ){

            if (num < secretNum) {
                System.out.println("El número secreto es MAYOR");
            } else {
                System.out.println("El número secreto es MENOR");
            }

            System.out.println("Introduce tu intento:");
            num = scanner.nextInt();

            intentos++;
        }

        System.out.println("¡CORRECTO! Lo adivinaste en " + intentos + " intentos.");

        scanner.close();
        scanner = null;
    }
}s
