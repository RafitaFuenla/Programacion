package Ejercicio2CalculadoraImpuestos;

import java.util.Scanner;

public class ejercicio {
    public void impuestos(){
        // Crea un programa que pida al usuario su salario anual y calcule el impuesto a pagar según las siguientes reglas:
        //- Menos de 10.000€: no paga impuestos
        //- Entre 10.000€ y 20.000€: paga el 5% de impuestos
        //- Entre 20.000€ y 35.000€: paga el 15% de impuestos
        //- Más de 35.000€: paga el 20% de impuestos
        //El programa debe mostrar el salario original y el monto de impuestos a pagar.

        Scanner sc = new Scanner (System.in);

        System.out.println("¿Cuanto cobras al año?");
        int salario = sc.nextInt();

        double porcentaje1 = 5.0;
        double porcentaje2 = 15.0;
        double porcentaje3 = 20.0;

        if (salario < 10000){
            System.out.println("No pagas impuestos, por tu salario bajo");
        } else if (salario < 20000) {
            double impuesto = salario * (porcentaje1 / 100);
            int resultado = salario - (int)impuesto;
            System.out.printf("Pagas el %.0f%% de impuestos, es decir %.2f€. Se te queda un salario neto de: %d€", porcentaje1, impuesto, resultado);
        } else if (salario < 35000 ){
            double impuesto = salario * (porcentaje2 / 100);
            int resultado = salario - (int)impuesto;
            System.out.printf("Pagas el %.0f%% de impuestos, es decir %.2f€. Se te queda un salario neto de: %d€", porcentaje2, impuesto, resultado);
        }else{
            double impuesto = salario * (porcentaje3 / 100);
            int resultado = salario - (int)impuesto;
            System.out.printf("Pagas el %.0f%% de impuestos, es decir %.2f€. Se te queda un salario neto de: %d€", porcentaje3, impuesto, resultado);
        }
        sc.close();
    }
}
