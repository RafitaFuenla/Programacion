package Model;

public class VehiculoCoche extends Vehiculo{

    private int puertas;

    public VehiculoCoche() {
    }
    public VehiculoCoche(String marca, String modelo) {
        super(marca, modelo);
    }
    public VehiculoCoche(String marca, String modelo, int puertas) {
        super(marca, modelo);
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "Coche: " +getMarca()+ " " +getModelo()+ ", " +puertas+ " puertas.";
    }
}
