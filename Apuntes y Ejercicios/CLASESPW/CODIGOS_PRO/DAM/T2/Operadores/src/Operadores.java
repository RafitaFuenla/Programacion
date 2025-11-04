import java.util.Scanner;

public class Operadores {

    public void operadoresAritmeticos(){
        // unarios
        int operandoUno = 5;
        // incremento -> para poder hacer un contador
        operandoUno++; // le suma uno al valor que ya tenia
        operandoUno++;
        operandoUno++;
        operandoUno++;
        System.out.println("El valor del operando uno despues de los incrementos es "+operandoUno);
        // decremento -> le resta uno al valor que ya tenia ->
        operandoUno--;
        operandoUno--;
        operandoUno--;

        System.out.println("El valor del operando uno despues de los decrementos es "+operandoUno);
        // binaros -> dos operadores: suma (+) resta (-) multi (*) div (/) modulo-resto division (%)
        operandoUno = 8;
        int operandoDos = 3;
        int suma = operandoUno + operandoDos;
        System.out.println("El resultado de la suma es "+suma);
        int resta = operandoUno-operandoDos;
        System.out.println("El resutaldo de la resta es "+ resta);
        int multi = operandoUno*operandoDos;
        System.out.println("El resultado de la multi es "+multi);
        double division = (double) operandoUno/operandoDos; // 8.0/3
        System.out.println("El resultado de la division es "+division);
        int modulo = operandoUno%operandoDos;
        System.out.println("El modulo de la division es "+modulo);
        // me vale para saber si un numero es par o impar
    }
    public void operadoresAsignacion(){
        int operadorUno = 10;
        int operadorDos = 6;
        // operadorUno = operadorUno +5;
        operadorUno += 5; // en operadorUno guarda la suma de lo que valia operadorUno + 5
        operadorUno += operadorDos;
        System.out.println("El valor de operador 1 es "+operadorUno);
        operadorUno-=5; // 16 operadorUno = operadorUno -5
        operadorUno*=2; // 32 operadorUno = operadorUno *2
        operadorUno%=2; // 0 operadorUno = operadorUno %2
        System.out.println("El resultado de las asignaciones completas es de "+operadorUno);
    }

    // seran utilizados como condiciones para ejecutar una parte del codigo u otra
    public void operadoresComparacion(){
        int operandoUno = 10;
        int operandoDos = 20;
        boolean resultado = operandoUno>operandoDos;
        System.out.println("El resultado de la comparacion es "+resultado);
        resultado = operandoUno<operandoDos;
        System.out.println("El resultado de la comparacion es "+resultado);
        resultado = operandoUno<=operandoDos;
        resultado = operandoUno>=operandoDos;
        resultado = operandoUno==operandoDos;
        resultado = operandoUno!=operandoDos;
        // cuanto quieres cobrar
        // cuantos años tienes
        // tienes carnet
    }

    // operadorComparacion
    public void operadoresLogicos(){
        int sueldo = 20000;
        int edad = 45;
        boolean conducir = true;
        // conducir = !conducir;

        System.out.println("El candidato puede conducir: "+!conducir);
        // cuando quiere cobrar menos de 30000 y tiene menos de 40 y puede conducir
        boolean candidatoValido = sueldo<30000 && edad<40 && conducir; // true
        candidatoValido = (sueldo<20000) || (edad<25 ||conducir && sueldo>25000 && edad >60);
                        // F           ||  T || T
                        // T && F && F -> F
        System.out.println("El candidato es valido: "+candidatoValido);
    }

    public void cambioTipos(){
        double numeroDecimal = 5.98;
        int numeroEntero = 6;
        double numero = numeroEntero;
        // System.out.println((int)numeroDecimal);
        // System.out.println((double) numeroEntero);
        // System.out.println(numeroEntero);
        String palabra = "12";
        int numeroPalabra = Integer.parseInt(palabra);

        String palabraBool = "true";
        boolean palabraBoolean = Boolean.parseBoolean(palabraBool);
        // System.out.println(palabraBoolean);
        // System.out.println(numeroPalabra+10);

        int numeroEvaluar = 12345;
        String numeroEvaluarStr = String.valueOf(numeroEvaluar);

        boolean acierto = true;
        String aciertoStr = String.valueOf(acierto); // "true"

    }
    public void evaluarCandidato(double sueldo, int edad, boolean conducir, String nombre){
        boolean resultado = sueldo<=20000 && edad<40 && conducir;
        System.out.println("Evaluando al candidato "+nombre);
        System.out.println("La evaluacion del candadato es: "+resultado);
    }

    public void ejercicioNotion4Tema2(){
        /*
        Desarrolla un programa que pida un número al usuario y
        determine si es par o impar usando el operador módulo. Muestra el resultado por consola.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que numero quieres comprobar si es par");
        int numero = scanner.nextInt();
        boolean numeroPar = numero%2==0;
        System.out.printf("El numero %d es par: %b",numero,numeroPar);
        scanner.close();


    }

    public void ejercicioNotion10Tema2(){
        /*
        Crea un programa que pida el salario base por hora,
        las horas trabajadas y si ha hecho horas extra (true/false).
        Si ha hecho horas extra y trabajó más de 40 horas,
        las horas que excedan de 40 se pagan al doble.
        Usa operadores lógicos, relacionales y aritméticos para calcular el salario total.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica el salario base");
        int salarioBaseHora = scanner.nextInt();
        System.out.println("Indica horas trabajadas");
        int horasTrabajadas = scanner.nextInt();
        System.out.println("Has realizado horas extas");
        boolean horasExtras = scanner.nextBoolean();
        // 60
        boolean condicionExtras = horasTrabajadas>40 && horasExtras;
        // si condicionExtras es true
            int horasExtrasTotal = horasTrabajadas -40;
            int salarioBase = 40*salarioBaseHora;
            int salarioBaseExtra = horasExtrasTotal* salarioBaseHora*2;
            int salarioTotal = salarioBase+salarioBaseExtra;
            System.out.println("Has cobrado un total de "+salarioTotal);
            System.out.println("Has cobrado un base de "+salarioBase);
            System.out.println("Has cobrado un extra de "+salarioBaseExtra);

            // en caso contrario
        salarioBase = 40*salarioBaseHora;

    }
}
