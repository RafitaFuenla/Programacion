import java.util.function.DoubleToIntFunction;

public class EjerciciosPractica {
    public static void main(String[] args) {

        // EJERCICIO 1
        String nombre = "Ana";
        int anos = 25;
        String ciudad = "Madrid";
        System.out.println(nombre);
        System.out.println(anos);
        System.out.println(ciudad);
        System.out.println();

        // EJERCICIO 2
        int puntuacion = 0;
        System.out.println("Puntuacion inicial: " + puntuacion);
        puntuacion = puntuacion + 5;
        System.out.println("Despues de primera modificacion: " + puntuacion);
        puntuacion = puntuacion + 5;
        System.out.println("Despues de la segunda modificacion: " + puntuacion);
        puntuacion = puntuacion + 5;
        System.out.println("Puntuacion final: " + puntuacion);
        System.out.println();

        // EJERCICIO 3
        String nombre3 = "Carlos";
        int edad = 30;
        boolean estudiante = true;
        double altura = 1.75;
        char inicial = 'C';
        // He tenido que investigar un poco para averiguar como sacar por consola el tipo de dato que es, creia que era typeOf, como en JS, pero no, es bastante mas complicado, jejeje
        System.out.println("Nombre: " + nombre3 + " - Tipo: " + ((Object) nombre3).getClass().getSimpleName());
        System.out.println("Edad: " + edad + " - Tipo: " + ((Object) edad).getClass().getSimpleName());
        System.out.println("¿Es estudiante?: " + estudiante + " - Tipo: " + ((Object) estudiante).getClass().getSimpleName());
        System.out.println("Inicial: " + inicial + " - Tipo: " + ((Object) inicial).getClass().getSimpleName());
        System.out.println();

        // EJERCICIO 4
        String titulo = "Don quijote de la Mancha";
        String autor = "Miguel de Cervantes";
        int publicacion = 1605;
        int pagina = 863;
        boolean disponible = true;
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicacion: " + publicacion);
        System.out.println("Numero de paginas: " + pagina);
        System.out.println("¿Disponible en bibleteca?: " + disponible);
        System.out.println();

        // EJERCICIO 5
        final String aplicaicon = "MiApp";
        String ver = "1.0.0";
        final double pi = Math.PI;
        String usuario = "Laura";
        int nivel = 1;
        int puntuacionFinal = 0;
        System.out.println("Aplicacion: " + aplicaicon);
        System.out.println("Version: " + ver);
        System.out.println("Valor de PI: " + pi);
        System.out.println("Usuario actual: " + usuario);
        System.out.println("Nivel: " + nivel);
        System.out.println("Puntuacion: " + puntuacionFinal);
        usuario = "Miguel";
        nivel = 2;
        puntuacionFinal = 150;
        System.out.println("Usuario actualizado: " + usuario);
        System.out.println("Nivel actualizado: " + nivel);
        System.out.println("Puntuacion actualizada: " + puntuacionFinal);
        System.out.println();

        //EJERCICIO 6
        int num1 = 10;
        int num2 = 5;
        System.out.println("El resultado de la suma es: " + (num1 + num2));
        System.out.println("El resultado de la resta es: " + (num1 - num2)); // PORQUE tengo que poner (num1-num2) entre parentisis y los demas ejemplos no??
        System.out.println("El resultado de la multiplicacion es: " + (num1 * num2));
        System.out.println("El resultado de la division es: " + (num1 / num2));
        System.out.println();


        //EJERCICIO 7
        String nombre7 = "Elena";
        String apellido7 = "Garcia";
        int edad7 = 24;
        String ciudad7 = "Barcelona";
        System.out.println("Hola me llamo " + nombre7 + apellido7 + ".");
        System.out.println("Tengo " + edad7 + " años y vivo en " + ciudad7 + ".");
        System.out.println();

        //EJERCICIO 8
        int b = 5;
        int h = 3;
        System.out.println("La base del rectangulo es: " + b + ".");
        System.out.println("La altura del rectangulo es: " + h + ".");
        System.out.println("El area del rectangulo es: " + (b * h) + ".");
        System.out.println();


        //EJERCICIO 9
        String product = "Auriculares Bluetooth";
        double price = 29.99;
        String cod = "AUR-2023";
        boolean dispo = true;
        System.out.println("INFORMACIÓN DEL PRODUCTO");
        System.out.println("--------------------------");
        System.out.println("Nombre: " + product);
        System.out.println("Precio: " + price + "€");
        System.out.println("Codigo: " + cod);
        System.out.println("Disponible: " + dispo);
        System.out.println();

        //EJERCICIO 10
        int c = 25;
        int f = (c * 9 / 5) + 32;
        System.out.println("La termperatura en celcius es: " + c);
        System.out.println("La temperatura en Farenheit es: " + f);
    }


}
