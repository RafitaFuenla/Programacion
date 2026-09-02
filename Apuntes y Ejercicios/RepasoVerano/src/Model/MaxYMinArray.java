package Model;

public class MaxYMinArray {
    public static void main(String[] args) {

        int[] numeros = {3, 7, 1, 9, 4};

        int maximo = numeros[0];
        int minimo = numeros[0];

        for (int i : numeros){
            if (maximo < i){
                maximo = i;
            }
            if (minimo > i){
                minimo = i;
            }

        }
        System.out.println("El numero maximo es: " + maximo);

        System.out.println("El numero minimo es: " + minimo );

    }
}
