package Model;

public class Cliente {

    private String nombre, email;
    private Carrito carrito;

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
        this.carrito = new Carrito();
    }

    @Override
    public String toString() {
        return  nombre+ "(" +email+ ")";
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Carrito getCarrito() {
        return carrito;
    }
    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }
}
