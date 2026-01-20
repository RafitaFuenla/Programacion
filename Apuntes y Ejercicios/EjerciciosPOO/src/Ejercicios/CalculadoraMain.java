package Ejercicios;

import Model.Calculadora;

public class CalculadoraMain {
    public static void main(String[] args) {
        int sumar = Calculadora.suma(10 , 5);
        int restar = Calculadora.resta(10, 5);
        int multiplicacion = Calculadora.multiplicacion( 10 , 5);
        double division = Calculadora.division(10 , 5);
        double potencia = Calculadora.potencia(2 , 3);


        System.out.println("Suma: 10 + 5 = " +sumar);
        System.out.println("Resta: 10 - 5 = " +restar);
        System.out.println("Multiplicacion: 10 * 5 = " +multiplicacion);
        System.out.println("Division: 10 / 5 = " +division);
        System.out.println("Potencia: 2^3 = " +potencia);
    }

}
