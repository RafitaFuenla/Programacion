package Ejercicios;

import Model.Producto;

public class ProdcutoMain {
    public static void main(String[] args) {
        Producto p1 = new Producto("Teclado", 45.99, 10);
        Producto p2 = new Producto("Raton", 25.5, 25);
        Producto p3 = new Producto("Monitor", 299.99, 5);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

    }
}
