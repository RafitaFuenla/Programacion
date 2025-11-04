import java.util.Scanner;


public class Main {

    private static Scanner lecturaTeclado; // se declara aquí, dentro de la clase

    public static void main(String[] args) {
        // ejercicio01(); // llamamos al método
        // ejercicio02();
        // ejercicio03();
        // ejercicio04();
        // ejercicio05();
        // ejercicio06();
        // ejercicio07();
        // ejercicio08();
        // ejercicio09();
         ejercicio10();
    }

    public static void ejercicio01() {
        // EJERCICIO 1
        lecturaTeclado = new Scanner(System.in);

        System.out.println("Introduce el primer numero entero:");
        int num1 = lecturaTeclado.nextInt();

        System.out.println("Introduce el segundo numero entero:");
        int num2 = lecturaTeclado.nextInt();

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multi = num1 * num2;
        int div = num1 / num2;
        int res = num1 % num2;

        System.out.println("Suma = " + suma);
        System.out.println("Resta = " + resta);
        System.out.println("Multiplicacion = " + multi);
        System.out.println("Division = " + div);
        System.out.println("Modulo (resto) = " + res);

        lecturaTeclado.close();
        lecturaTeclado = null;
    }

    public static void ejercicio02() {
        // EJERCICIO 2
        lecturaTeclado = new Scanner(System.in);

        System.out.println("Introduce el primer numero:");
        int num1 = lecturaTeclado.nextInt();
        System.out.println("Introduce el segundo numero:");
        int num2 = lecturaTeclado.nextInt();

        boolean mayor = num1 > num2;
        boolean menor = num1 < num2;
        boolean igual = num1 == num2;
        boolean diferente = num1 != num2;
        boolean mayIgu = num1 >= num2;
        boolean menIgu = num1 <= num2;

        System.out.println(num1 + " es mayor a " + num2 + "? " + mayor);
        System.out.println(num1 + " es menor a " + num2 + "? " + menor);
        System.out.println(num1 + " es igual a " + num2 + "? " + igual);
        System.out.println(num1 + " es diferente a " + num2 + "? " + diferente);
        System.out.println(num1 + " es mayor o igual a " + num2 + "? " + mayIgu);
        System.out.println(num1 + " es menor o igual a " + num2 + "? " + menIgu);

        lecturaTeclado.close();
        lecturaTeclado = null;
    }

    public static void ejercicio03() {
        // EJERCICIO 3
        int num = 100;

        System.out.println("Valor inicial: " + num);
        num += 50;
        System.out.println("Despues de sumar 50 (+=): " + num);
        num -= 30;
        System.out.println("Despues de restar 30 (-=) " + num);
        num *= 2;
        System.out.println("Despues de multiplicar por 3 (*=): " + num);
        num /= 4;
        System.out.println("Despues de dividir entre 4 (/=) " + num);
    }

    public static void ejercicio04() {
        // EJERCICIO 4
        lecturaTeclado = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        int numero = lecturaTeclado.nextInt();
        System.out.println(numero % 2 == 0 ? "El " + numero + " es par" : "El " + numero + " es impar");

        lecturaTeclado.close();
        lecturaTeclado = null;
    }

    public static void ejercicio05() {
        // EJERCICIO 5
        lecturaTeclado = new Scanner(System.in);
        System.out.println("Introduce tu edad:");
        int edad = lecturaTeclado.nextInt();
        System.out.println("¿Tienes carnet de conducir? (escribe true o false)");
        boolean carnet = lecturaTeclado.nextBoolean();
        boolean mayor = edad > 21;
        boolean alquilar = mayor && carnet;

        System.out.println("Eres mayor de 21 años?: " + mayor);
        System.out.println("¿Tienes carnet?: " + carnet);
        System.out.println("¿Puedes alquilar un coche?: " + alquilar);

        lecturaTeclado.close();
        lecturaTeclado = null;
    }

    public static void ejercicio06() {
        // EJERCICIO 6
        lecturaTeclado = new Scanner(System.in);
        System.out.println("Introduce el precio del producto:");
        int precio = lecturaTeclado.nextInt();
        System.out.println("Introduce el porcentaje de descuento:");
        int porciento = lecturaTeclado.nextInt();

        int dto = precio * porciento / 100;
        int pFinal = precio - dto;

        System.out.println("El precio original es: " + precio + ("€"));
        System.out.println("El descuento es (" + porciento + "%): " + dto + ("€"));
        System.out.println("El precio final es: " + pFinal);

        lecturaTeclado.close();
        lecturaTeclado = null;
    }

    public static void ejercicio07() {
        lecturaTeclado = new Scanner(System.in);

        System.out.println("Introduce tu edad:");
        int edad = lecturaTeclado.nextInt();
        System.out.println("¿Eres estudiante? (true/false)");
        boolean estudiante = lecturaTeclado.nextBoolean();

        boolean dtoJoven = edad < 26;
        boolean dtoEspecial = dtoJoven && estudiante;

        System.out.println("¿Eres menor de 26 años?: " + dtoJoven);
        System.out.println("¿Eres estudiante?: " + estudiante);
        System.out.println("¿NO eres estudiante?: " + !estudiante);
        System.out.println("¿Tienes descuento joven? (menor de 26): " + dtoJoven);
        System.out.println("¿Tienes descuento de estudiante?: " + estudiante);
        System.out.println("Tienes descuento especial?: " + dtoEspecial);

        lecturaTeclado.close();
        lecturaTeclado = null;
    }

    public static void ejercicio08() {
        lecturaTeclado = new Scanner(System.in);

        System.out.println("Introduce el primer numero");
        int num1 = lecturaTeclado.nextInt();
        System.out.println("Introduce el segundo numero");
        int num2 = lecturaTeclado.nextInt();
        System.out.println("Introduce el tercer numero");
        int num3 = lecturaTeclado.nextInt();

        int suma = num1 + num2 + num3;
        double promedio = (double) suma / 3;
        double resultado = (double) (num1 * num2) / num3;

        System.out.println("La suma de los tres numero = " + suma);
        System.out.printf("El promedio = %.2f%n", promedio);
        System.out.printf("Restado de ( " + num1 + " * " + num2 + " ) / " + num3 + " = %.2f%n", resultado);

        lecturaTeclado.close();
        lecturaTeclado = null;
    }

    public static void ejercicio09(){
        lecturaTeclado = new Scanner(System.in);

        System.out.println("Introduce la nota del primer examen:");
        int nota1 = lecturaTeclado.nextInt();
        System.out.println("Introduce la nota del segundo examen:");
        int nota2 = lecturaTeclado.nextInt();
        System.out.println("Introduce la nota del tercero examen:");
        int nota3 = lecturaTeclado.nextInt();

        double media = (double) (nota1 + nota2 + nota3) / 3;
        boolean aprobado = media >= 5;
        boolean notable = media >= 7;
        boolean sobresaliente = media >= 9;

        System.out.println("Nota media: "+media);
        System.out.println("¿Ha aprobado? (>=5): "+aprobado);
        System.out.println("¿Tiene notable? (>=7): "+notable);
        System.out.println("¿Tiene sobresaliente? (>=9): "+sobresaliente);

        lecturaTeclado.close();
        lecturaTeclado = null;
    }

    public static void ejercicio10(){
        lecturaTeclado = new Scanner(System.in);

        System.out.println("Introduce el salario por hora");
        int salarioH = lecturaTeclado.nextInt();
        System.out.println("Introduce las horas trabajadas");
        int hTrabajo = lecturaTeclado.nextInt();
        System.out.println("¿Hiciste horas extra? (true/false)");
        boolean hExtraSi = lecturaTeclado.nextBoolean();
        int hNormal = 40;

        int hExtra = hTrabajo - hNormal;

//       boolean aplicaHextra = (boolean) >40 && hNormal;
       double salario = salarioH * hNormal;
       double salarioHextra = hExtra * (salarioH * 2);
       double salarioTotal = salario + salarioHextra;

        System.out.println("Horas normales (maximo 40): "+hTrabajo);
        System.out.println("Horas extra: "+hExtra);
        System.out.println("¿Trabajaste mas de 40 horas?: "+hExtraSi);
        System.out.println("¿Tienes derecho a horas extra?: "+hExtraSi);
        System.out.println("¿Se aplican horas extra? NO SE COMO HACERLO");
        System.out.println("Salario por horas normales: "+salario+("€"));
        System.out.println("Salario por horas extra (al doble) " +salarioHextra+("€"));
        System.out.println("Salario total: "+salarioTotal+("€"));



        lecturaTeclado.close();
        lecturaTeclado = null;
    }

}
