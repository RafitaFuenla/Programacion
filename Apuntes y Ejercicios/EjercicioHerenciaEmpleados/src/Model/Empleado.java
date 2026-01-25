package Model;

public class Empleado {
    private String nombre;
    private double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "Empleado: " +nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}



