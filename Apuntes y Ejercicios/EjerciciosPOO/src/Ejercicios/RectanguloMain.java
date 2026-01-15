package Ejercicios;

import Model.Rectangulo;

public class RectanguloMain {
    public static void main(String[] args) {

        Rectangulo rectangulo1 = new Rectangulo(5.0,3.0);

        System.out.println("Area del rectangulo:" +rectangulo1.calcularArea());
        System.out.println("Perimetro del rectangulo:" +rectangulo1.calcularPerimetro());

    }

}
