package Model;

public class BibliotecaPrestamo {

    private BibliotecaLibro bibliotecaLibro;
    private BibliotecaUsuario bibliotecaUsuario;
    private String fechaPrestamo;

    public BibliotecaPrestamo(BibliotecaLibro bibliotecaLibro, BibliotecaUsuario bibliotecaUsuario, String fechaPrestamo) {
        this.bibliotecaLibro = bibliotecaLibro;
        this.bibliotecaUsuario = bibliotecaUsuario;
        this.fechaPrestamo = fechaPrestamo;
    }

    public void prestarLibro(){
        if (bibliotecaLibro.isDisponible()){
            bibliotecaLibro.setDisponible(false);
        System.out.println("✅ Prestamo realizado el: " +fechaPrestamo);}
        else{
            System.out.println("❌ El libro no esta disponible");
        }
    }

    public void devolverLibro(){
        bibliotecaLibro.setDisponible(true);
        System.out.println("✅ Libro devuelto");

    }
}
