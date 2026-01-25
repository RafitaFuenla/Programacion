import Model.AnimalGato;
import Model.AnimalPerro;

public class AnimalMain {
    public static void main(String[] args) {

        AnimalPerro p1 = new AnimalPerro("Rex", 5);
        AnimalGato g1 = new AnimalGato("Mishi", 3 );

        System.out.println(p1);
        p1.hacerSonido();

        System.out.println();

        System.out.println(g1);
        g1.hacerSonido();

    }
}
