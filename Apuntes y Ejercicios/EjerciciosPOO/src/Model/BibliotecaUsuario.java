package Model;

public class BibliotecaUsuario {

    private static int contadorUsuario = 101;
    private String nombre;
    private int numeroSocio;


    public BibliotecaUsuario(String nombre) {
        this.nombre = nombre;
        this.numeroSocio = contadorUsuario;
        contadorUsuario++;
    }

    @Override
    public String toString() {
        return "Usuario " +nombre+ " (Socio " +numeroSocio+ ") ";
    }

    public static int getContadorUsuario() {
        return contadorUsuario;
    }
    public String getNombre() {
        return nombre;
    }
    public int getNumeroSocio() {
        return numeroSocio;
    }
}
