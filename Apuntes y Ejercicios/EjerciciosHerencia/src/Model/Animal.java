package Model;

public class Animal {

    private String nombre;
    private int edad;

    public Animal() {
    }

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Animal: " +nombre+ ", " +edad+ " años.";
    }

    public void mostrarDatos(){
       System.out.println("nombre = " + nombre);
       System.out.println("edad = " + edad);
   }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
   
   
    public void hacerSonido(){
    }

    
}
