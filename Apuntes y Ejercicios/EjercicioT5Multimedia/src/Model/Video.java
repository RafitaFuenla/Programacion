package Model;

public final class Video extends Multimedia{

    private String director, actores;

    public Video(String titulo, String autor, int tamanio, String formato, String director, String actores) {
        super(titulo, autor, tamanio, formato);
        this.director = director;
        this.actores = actores;
    }

    public Video(String director, String actores) {
        this.director = director;
        this.actores = actores;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Director = " + director);
        System.out.println("Actores = " + actores+ "\n");
    }

    // Getters & Setters
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public String getActores() {
        return actores;
    }
    public void setActores(String actores) {
        this.actores = actores;
    }
}

