import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class EjerciciosT3While {
    public Scanner scanner;

    public void ejercicio01() {
        Scanner scanner = new Scanner(System.in);

        // Crea un programa que pida un número N y use un bucle while
        // para contar desde 1 hasta N, mostrando cada número.

        System.out.println("Introduce un numero:");
        int num = scanner.nextInt();

        System.out.println("Contando con While:");

        int crece = 0;

        while (crece < num) {
            crece++;
            System.out.println(crece);
        }

        System.out.println("Fin del conteo.");

        scanner.close();
        scanner = null;
    }

    public void ejercicio02() {
        //Desarrolla un programa que pida al usuario una contraseña.
        // La contraseña correcta es "1234".
        // Usa un bucle do-while para seguir pidiendo la contraseña
        // hasta que el usuario la introduzca correctamente.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la contraseña de 4 digitos numericos:");
        int pass = scanner.nextInt();

        while (pass != 1234) {
            System.out.println("Contraseña incorrecta. Intenta de nuevo.");
            System.out.println("Introduce la contraseña de 4 digitos numericos:");
            pass = scanner.nextInt();
        }

        System.out.println("¡Contraseña correcta! Acceso permitido.");

        scanner.close();
        scanner = null;
    }

    public void ejercicio03() {
        Scanner scanner = new Scanner(System.in);

        // Escribe un programa que pida números al usuario y los vaya sumando.
        // El bucle while debe continuar mientras el usuario introduzca números positivos.
        // Cuando introduzca un número negativo o cero,
        // el programa debe terminar y mostrar la suma total.

        System.out.println("Introduce un número para sumar (0 o negativo para terminar):");
        int num = scanner.nextInt();

        int suma = 0;

        while (num > 0) {
            suma = suma + num;
            System.out.printf("Suma actual: %d\n", suma);
            System.out.println("Introduce un nuevo número para sumar (0 o negativo para terminar)::");
            num = scanner.nextInt();
        }
        System.out.printf("Programa terminado. Suma total: %d", suma);

        scanner.close();
        scanner = null;
    }

    public void ejercicio04() {
        Scanner scanner = new Scanner(System.in);

        // Crea un juego donde el programa elige un número secreto entre 1 y 10 (por ejemplo, 7).
        // Usa un bucle do-while para pedir al usuario que adivine el número.
        // El programa debe indicar si el número es mayor o menor, y continuar hasta que el usuario acierte.

        System.out.println("¡Adivina el número entre 1 y 10!");
        int secretNum = 7;
        System.out.println("Introduce tu intento:");
        int num = scanner.nextInt();
        System.out.println();

        int intentos = 1;

        while (num != secretNum) {

            if (num < secretNum) {
                System.out.println("El número secreto es MAYOR");
            } else {
                System.out.println("El número secreto es MENOR");
            }

            System.out.println("Introduce tu intento:");
            num = scanner.nextInt();

            intentos++;
        }

        System.out.println("¡CORRECTO! Lo adivinaste en " + intentos + " intentos.");

        scanner.close();
        scanner = null;
    }

    public void ejercicio05() {
        Scanner scanner = new Scanner(System.in);

        // Desarrolla un programa con un menú que se repita usando do-while.
        // El menú debe tener 4 opciones:
        // 1=Saludar, 2=Despedirse, 3=Ver hora actual (puedes mostrar un mensaje fijo), 4=Salir.
        // Usa switch para procesar cada opción.
        // El programa solo debe terminar cuando el usuario elija la opción 4.

        //CONSOLA:
        // --- MENÚ ---
        //1. Saludar
        //2. Despedirse
        //3. Ver hora
        //4. Salir
        //Elige una opción: 3
        //La hora actual es: 10:30

        System.out.println("--- MENÚ ---");
        System.out.println("1. Saludar");
        System.out.println("2. Despedirse");
        System.out.println("3. Ver hora");
        System.out.println("4. Salir");

        System.out.println("Elige una opcion:");
        int opc = scanner.nextInt();

        LocalTime hora = LocalTime.now();
        System.out.println(hora);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");

        while (opc < 5) {
            switch (opc) {
                case 1 -> System.out.println("¡Hola! ¿Cómo estás?");
                case 2 -> System.out.println("¿Nos vemos luego?");
                case 3 -> System.out.println("La hora actual es: " + hora.format(formato));
            }
            System.out.println("Elige una opcion:");
            opc = scanner.nextInt();
        }

        System.out.println("ADIOS!");

        scanner.close();
        scanner = null;
    }

    public void ejercicio06() {
        Scanner scanner = new Scanner(System.in);

        //Escribe un programa que pida un número N
        // y use un bucle while para hacer una cuenta atrás desde N hasta 1, mostrando cada número.
        // Al llegar a 1, debe mostrar "¡Despegue!".

        System.out.println("Inserta un numero para comenzar la cuenta atras:");
        int num = scanner.nextInt();

        while (num > 0) {
            System.out.println(num);
            num--;
        }

        System.out.println("Despegamos!");

        scanner.close();
        scanner = null;
    }

    public void ejercicio07() {
        Scanner scanner = new Scanner(System.in);

        //Crea un programa que pida al usuario cuántas calificaciones va a introducir.
        // Luego, usa un bucle while para pedir cada calificación una por una,
        // sumarlas y al final calcular y mostrar el promedio.

        // CONSOLA:
        // ¿Cuántas calificaciones vas a introducir?: 4
        //Introduce la calificación 1: 7.5
        //Introduce la calificación 2: 8.0
        //Introduce la calificación 3: 6.5
        //Introduce la calificación 4: 9.0
        //Suma total: 31.0
        //Promedio de calificaciones: 7.75

        System.out.println("¿Cuántas calificaciones vas a introducir?:");
        int numCal = scanner.nextInt();

        double sumaCal = 0;
        int contador = 1;

        while (contador <= numCal) {
            System.out.printf("Introduce la calificacion (con numero decimal) %d:\n", contador);
            double calificacion = scanner.nextDouble();  // Leer UNA calificación
            sumaCal = sumaCal + calificacion;  // O: sumaCal += calificacion;
            contador++;

        }
        System.out.println("Suma total: " + sumaCal);
        double promedio = sumaCal / numCal;
        System.out.printf("El promedio de las calificaciones es: %.2f\n", promedio);

        scanner.close();
        scanner = null;
    }

    public void ejercicio08() {
        Scanner scanner = new Scanner(System.in);

        //Desarrolla un programa que pida la edad del usuario.
        // Usa un bucle do-while para validar que la edad introducida esté entre 0 y 120.
        // Si no es válida, debe volver a pedirla. U
        // na vez válida, muestra un mensaje de confirmación.

        int anios;

        do {
            System.out.println("¿Cuánaños tienes?:");
            anios = scanner.nextInt();

            if (anios < 0 || anios > 120) {
                System.out.println("Edad no válida. Debe estar entre 0 y 120");
            }
        }
        while (anios < 0 || anios > 120);

        System.out.printf("Edad valida: %d años. Gracias!", anios);

        scanner.close();
        scanner = null;
    }

    public void ejercicio09() {
        Scanner scanner = new Scanner(System.in);

        // Crea un programa que pida al usuario cuántos estudiantes hay en una clase.
        // Para cada estudiante, usa un bucle while para pedir su calificación numérica (0-10).
        // Luego, usa un bucle for para mostrar todas las calificaciones
        // y usa un switch para convertir cada nota numérica en letra:
        // 9-10=A, 7-8=B, 5-6=C, 3-4=D, 0-2=F.

        // CONSOLA:
        // ¿Cuántos estudiantes hay?: 3
        //Introduce la nota del estudiante 1 (0-10): 8
        //Introduce la nota del estudiante 2 (0-10): 6
        //Introduce la nota del estudiante 3 (0-10): 9
        //
        //--- REPORTE DE CALIFICACIONES ---
        //Estudiante 1: 8 puntos = Calificación B
        //Estudiante 2: 6 puntos = Calificación C
        //Estudiante 3: 9 puntos = Calificación A

        System.out.println("¿Cuántos estudiantes hay?:");
        int alumno = scanner.nextInt();

        int contadorAlum = 0;

        int[] notas = new int[alumno];

        while (contadorAlum < alumno) {
            System.out.printf("Introduce la nota del estudiante %d (0-10): ", contadorAlum + 1);
            int nota = scanner.nextInt();
            notas[contadorAlum] = nota;  // Guardar la nota en la posición i

            contadorAlum++;  // Aumentar el contador para la siguiente vuelta
        }

        System.out.println();
        System.out.println("--- REPORTE DE CALIFICACIONES ---");

        for (int i = 0; i < alumno; i++) {
            int notaActual = notas[i];

            String letra = "";

            switch (notaActual) {

                case 10, 9 -> letra = "A";
                case 7, 8 -> letra = "B";
                case 5, 6 -> letra = "C";
                case 3, 4 -> letra = "D";
                case 0, 1, 2 -> letra = "E";

                // 9-10=A, 7-8=B, 5-6=C, 3-4=D, 0-2=F.
            }


            System.out.printf("Estudiante %d: %d puntos = Calificación %s\n",
                    i + 1, notaActual, letra);
        }

        scanner.close();
        scanner = null;
    }

    public void ejercicio10() {
        Scanner scanner = new Scanner(System.in);

        // Desarrolla un programa que simule un cajero automático.
        // ✅El saldo inicial es 1000€.
        // ✅ Usa un bucle do-while para mostrar un menú con opciones:
        // ✅ 1=Consultar saldo, 2=Retirar dinero, 3=Depositar dinero, 4=Salir.
        // ✅ Usa switch para cada opción.
        // ✅ Para retirar dinero, usa un bucle while para validar
        // ✅ que no se retire más del saldo disponible
        // ✅ (si intenta retirar más, debe volver a pedir la cantidad).
        // ✅ Para depositar, valida que sea una cantidad positiva.

        // CONSOLA: --- MENÚ ---
        //1. Consultar saldo
        //2. Retirar dinero
        //3. Depositar dinero
        //4. Salir
        //Elige una opción: 2
        //¿Cuánto deseas retirar?: 1500
        //Fondos insuficientes. Tu saldo es: 1000€
        //¿Cuánto deseas retirar?: 300
        //Retiro exitoso. Has retirado: 300€
        //Nuevo saldo: 700€

        int saldo = 1000;
        int opc = 0;

        do {
            System.out.println("--- MENÚ ---");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Depositar dinero");
            System.out.println("4. Salir");
            System.out.println("Elige una opcion: ");
            opc = scanner.nextInt();

            switch (opc) {
                case 1 -> System.out.printf("Tu saldo actual es: %d€\n", saldo);

                case 2 -> {
                    int retirar = 0;
                    boolean cantidadValida = false;

                    while (!cantidadValida) {
                        System.out.println("¿Cuánto deseas retirar?:");
                        retirar = scanner.nextInt();

                        if (retirar > saldo) {
                            System.out.printf("Fondos insuficientes. Tu saldo es: %d€\n", saldo);
                        } else if (retirar <= 0) {
                            System.out.println("La cantidad debe ser positiva");
                        } else {
                            saldo = saldo - retirar;
                            System.out.printf("Retiro exitoso. Has retirado: %d€\n", retirar);
                            System.out.printf("Nuevo saldo: %d€\n", saldo);
                            cantidadValida = true;
                        }
                    }
                }

                case 3 -> {
                    System.out.println("¿Cuánto deseas depositar?:");
                    int depositar = scanner.nextInt();

                    if (depositar > 0) {
                        saldo = saldo + depositar;
                        System.out.printf("Depósito exitoso. Has depositado: %d€\n", depositar);
                        System.out.printf("Nuevo saldo: %d€\n", saldo);
                    } else {
                        System.out.println("La cantidad debe ser positiva");
                    }
                }

                case 4 -> System.out.println("Gracias por usar el cajero. ¡Hasta luego!");

                default -> System.out.println("Opción incorrecta, elige una opción del 1 al 4.");
            }

        } while (opc != 4);

        scanner.close();
        scanner = null;
    }
}