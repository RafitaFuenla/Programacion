package Model;

public class PersonaMain {
    public static void main(String[] args) {

        PersonaEstudiante pe1 = new PersonaEstudiante("Laura", 20, "2º de Dam");
        PersonaEstudiante pe2 = new PersonaEstudiante("Carlos", 19, "1º de Dam");

        pe1.presentarse();
        pe1.estudiar();

        System.out.println();

        pe2.presentarse();
        pe2.estudiar();
    }


}
