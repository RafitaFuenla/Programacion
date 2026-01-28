package Model;

public final class  Libro extends  Multimedia{

    private static int  contadorISBN = 1000;

    private int ISBN, nPaginas;

    public Libro(){}
    public Libro(String titulo, String autor, int tamanio, String formato, int nPaginas) {
        super(titulo, autor, tamanio, formato);
        this.ISBN = contadorISBN;
        contadorISBN++;
        this.nPaginas = nPaginas;
    }

    public Libro(int nPaginas) {
        this.ISBN = contadorISBN;
        contadorISBN++;
        this.nPaginas = nPaginas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("ISBN = " + ISBN);
        System.out.println("Numero de paginas = " + nPaginas+ "\n");
    }

    // Getters & Setters
    public static int getContadorISBN() {
        return contadorISBN;
    }
    public static void setContadorISBN(int contadorISBN) {
        Libro.contadorISBN = contadorISBN;
    }
    public int getISBN() {
        return ISBN;
    }
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
    public int getnPaginas() {
        return nPaginas;
    }
    public void setnPaginas(int nPaginas) {
        this.nPaginas = nPaginas;
    }
}
