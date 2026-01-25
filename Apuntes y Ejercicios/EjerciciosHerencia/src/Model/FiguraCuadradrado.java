package Model;

public class FiguraCuadradrado extends Figura{

    private double lado;

    public FiguraCuadradrado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cuadrado con lado " + lado;
    }

    @Override
    public double calcularArea() {
        return lado*lado;
    }
}
