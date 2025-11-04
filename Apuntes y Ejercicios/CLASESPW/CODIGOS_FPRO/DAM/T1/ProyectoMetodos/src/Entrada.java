import model.Calculadora;

import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
        System.out.println("Proyecto metodos");
        System.out.println("Vamos a realizar llamadas a metodos");
        /*
        String data="Laura";
        saludar(data);
        despedir();
        data = "Borja";
        System.out.println();
        saludar(data);
        despedir();*/
        int numero;
        Calculadora operacionesMatematicas = new Calculadora();
        // operacionesMatematicas.sumar(1, 4);
        // operacionesMatematicas.restar(8, 5);
        // operacionesMatematicas.restar(8, 9);
        // System.out.println(operacionesMatematicas.multiplicar(7,3)*4); // 21
        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("Que numero quieres validar");
        int numeroValidar = lectorTeclado.nextInt();
        System.out.println("El numero que se intenta validar tiene como resultado: "
                + operacionesMatematicas.validarNumero(numeroValidar));
    }

    public static void saludar(String nombre) {
        System.out.println("Hola " + nombre);
        System.out.println("Encantado de saludarte, vamos a practicar");
        System.out.println("Vamos a practicar el llamado de metodos");
        System.out.println("Vamos, a por el día");
    }

    public static void despedir() {
        System.out.println("A cerrar el portatil, a pasar la tarde a casa");
    }

}
