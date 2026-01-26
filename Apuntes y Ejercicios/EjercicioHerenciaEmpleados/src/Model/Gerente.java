package Model;

public final class Gerente extends Empleado {

    private double bonus;

    public Gerente(String nombre, double salarioBase, double bonus) {
        super(nombre, salarioBase);
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nPuesto: Gerente" +
                "\nSalario base: " +getSalarioBase()+ "€"+
                "\nBonus: " +bonus;
    }

    public double calcularSalarioTotal(){
        return getSalarioBase()+bonus;
    }
}
