package Model;

public class Direccion {

    private String calle, ciudad;
    private int codigoPostal;

    public Direccion(String calle, String ciudad, int codigoPostal) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
    }

    public void mostrarDatos(){
        System.out.println("Direccion: " +calle+ ", " +ciudad+  ", " +codigoPostal );
    }

    public String getCalle() {
        return calle;
    }
    public String getCiudad() {
        return ciudad;
    }
    public int getCodigoPostal() {
        return codigoPostal;
    }
}
