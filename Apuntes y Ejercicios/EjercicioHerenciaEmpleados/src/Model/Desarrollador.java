package Model;

public class Desarrollador extends Empleado {

    private String lenguajePrincipal;

    public Desarrollador(String nombre, double salarioBase, String lenguajePrincipal) {
        super(nombre, salarioBase);
        this.lenguajePrincipal = lenguajePrincipal;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nPuesto: Desarrollador" +
                "\nSalario base: " +getSalarioBase()+ "€"+
                "\nLenguaje Principal: " +lenguajePrincipal;
    }
}
