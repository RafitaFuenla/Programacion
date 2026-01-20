package Model;

public class BibliotecaUsuario {

    private static int contadorUsuario = 101;

    public BibliotecaUsuario(String nombre) {
        this.nombre = nombre;
        this.numeroSocio = contadorUsuario;
        contadorUsuario++;
    }

    private String nombre;
    private int numeroSocio;

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
