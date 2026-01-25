import Model.FiguraCiruclo;
import Model.FiguraCuadradrado;

public class FiguraMain {

    public static void main(String[] args) {

        FiguraCiruclo c1 = new FiguraCiruclo(5.0);
        FiguraCuadradrado cua1 = new FiguraCuadradrado(4.0);

        System.out.println(c1);
        System.out.println("Area: " +c1.calcularArea());

        System.out.println();

        System.out.println(cua1);
        System.out.println("Area: " +cua1.calcularArea());


    }
}
