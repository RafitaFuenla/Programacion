package Model;

public class PersonaEstudiante extends Persona {

    private String curso;

    public PersonaEstudiante() {
    }

    public PersonaEstudiante(String nombre, int edad, String curso) {
        super(nombre, edad);
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void estudiar() {
        System.out.println("Estoy estudiando " + curso);
    }
}
