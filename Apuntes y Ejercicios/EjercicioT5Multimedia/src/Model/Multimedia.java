package Model;

public class Multimedia {

    private static int contadorID = 1;

    private  int identificador;
    private String titulo, autor;
    private int tamanio;
    private String formato;

    public Multimedia(){};
    public Multimedia(String titulo, String autor, int tamanio, String formato) {
        this.identificador = contadorID;
        contadorID++;
        this.titulo = titulo;
        this.autor = autor;
        this.tamanio = tamanio;
        this.formato = formato;
    }

    public void mostrarDatos(){
        System.out.println("Identificador = " + identificador);
        System.out.println("Titulo = " + titulo);
        System.out.println("Autor = " + autor);
        System.out.println("Tamanio = " + tamanio);
        System.out.println("Formato = " + formato+ "\n");
    }

    // Getters & Setters
    public int getIdentificador() {
        return identificador;
    }
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    public int getTamanio() {
        return tamanio;
    }
    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getFormato() {
        return formato;
    }
    public void setFormato(String formato) {
        this.formato = formato;
    }
}
