import Model.Desarrollador;
import Model.Gerente;

public class Main {

    public static void main(String[] args) {
        Gerente g1 = new Gerente("Ana Garcia", 40000, 10000);
        Desarrollador d1 = new Desarrollador("Luis Martinez", 35000, "Java");

        System.out.println(g1);
        System.out.println("Salario total: " + g1.calcularSalarioTotal()+"€");

        System.out.println();

        System.out.println(d1);
    }
}
