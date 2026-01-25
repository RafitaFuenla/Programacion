package Model;

public class AnimalGato extends Animal{

    public AnimalGato() {
    }

    public AnimalGato(String nombre, int edad) {
        super(nombre, edad);
    }


    public void hacerSonido() {
        super.hacerSonido();
        System.out.println(getNombre()+ " hace: Miau miua." );
    }
}
