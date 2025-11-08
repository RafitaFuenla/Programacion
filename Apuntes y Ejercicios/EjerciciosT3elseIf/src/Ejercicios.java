 import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicios {
    public Scanner scanner;

    public void ejercico01() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu edad");
        int edad = scanner.nextInt();

        if (edad >= 18) {
            ;
            System.out.println("Eres mayor de edad, puedes votar");
        } else {
            System.out.println("Eres menor, no puedes votar");
        }

        scanner = null;
        scanner.close();
    }

    public void ejercicio02() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero, ya sea positivo, negativo o cero:");
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println("Tu numero es positivo");
        } else if (num == 0) {
            System.out.println("Tu numero es cero");
        } else {
            System.out.println("Tu numero es negativo");
        }

        scanner.close();
        scanner = null;
    }

    public void ejercicio03() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu nota:");
        double nota = scanner.nextDouble();

        if (nota >= 0 && nota < 5) {
            System.out.println("Lo siento, pero tu examen esta suspenso.");
        } else if (nota <= 10) {
            System.out.println("Enhorabuena, tu examen esta aprobado.");
        } else {
            System.out.println("Nota no valida. Introduce un numero del 0 al 10.");
        }

        scanner.close();
        scanner = null;
    }

    public void ejercicio04() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el importe de la compra:");
        double compra = scanner.nextDouble();
        double compraDto = 0;

        if (compra >= 100) {
            compraDto = compra * 0.1;
        }
        System.out.println("El importe total de la compra es: " + compra + "€");
        System.out.println("El importe del descuento es: " + compraDto + "€");
        System.out.println("El importe final es: " + (compra - compraDto) + " €");

        scanner.close();
        scanner = null;
    }

    public void ejercicio05() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero:");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número " + numero + ", es par.");
        } else {
            System.out.println("El número " + numero + ", es impar.");
        }

        scanner.close();
        scanner = null;
    }

    public void ejercicio06() {
        scanner = new Scanner(System.in);

        System.out.println("Introduce tu edad:");
        int edad = scanner.nextInt();

        if (edad < 16) {
            System.out.println("Acceso denegado. Debes tener al menos 16 años");
        } else {
            System.out.println("Acceso permitido.");
        }

        scanner.close();
        scanner = null;
    }

    public void ejercicio07() {
        //nota numérica (0-10) y determine la calificación: Suspenso (0-4), Aprobado (5-6), Notable (7-8) o Sobresaliente (9-10).

        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Que nota has sacado?");
        double nota = scanner.nextDouble();

        if (nota < 5) {
            System.out.println("Tienes un suspenso.");

        } else if (nota >= 5 && nota < 7) {
            System.out.println("Tienes un aprobado.");

        } else if (nota >= 7 && nota < 9) {
            System.out.println("Tienes un notable.");

        } else if (nota >= 9 && nota < 10) {
            System.out.println("Tienes un notable.");

        } else {
            System.out.println("Nota fuera de rango. Introduce un numero del 0 al 10.");
        }

        scanner.close();
        scanner = null;
    }

    public void ejercicio08() {
        // pida dos números al usuario y determine cuál es mayor, o si son iguales. Muestra el resultado por consola.

        scanner = new Scanner(System.in);

        System.out.println("Introduce el primer numero:");
        int num1 = scanner.nextInt();
        System.out.println("Introduce el segiundo numero:");
        int num2 = scanner.nextInt();

        if (num1 < num2) {
            System.out.println("El numero " + num1 + " es menor que " + num2 + ".");
        } else if (num1 > num2) {
            System.out.println("El numero " + num1 + " es mayor que " + num2 + ".");
        } else if (num1 == num2) {
            System.out.println("El numero " + num1 + " es exactamente igual que " + num2 + ".");
        }

        scanner.close();
        scanner = null;
    }

    public void ejercicio09() {
        // pida el peso (en kg) y la altura (en metros) del usuario.
        // Calcula el IMC (peso / altura²) y determina
        // si está en peso normal (IMC entre 18.5 y 24.9),
        // por debajo del peso normal (IMC menor a 18.5)
        // o por encima del peso normal (IMC mayor a 24.9).

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu peso (en Kilogramos):");
        double peso = scanner.nextDouble();
        System.out.println("Introduce tu altura (en metros):");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        if (imc > 18.5 && imc < 24.9) {
            System.out.println("Tienes un imc de " + imc + ", es decir, tienes un peso normal.");
        } else if (imc < 18.5) {
            System.out.println("Tienes un imc de " + imc + ", es decir, tienes un peso por DEBAJO de lo normal. Cuidate un poco.");
        } else if (imc > 24.9) {
            System.out.println("Tienes un imc de " + imc + ", es decir, tienes un peso por ENCIMA de lo normal. Cuidate un poco.");
        }

        scanner.close();
        scanner = null;
    }

    public void ejercicio10() {

        //pida la altura del usuario (en cm) y determine si puede subir a una atracción.
        // La altura mínima es 120 cm y la máxima es 200 cm.
        // Si está dentro del rango, muestra "Puedes subir",
        // si no, indica el motivo (demasiado bajo o demasiado alto).

        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuanto mides? (expresalo en centimetros):");
        int altura = scanner.nextInt();

        if (altura >= 120 && altura <= 200) {
            System.out.println("Puedes subir a la atraccion.");

        } else if (altura < 120) {
            System.out.println("Lo siento, no puedes subir, eres demasiado BAJITO. Altura minima 120cm.");

        } else if (altura > 200) {
            System.out.println("Lo siento, eres demasiado ALTO para subir. Altura maxima 200cm.");
        }

        scanner.close();
        scanner = null;
    }

    public void ejercicio11() {
        // pida el importe de una compra y si el cliente es socio (true/false).
        // Aplica descuentos según estas reglas:
        // Si es socio Y la compra es mayor o igual a 200€, descuento del 20%.
        // Si es socio Y la compra es menor de 200€, descuento del 10%.
        // Si NO es socio pero la compra es mayor o igual a 300€, descuento del 5%.
        // En cualquier otro caso, no hay descuento.
        // Muestra el importe original, el descuento aplicado y el importe final.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Cuanto fue el importe de la compra");
        double importe = scanner.nextDouble();
        System.out.println("¿Eres socio de la tienda?");
        boolean socio = scanner.nextBoolean();

        double socioCompra200 = importe * 0.20;
        double socioCompra = importe * 0.1;
        double compra300 = importe * 0.05;

        System.out.println("El importe todal de la compra es: " + importe);

        if (socio && importe >= 200) {
            System.out.println("El descuento aplicado es: " + socioCompra200);
            System.out.println(("El importe final es: ") + (importe - socioCompra200));

        } else if (socio && importe < 200) {
            System.out.println("El descuento aplicado es: " + socioCompra);
            System.out.println(("El importe final es: ") + (importe - socioCompra));

        } else if (!socio && importe >= 300) {
            System.out.println("El descuento aplicado es: " + compra300);
            System.out.println(("El importe final es: ") + (importe - compra300));

        } else {
            System.out.println("No hay descuento que se pueda aplicar");
            System.out.println(("El importe final es: ") + importe);
        }

        scanner.close();
        scanner = null;
    }

    public void ejercicio12()   {
        Scanner scanner = new Scanner(System.in);


        // pida al usuario crear una contraseña.
        // La contraseña debe cumplir estos requisitos:
        // tener al menos 8 caracteres de longitud,
        // contener al menos un número,
        // y NO puede ser "12345678" o "password".
        // El programa debe verificar cada condición por separado usando operadores lógicos
        // y mostrar si la contraseña es válida o no, indicando qué requisitos no cumple.

        // Nota: Para este ejercicio, asume que tienes funciones auxiliares como longitudCadena(texto), contienNumero(texto).

        System.out.println("Introduce una contraseña: Minimo 8 caracteres, al menos un numero y NO puede ser 12345678 o password");
        String password = scanner.next();

        if (password.equals("12345678")) { // No peude ser igual a 12345678
            System.out.println("La contraseña no puede ser 12345678.");
        } else if (password.equals("password")) { // No peude ser igual a password
            System.out.println("La contraseña no puede ser password.");
        } else if (password.length() < 8) { // Cuantas letras tiene la palabra
            System.out.println("La contraseña tiene que tener al menos 8 digitos.");
        } else if (!password.matches(".*\\d.*")) {
            System.out.println("La contraseña tiene que tener al menos un número.");
        } else {
            System.out.println("Contraseña guardada con exito");
        }

        scanner.close();
        scanner = null;
    }

    public void ejercicio13() {
        // calcular el precio de entrada a un museo. 
        // Pide la edad del usuario 
        // y el día de la semana (1=Lunes, 2=Martes... 7=Domingo). 
        // Las reglas son: Menores de 12 años: entrada gratis.
        // Entre 12 y 17 años: 5€ (pero gratis los martes). 
        // Entre 18 y 64 años: 10€ (pero 7€ los jueves). 
        // 65 años o más: 6€. 
        // Usa operadores lógicos para determinar el precio correcto y muestra el cálculo.

        Scanner scanner = new Scanner(System.in);


        System.out.println("¿Que edad tienes?");
        int edad = scanner.nextInt();
        System.out.println("Que dia de la semana es? (1=Lunes, 2=Martes... 7=Domingo)");
        int dia = scanner.nextInt();

        if (edad < 12) {
            System.out.println("La entrada es gratis, por ser menor de 12 años.");

        } else if (edad >= 12 && edad <= 17 && dia == 2) {  // PRIMERO: caso específico del martes
            System.out.println("La entrada es GRATIS por tener entre 12 y 17 años y ser Martes");

        } else if (edad >= 12 && edad <= 17) {
            System.out.println("El precio de la entrada es de 5€, por tener entre 12 y 17 años");

        } else if (edad >= 18 && edad <= 64 && dia == 4) {
            System.out.println("El precio de la entrada es 7€ por tener entre 18 y 64 años y ser jueves");

        } else if (edad >= 18 && edad <= 64) {
            System.out.println("El precio de la entrada es de 10€ por tener entre 18 y 64 años");

        } else if (edad >= 65) {
            System.out.println("El precio de la entrada es de 6€, por tener 65 años o más");
        }

        scanner.close();
        scanner = null;
    }

    public void ejercicio14() {
        // Pide: edad, ingresos mensuales (€), y si tiene deudas pendientes (true/false).
        // Los requisitos son: Edad entre 21 y 65 años, ingresos mensuales de al menos 1000€, y NO tener deudas pendientes.
        // El programa debe evaluar cada condición y mostrar si es elegible o no, explicando qué requisitos no cumple.

        scanner = new Scanner(System.in);

        System.out.println("¿Que edad tienes?");
        int edad = scanner.nextInt();
        System.out.println("¿Que ingresos mensuales tienes?");
        int ingresos = scanner.nextInt();
        System.out.println("Tienes dedudas pendientes? (true/false)");
        boolean deudas = scanner.nextBoolean();

        boolean confiEdad = edad < 21 || edad > 65;
        boolean confiIngresos = ingresos < 1000;
        boolean apto = !confiEdad && !confiIngresos && !deudas;

        if (confiEdad) {
            System.out.println("No cumples requisitos por la edad (entre 21 y 65 años).");
        } else if (confiIngresos) {
            System.out.println("No cumples requisitos por ingresos bajos (minimo 1.000€).");
        } else if (deudas) {
            System.out.println("No cumples requsisitos por tener deduas.");
        } else if (apto) {
            System.out.println("FELICIDADES! Eres apto para el prestamo.");
        }

        System.out.println();
        System.out.println("Edad: " + edad);
        System.out.println("Ingresos mensuales: " + ingresos + "€");
        System.out.println("¿Hay deudas pendientes?: " + deudas);
        System.out.println("Edad entre 21 y 65 años: " + confiEdad);
        System.out.println("¿Ingresos superiores a 1000€?: " + !confiIngresos);
        System.out.println("¿Sin deudas pendientes?: " + !deudas);
        System.out.println("Eres apto para el prestamo?: " + apto);

        scanner.close();
        scanner = null;
    }

    public void ejercicio15() {
        scanner = new Scanner(System.in);

        //calcule el coste de envío de un paquete.
        // Pide: peso del paquete (kg),
        // distancia de envío (km),
        // y si es envío urgente (true/false).
        // Las reglas son: Precio base: 5€.
        // Si el peso es mayor de 5kg,
        // añadir 2€ por cada kg adicional.
        // Si la distancia es mayor de 100km, añadir 10€.
        // Si es envío urgente, multiplicar el precio total por 1.5.
        // Muestra todos los cálculos paso a paso.

        System.out.println("¿Cuál es el peso del paquete? (kg)");
        double peso = scanner.nextDouble();
        System.out.println("¿Cuál es la distancia del envío? (km)");
        double distancia = scanner.nextDouble();
        System.out.println("¿El envío es urgente? (true/false)");
        boolean urgente = scanner.nextBoolean();

        double precioBase = 5;
        double pesoBase = 5;
        double distanciaBase = 100;

        System.out.println("\n--- DATOS DEL ENVÍO ---");
        System.out.println("El peso del paquete es: " + peso + " kg");
        System.out.println("La distancia de envío es: " + distancia + " km");
        System.out.println("¿El envío es urgente?: " + urgente);
        System.out.println("\n--- CÁLCULOS ---");
        System.out.println("Precio base: " + precioBase + "€");

        double precioExcesoPeso = 0;
        double precioExcesoDistancia = 0;

        // Calcular coste por peso
        if (peso > pesoBase) {
            double kgAdicionales = peso - pesoBase;
            precioExcesoPeso = kgAdicionales * 2;
            System.out.println("El peso excede en: " + kgAdicionales + " kg");
            System.out.println("Coste adicional por peso: " + precioExcesoPeso + "€ (" + kgAdicionales + " kg x 2€)");
        } else {
            System.out.println("No hay coste adicional por peso");
        }

        // Calcular coste por distancia
        if (distancia > distanciaBase) {
            precioExcesoDistancia = 10;
            System.out.println("Coste adicional por distancia: " + precioExcesoDistancia + "€");
        } else {
            System.out.println("No hay coste adicional por distancia");
        }

        // Calcular subtotal
        double subtotal = precioBase + precioExcesoPeso + precioExcesoDistancia;
        System.out.println("\nSubtotal: " + subtotal + "€");

        // Aplicar recargo por urgencia
        double precioFinal = subtotal;
        if (urgente) {
            precioFinal = subtotal * 1.5;
            System.out.println("Recargo por envío urgente (x1.5): " + (precioFinal - subtotal) + "€");
        }

        System.out.println("\n--- PRECIO FINAL ---");
        System.out.println("TOTAL A PAGAR: " + precioFinal + "€");

        scanner.close();
        scanner = null;
    }


}
