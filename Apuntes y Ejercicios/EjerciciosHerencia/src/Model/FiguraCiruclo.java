package Model;

public class FiguraCiruclo extends Figura {

    private double radio;

    public FiguraCiruclo(){}

    public FiguraCiruclo(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo con radio " +radio;
    }

    @Override
    public double calcularArea() {
        return 3.14 * (radio*radio);
    }
}
