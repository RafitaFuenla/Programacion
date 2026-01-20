package Model;

public class BibliotecaLibro {

    private static int contadorISBN = 001;

    private String titulo, autor;
    private int ISBN;
    private boolean disponible;

    public BibliotecaLibro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = contadorISBN;
        contadorISBN++;
        this.disponible = true;
    }

    @Override
    public String toString() {
        return "- " +titulo+ " (" +autor+ ") " + "ISBN:" +ISBN;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getISBN() {
        return ISBN;
    }

    // Seter del boleano para cambiar a disponible o no
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public boolean isDisponible() {
        return disponible;
    }
}
