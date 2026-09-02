package Model;

public class SumaYMediaArray {
    public static void main(String[] args) {

        int[] numeros = {1,2,3,4,5};
        int suma = 0;

        for (int i : numeros){
            suma += i;

        }

        System.out.printf("El resultado de la suma es: %d ", suma);
        System.out.println();

        double media = (double) suma / numeros.length;

        System.out.printf("La media es: %.2f", media);

    }

}