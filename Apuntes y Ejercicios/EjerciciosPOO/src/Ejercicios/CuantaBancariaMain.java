package Ejercicios;

import Model.CuentaBancaria;

public class CuantaBancariaMain {

    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("Juan Gracia",1500);
        CuentaBancaria cuenta2 = new CuentaBancaria("Maria Lopez",800);
        CuentaBancaria cuenta3 = new CuentaBancaria("Pedro Martin",1200);

        System.out.println("Cuenta de " +cuenta1);
        cuenta1.depositar(500);
        System.out.println();

        System.out.println("Cuenta de " +cuenta2);
        cuenta2.retirar(200);
        System.out.println();

        System.out.println("Cuenta de " +cuenta3);
        cuenta3.depositar(300);
        System.out.println();

        System.out.println();
        System.out.println("Saldos finales:");
        System.out.println(cuenta1);
        System.out.println(cuenta2);
        System.out.println(cuenta3);

    }
}
