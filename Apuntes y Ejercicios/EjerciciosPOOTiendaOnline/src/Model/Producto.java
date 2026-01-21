package Model;

public class Producto {

    private static int contadorCodigo = 001;
    private int codigo;
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.codigo = contadorCodigo;
        contadorCodigo++;
    }

    @Override
    public String toString() {
        return nombre+ "(" +precio+ "€)";
    }

    public static int getContadorCodigo() {
        return contadorCodigo;
    }
    public static void setContadorCodigo(int contadorCodigo) {
        Producto.contadorCodigo = contadorCodigo;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
}
