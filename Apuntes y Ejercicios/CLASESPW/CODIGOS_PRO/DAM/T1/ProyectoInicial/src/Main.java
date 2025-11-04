/**
 *
 */
public class Main{
    // este comentario es solo de una linea -> anotacion o aclaracion BREVE de lo que hace el metodo
    String nombreMio= "Borja completo clase";

    /**
     * Comentario de documentacion Javadoc
     * @param args esto es la informacion de entrada
     * @return int vale para retornar el resutlado de la operacion
     * @version 1.0
     * @author Borja Martin
     */
    public static void main(String[] args) {
        // TODO terminar de implementar la funcionalidad del main
        final String NUMERO_DNI = "123123A";
        String nombreCompleto="Borja Martin Herrera"; // Los String son palabras y van entrecomillados doblesnombreCompleto.
        nombreCompleto = "Borja M H";
        // System.out.println(nombreCompleto.toLowerCase());
        Integer edadCompleja = 23;
        System.out.println("El valor maximo de un int es "+Integer.MAX_VALUE);
        System.out.println("El valor minimo de un int es "+Integer.MIN_VALUE);
        System.out.println("El valor de pi es "+Math.PI);
        int edad = 41;
        edad = edad +1;
        Float alturaCompleja = 1.65f;
        float altura = 1.71f;
        double peso = 70.23456789;
        Character letraCompleja = 'A';
        char letraCarnet = 'E';
        char letraCarnetNumero = 342; // ASCI -> caracter raro -> cifrador / descifrador
        boolean experiencia = true;
        experiencia = false;


        // Object[] datos = {nombreCompleto,edad,altura,peso,letraCarnet,experiencia};

        // NUMERO_DNI = "asdasd";
        System.out.println("Mi DNI es "+NUMERO_DNI);
        System.out.println("Esta impresion la acabo de hacer");
        System.out.println("Mi nombre es "+nombreCompleto);
        System.out.println("Mi edad es "+edad+" años");
        System.out.println("Mi altura es de "+altura+" cm");
        System.out.println("Mi peso es de "+peso+" kg");
        System.out.println("La letra de mi DNI es "+letraCarnet);
        System.out.println("Tengo experiencia "+experiencia);

        /*
        Este comentario lo voy a utilizar si necesito una explicacion
        un poco mas larga de lo que hace el metodo o de la duda que me
        genera el metodo
         */
    }

    public void metodoCarton(){
        // TODO pendiente crear el carton con numeros aleatorios sin repetir
        System.out.println(nombreMio);
    }

    public void otroMetodo(){
        String nombreMio = "asdasdasd";
        System.out.println(this.nombreMio);

    }
}





