import Model.Vehiculo;
import Model.VehiculoCoche;

public class VehiculoMain {

    public static void main(String[] args) {
        VehiculoCoche c1 = new VehiculoCoche("Ford", "Focus", 5);
        VehiculoCoche c2 = new VehiculoCoche("Seat", "Ibiza", 3);
        Vehiculo c3 = new Vehiculo("Toyota", "Corolla");

        System.out.println(c3);
        System.out.println(c1);
        System.out.println(c2);

    }

}
