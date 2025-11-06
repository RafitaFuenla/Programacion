import java.util.Scanner;

public class Ejercicios {
    public Scanner scanner;

    public void ejercicio01() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero que represente el dia de la semana (1-7): ");
        int numero = scanner.nextInt();

        switch (numero) {
            case 1:
                numero = 1;
                System.out.println("El dia de la semana es LUNES");
                break;
            case 2:
                numero = 2;
                System.out.println("El dia de la semana es MARTES");
                break;
            case 3:
                numero = 3;
                System.out.println("El dia de la semana es MIERCOLES");
                break;
            case 4:
                numero = 4;
                System.out.println("El dia de la semana es JUEVES");
                break;
            case 5:
                numero = 5;
                System.out.println("El dia de la semana es VIERNES");
                break;
            case 6:
                numero = 6;
                System.out.println("El dia se la semana es SABADO");
                break;
            case 7:
                numero = 7;
                System.out.println("El dia de la semana es DOMINGO");
                break;

            default:
                System.out.println("Tienes que introducir un numero de 1 al 7, reprensentado cada dia de la semana.");

        }
        scanner.close();
        scanner = null;
    }

    public void ejercicio02() {
        Scanner scanner = new Scanner(System.in);

        //Desarrolla un programa que pida una letra de calificación (A, B, C, D, F)
        // y use un switch para mostrar el mensaje correspondiente:
        // A="Excelente", B="Muy bien", C="Bien", D="Suficiente", F="Insuficiente".

        System.out.println("Introduce tu calificacion (A-E):");
        char calificacion = scanner.next().charAt(0);

        switch (calificacion) {
            case 'A':
                System.out.println("Excelente");
                break;
            case 'B':
                System.out.println("Muy bien");
                break;
            case 'C':
                System.out.println("Bien");
                break;
            case 'D':
                System.out.println("Suficiente");
                break;
            case 'E':
                System.out.println("Insuficiente");
                break;
            default:
                System.out.println("Introduce: A, B, C, D o E");
        }

        scanner.close();
        scanner = null;
    }

    public void ejercicio03() {
        Scanner scanner = new Scanner(System.in);

        //Escribe un programa que pida dos números y una operación (+, -, *, /).
        // Usa un switch para realizar la operación correspondiente y mostrar el resultado.

        System.out.println("Introduce un numero:");
        int num1 = scanner.nextInt();
        System.out.println("Introduce un segundo numero:");
        int num2 = scanner.nextInt();
        System.out.println("Introduce una operacion (+, -, *, /):");
        String operacion = scanner.next();

        switch (operacion) {
            case "+":
                System.out.printf("El resultado es: %d + %d = %d", num1, num2, num1 + num2);
                break;
            case "-":
                System.out.printf("El resultado es: %d - %d = %d", num1, num2, num1 - num2);
                break;
            case "*":
                System.out.printf("El resultado es: %d * %d = %d", num1, num2, num1 * num2);
                break;
            case "/":
                System.out.printf("El resultado es: %d / %d = %.2f", num1, num2, (double) num1 / num2);
                break;
            default:
                System.out.println("Tienes que introducir uno de los siguientes simbolos: + , - , / , o *");

        }

        scanner.close();
        scanner = null;
    }

    public void ejercicio04() {
        Scanner scanner = new Scanner(System.in);

        //Crea un programa que muestre un menú con 4 opciones:
        // 1=Ver perfil, 2=Configuración, 3=Ayuda, 4=Salir.
        // Pide al usuario que elija una opción
        // y usa un switch para mostrar el mensaje correspondiente a cada opción.

        System.out.println("--- MENÚ ---");
        System.out.println("1. Ver perfil");
        System.out.println("2. Configuración");
        System.out.println("3. Ayuda");
        System.out.println("4. Salir");
        System.out.println("Elige una opcion (introduce el numero)");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Has seleccionado: Ver perfil");
                break;
            case 2:
                System.out.println("Has seleccionado: Configuracion");
                break;
            case 3:
                System.out.println("Has seleccionado: Ayuda");
                break;
            case 4:
                System.out.println("Has seleccionado: Salir");
                break;
            default:
                System.out.println("Tienes que elegir una opcion del 1 al 4.");
        }

        scanner.close();
        scanner = null;
    }

    public void ejercicio05() {
        Scanner scanner = new Scanner(System.in);
        //Desarrolla un programa que pida un mes (número del 1 al 12)
        // y use un switch para determinar la estación del año:
        // Invierno (12, 1, 2), Primavera (3, 4, 5), Verano (6, 7, 8), Otoño (9, 10, 11).

        System.out.println("Introduce el número del mes (1-12): ");
        int mes = scanner.nextInt();

        switch (mes) {
            case 12, 1, 2:
                System.out.println("Invierno");
                break;
            case 3, 4, 5:
                System.out.println("Primavera");
                break;
            case 6, 7, 8:
                System.out.println("Verano");
                break;
            case 9, 10, 11:
                System.out.println("Otoño ");
                break;
            default:
                System.out.println("Tienes que introducir un numero del 1 al 12 (representando los numero de los meses.");
        }

        scanner.close();
        scanner = null;
    }

    public void ejercicio06() {
        Scanner scanner = new Scanner(System.in);
        //Escribe un programa que pida un número
        // y use un bucle for para mostrar su tabla de multiplicar del 1 al 10.

        System.out.println("Introduce un numero: ");
        int num = scanner.nextInt();

        System.out.printf("La tabla del : %d\n", num);

        System.out.println();

        for (int i = 0; i < 11; i++) {
            System.out.printf("%d * %d = %d\n", num, i, num * i);
        }

        scanner.close();
        scanner = null;
    }

    public void ejercicio07() {
        Scanner scanner = new Scanner(System.in);

        //Crea un programa que pida un número N
        // y use un bucle for para calcular la suma de todos los números desde 1 hasta N. Muestra el resultado final.
        // RESULTADO POR CONSOLA:
        // Introduce un número: 5
        //Sumando: 1 + 2 + 3 + 4 + 5
        //La suma de números del 1 al 5 es: 15

        System.out.println("Introduce un numero: ");
        int num = scanner.nextInt();

        int suma = 0;
        String operacion = "Sumando: ";

        for (int i = 1; i <= num; i++) {
            suma += i;
            operacion += i;

            if (i < num) {
                operacion += " + ";
            }
        }

        System.out.println(operacion);
        System.out.printf("La suma de números del 1 al %d es: %d\n", num, suma);

        scanner.close();
        scanner = null;
    }

    public void ejercicio08() {
        Scanner scanner = new Scanner(System.in);

        //Desarrolla un programa que pida un número N
        // y use un bucle for para contar cuántos números pares e impares hay desde 1 hasta N.
        // Muestra ambos contadores.
        // RESULTADO POR CONSOLA:
        //Introduce un número: 10
        // Recorriendo números del 1 al 10...
        // Números pares encontrados: 5
        // Números impares encontrados: 5

        System.out.println("Introduce un numero:");
        int num = scanner.nextInt();

        System.out.printf("Recorriendo numero del 1 al %d\n.", num);

        int contadorPares = 0;
        int contadorImpares = 0;

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                contadorPares++;
            } else {
                contadorImpares++;
            }
        }

        System.out.printf("Numeros pares encontrados: %d\n", contadorPares);
        System.out.printf("Numeros impares encontrados: %d\n", contadorImpares);

        scanner.close();
        scanner = null;
    }

    public void ejercicio09() {
        Scanner scanner = new Scanner(System.in);

        //Escribe un programa que pida un número entero positivo
        // y calcule su factorial usando un bucle for.
        // El factorial de N es: N! = N × (N-1) × (N-2) × ... × 1

        // RESULTADO POR CONSOLA:
        // Introduce un número: 5
        //Calculando 5!
        //5 x 4 x 3 x 2 x 1
        //El factorial de 5 es: 120

        System.out.println("Introduce un numero:");
        int num = scanner.nextInt();

        System.out.printf("Calculando %d!\n", num);

        long multi = 1;
        String operacion = "";

        for (int i = num; i >= 1; i--) {
            multi *= i;
            operacion += i;

            if (i > 1) {
                operacion += " x ";
            }
        }

        System.out.println(operacion);
        System.out.printf("El factorial de %d es: %d\n", num, multi);


        scanner.close();
        scanner = null;
    }

}
