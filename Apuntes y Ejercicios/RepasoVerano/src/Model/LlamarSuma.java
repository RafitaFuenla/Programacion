package Model;

public class LlamarSuma {


    public static void main(String[] args) {
        int[] misNumeros = {2,4,1,7,9,4};
        int total = resultadoSuma(misNumeros);
        System.out.println("El resultado es: " + total);
    }

    public static int resultadoSuma(int[] numeros) {

        int suma = 0;

        for (int i : numeros){
            suma += i;
        }
        return suma;
    };
}
