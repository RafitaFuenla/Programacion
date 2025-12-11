package Ej1VerificadorEdad;
import java.util.Scanner;

public class constructor {

    public void ejercicioEdad(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos años tienes?");
        int edad = sc.nextInt();

        if (edad < 18){
            System.out.println("Eres menor de edad");
        }else{
            System.out.println("Eres mayor de edad.");
        }
        sc.close();
    }
}
