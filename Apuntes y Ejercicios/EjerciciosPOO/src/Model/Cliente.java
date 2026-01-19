package Model;


public class Cliente {

    private String nombre, email;
    private Direccion direccion;

    public Cliente(String nombre, String email, Direccion direccion) {
        this.nombre = nombre;
        this.email = email;
        this.direccion = direccion;
    }

    public void mostrarDatos(){
        System.out.println("Cliente: " +nombre);
        System.out.println("Email: " +email);
        direccion.mostrarDatos();
    }

}
