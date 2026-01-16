package Model;

public class Estudiante {
    private String nombre;
    private int edad;
    private double nota;

    public Estudiante(String nombre, int edad, double nota) {
        this.nombre = nombre;
        this.edad = edad;
        setNota(nota); // Pasar por el setter
    }

    @Override
    public String toString() {
        return
                "Estudiante: " + nombre;
    }

    public void setNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
            System.out.println("Asignando nota " + nota + ": Correcto");
        } else {
            System.out.println("Asignando nota " + nota + ": Error - La nota debe estar entre 0 y 10");
        }
        System.out.println("Nota actual: " + this.nota);
        System.out.println();
    }
}
