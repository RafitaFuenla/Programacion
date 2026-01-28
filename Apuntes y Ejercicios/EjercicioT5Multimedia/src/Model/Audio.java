package Model;

public final class Audio extends Multimedia{

    private int duracion;
    private String soporte;

    public Audio(){}

    public Audio(int duracion, String soporte) {
        this.duracion = duracion;
        this.soporte = soporte;
    }

    public Audio(String titulo, String autor, int tamanio, String formato, int duracion, String soporte) {
        super(titulo, autor, tamanio, formato);
        this.duracion = duracion;
        this.soporte = soporte;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Duracion = " + duracion);
        System.out.println("Soporte = " + soporte+ "\n");
    }

    // Getters & Setters
    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    public String getSoporte() {
        return soporte;
    }
    public void setSoporte(String soporte) {
        this.soporte = soporte;
    }
}
