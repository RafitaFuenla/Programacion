package Model;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraCompleja {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {

            // Pedir operacion
            char simbolo = pedirOperacion(sc);

            // Preguntar números:
            int num1 = pedirNumero(sc, "Introduce el primer número.");
            int num2 = pedirNumero(sc, "Introduce el segundo número.");


            // Calcular el resultado
            try {
                calculo(num1, num2, simbolo);
            } catch (ArithmeticException e) { // En caso de division entre 0
                System.out.println("❌ No se puede dividir entre 0. Detalle: " + e.getMessage());
            }

            // Preguntar si quiere seguir haciendo mas operaciones
            char seguir = preguntarSeguir(sc);

            if (seguir == 'n'){
                continuar  = false;
            }
//
        }
    }


    public static char pedirOperacion(Scanner sc) {

        boolean hayErrorOperacion = true;
        char simbolo = ' ';

        while (hayErrorOperacion) {
            System.out.println("¿Que operación quieres hacer? ( + , - , * , / )");
            simbolo = sc.next().charAt(0);

            if (simbolo == '+' || simbolo == '-' || simbolo == '*' || simbolo == '/') {
                hayErrorOperacion = false;
            } else {
                System.out.println("❌ Símbolo inválido, inténtalo de nuevo.");
            }
        }
        return simbolo;
    }

    public static int pedirNumero(Scanner sc, String mensaje) {
        int numero = 0;
        boolean hayError = true;

        while (hayError) {
            try {
                System.out.println(mensaje);
                numero = sc.nextInt();
                hayError = false;
            } catch (InputMismatchException e) {
                System.out.println("❌ Eso no es un número válido, inténtalo de nuevo.");
                sc.nextLine();
            }
        }

        return numero;
    }

    public static char preguntarSeguir(Scanner sc) {

        boolean hayErrorRespuesta = true;
        char seguir = ' ';

        while (hayErrorRespuesta) {
            System.out.println("¿Quieres realizar mas operaciones? (s/n)");
            seguir = sc.next().charAt(0);
            seguir = Character.toLowerCase(seguir); //Para cambiar el char a minuscula

            switch (seguir) {
                case 's' -> hayErrorRespuesta = false;
                case 'n' -> {
                    hayErrorRespuesta = false; // Sale de este while
                }
                default -> System.out.println("❌ Respuesta invalida, escribe 's' o 'n'.");
            }
        }
        return seguir;
    };

    public static void calculo(int num1, int num2, char operacion) {

        int resultado = 0;

        switch (operacion) {
            case '+' -> resultado = num1 + num2;
            case '-' -> resultado = num1 - num2;
            case '*' -> resultado = num1 * num2;
            case '/' -> resultado = num1 / num2;
            default -> throw new IllegalArgumentException("❌ Símbolo de operación erróneo.");
        }
        System.out.println("El resultado es: " + resultado);
    }
}