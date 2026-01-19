package Ejercicios;

import Model.Cliente;
import Model.Direccion;

public class ClienteMain {
    public static void main(String[] args) {

        Direccion d1 = new Direccion("Calle Mayor 15", "Madrid", 28001);
        Cliente c1 = new Cliente("Carlos Ruiz", "carlos.ruiz@email.com", d1);

        c1.mostrarDatos();

    }
}
