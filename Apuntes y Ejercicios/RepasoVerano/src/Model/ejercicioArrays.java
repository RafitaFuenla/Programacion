package Model;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicioArrays {

    public static void main(String[] args) {

        ArrayList<String> nombres = pedirNombres();
        String largo = nombreMasLargo(nombres);
        System.out.println("El nombre mas largo es: " + largo);
    }

    public static ArrayList<String> pedirNombres() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();

        boolean seguirPidiendo = true;
        while (seguirPidiendo) {
            System.out.println("Introduce un nombre (o escribe 'fin' para terminar):");
            String entrada = scanner.next();

            if (entrada.equalsIgnoreCase("fin")) { //Si es "FIN", cambia a minusuculas
                seguirPidiendo = false;
            } else {
                nombres.add(entrada); // Las demás entradas, déjalas como están
            }
        }
        return nombres;
    }

    public static String nombreMasLargo(ArrayList<String> nombresInsertados) {
        int maximo = nombresInsertados.getFirst().length();
        String nombreGanador = nombresInsertados.getFirst();

        for (String i : nombresInsertados) {
            if (maximo < i.length()) {
                maximo = i.length();
                nombreGanador = i;
            }
        }
        return nombreGanador;
    }
}