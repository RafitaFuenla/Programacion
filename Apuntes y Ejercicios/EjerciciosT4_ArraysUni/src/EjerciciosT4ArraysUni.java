import java.util.Scanner;


public class EjerciciosT4ArraysUni {
    public void ejercicio01() {

        String[] frutas = {"Manzana", "Plátano", "Naranja", "Fresa", "Uva"};

        for (int i = 0; i < frutas.length; i++) {
            System.out.printf("Estos son los elementos del array: %s%n", frutas[i]);
        }
    }

    public void ejercicio02() {

        int[] numeros = new int[6];

        System.out.println("Recorriendo el array:");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100) + 1;
            System.out.printf("Posicion %d: %d\n", i, numeros[i]);
        }

    }

    public void ejercicio03() {
        // Desarrolla un programa que cree un array vacío de tamaño 5.
        // Usa un bucle for para pedir al usuario que introduzca 5 nombres,
        // guardándolos en el array.
        // Al final, muestra todos los nombres almacenados.

        Scanner sc = new Scanner(System.in);

        String[] nombres = new String[5];

        for (int i = 0; i < nombres.length; i++) {
            System.out.printf("Introduce el nombre %d:", i + 1);
            nombres[i] = sc.next();
        }

        System.out.println("\nNombres introducidos:");
        for (String item : nombres) {
            System.out.println(item);
        }

        sc.close();
    }

    public void ejercicio04() {

        //Crea un programa con un array de 7 números.
        // Pide al usuario un número a buscar y usa un bucle for para recorrer el array.
        // Si el número existe, muestra su posición.
        // Si no existe, indica que no se encontró.

        Scanner sc = new Scanner(System.in);

        int[] num = {5, 12, 8, 3, 15, 9, 6};

        System.out.println("Introduce el número a buscar: ");
        int buscar = sc.nextInt();

        int posicion = -1;  // -1 significa "no encontrado"

        for (int i = 0; i < num.length; i++) {
            if (buscar == num[i]) {
                posicion = i;
                break;
            }
        }

        if (posicion != -1) {
            System.out.printf("El numero %d se encuentra en la posicion %d.\n", buscar, posicion);
        } else {
            System.out.printf("El numero %d no se encuentra en el array.\n", buscar);
        }

        System.out.println();
        System.out.println("Contenido del array:");
        for (int numero : num) {

            System.out.printf("%d.", numero);
        }

        sc.close();
    }

    public void ejercicio05() {

        // Escribe un programa que defina un array de 10 números enteros.
        // Usa un bucle for para contar cuántos números son mayores que 50
        // y muestra el resultado.

        int[] num = {23, 67, 45, 89, 12, 56, 78, 34, 90, 43};
        int mayores = 0;

        for (int n : num) {
            if (n >= 50) {
                mayores++;
            }
        }
        System.out.printf("Cantidad de numero encontrados mayores a 50 = %d", mayores);
    }

    public void ejercicio06() {

        //Crea un programa con un array de 8 números decimales.
        // Recorre el array con un bucle for para calcular la suma de todos los elementos.
        // Luego, calcula y muestra el promedio.

        double[] numeros = {4.5, 7.2, 3.8, 9.1, 5.6, 8.3, 6.7, 4.9};

        double suma = 0;

        for (double n : numeros) {
            suma += n;
        }
        System.out.printf("La suma todal es = %.2f%n", suma);

        System.out.printf("El promedio es = %.2f", suma / numeros.length);
    }

    public void ejercicio07() {

        //Desarrolla un programa que cree un array de 6 números.
        // Usa bucles for para encontrar el número mayor y el número menor del array,
        // y muestra ambos resultados.

        int[] numeros = {15, 8, 23, 4, 19, 12};

        // Inicializar con el primer elemento
        int mayor = numeros[0];
        int menor = numeros[0];

        // Buscar el mayor y el menor
        for (int n : numeros) {
            if (n > mayor) {
                mayor = n;
            }
            if (n < menor) {
                menor = n;
            }
        }

        // Mostrar resultados (FUERA del bucle)
        System.out.printf("El numero mayor es = %d\n", mayor);
        System.out.printf("El numero menor es = %d\n", menor);
    }

    public void ejercicio08() {

        //Crea un programa con un array de 10 palabras (pueden repetirse).
        // Pide al usuario una palabra
        // y usa un bucle for para contar cuántas veces aparece esa palabra en el array.

        Scanner sc = new Scanner(System.in);

        String[] animales = {"gato", "perro", "gato", "pájaro", "gato", "pez", "perro", "gato", "conejo", "perro"};

        System.out.println("Introduce la palabra a buscar (gato, perro, pajaro, pez o conejo)");
        String palabra = sc.next().toLowerCase();

        int contador = 0;

        for (String item : animales){
            if (item.equals(palabra)) {
                contador++;
            }
            else {
                System.out.println("Tienes que iontroducir un animal correcto (gato, perro, pajaro, pez o conejo).");
            }
        }
        System.out.printf("La palabra %s aparece %d veces en el array", palabra, contador);

        sc.close();
    }
}
