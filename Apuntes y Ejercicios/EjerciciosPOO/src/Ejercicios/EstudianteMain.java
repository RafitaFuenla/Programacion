package Ejercicios;

import Model.Estudiante;

public class EstudianteMain {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Laura Fernandez",20, 8.5);

        System.out.println(estudiante1);

        estudiante1.setNota(12);
        estudiante1.setNota(-3);

    }
}
