package Ejercicios;

import Model.Empleado;

public class EmpleadoMain {
    public static void main(String[] args) {

        // Crear array de 5 empleados
        Empleado[] empleados = new Empleado[5];

        // Inicializar los empleados
        empleados[0] = new Empleado("Ana Pérez", "Desarrolladora", 35000.0);
        empleados[1] = new Empleado("Luis García", "Diseñador", 28000.0);
        empleados[2] = new Empleado("María Torres", "Project Manager", 42000.0);
        empleados[3] = new Empleado("Jorge Díaz", "Analista", 32000.0);
        empleados[4] = new Empleado("Laura Sánchez", "Tester", 26000.0);


        // Mostrar lista de los empleados
        System.out.println("Lista de empleados:");
        for (int i = 0; i < empleados.length; i++) {
            System.out.println((i + 1) + ". " + empleados[i]);
        }

        // Encontrar mayor Salario
        Empleado mayorSalario = empleados[0];
        for (int i = 1; i < empleados.length; i++) {
            if (empleados[i].getSalario() > mayorSalario.getSalario()) {
                mayorSalario = empleados[i];
            }
        }

        System.out.println("\nEmpleado con mayor salario: " + mayorSalario.getNombre() + " (" + mayorSalario.getSalario() + "€).");

        // Promedio salario
        double suma = 0;
        for (int i = 0; i < empleados.length; i++) {
            suma += empleados[i].getSalario();
        }
        double promedio = suma / empleados.length;
        System.out.println("Salario promedio: " + promedio + "€.");


    }
}
