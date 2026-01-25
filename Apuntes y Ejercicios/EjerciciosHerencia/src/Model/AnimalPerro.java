package Model;

public class AnimalPerro extends Animal{

    public AnimalPerro() {
    }

    public AnimalPerro(String nombre, int edad) {
        super(nombre, edad);
    }


    public void hacerSonido() {
        super.hacerSonido();
        System.out.println(getNombre()+ " hace: Gua Gua." );
    }
}
