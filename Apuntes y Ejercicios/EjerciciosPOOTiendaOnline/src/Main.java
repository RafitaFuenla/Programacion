import Model.Cliente;
import Model.Producto;
import Model.Carrito;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n--- TIENDA ONLINE ---");

        // Crear productos con stock inicial
        Producto portatil = new Producto("Portátil", 899.99, 10);
        Producto raton = new Producto("Ratón", 25.50, 20);
        Producto teclado = new Producto("Teclado", 45.99, 15);

        // Añado cliente y lo imprimo
        Cliente c1 = new Cliente("Ana Martinez", "ana@gmail.com");

        System.out.println("Cliente: " +c1);

        // Añadir productos al carrito y mostrar el carrito
        System.out.println("\nAñadiendo " +portatil+ " x1 al carrito... ✓");
        c1.getCarrito().anadirProducto(portatil, 1);
        System.out.println("Añadiendo " +raton+ " x2 al carrito... ✓");
        c1.getCarrito().anadirProducto(raton, 2);
        System.out.println("Añadiendo " +teclado+ " x1 al carrito... ✓");
        c1.getCarrito().anadirProducto(teclado, 1);

        c1.getCarrito().mostrarCarrito();

        // Elimino producto del carro
        System.out.println("\nEliminando raton del carrito... ✓");
        System.out.println();
        c1.getCarrito().eliminarProducto(raton);

        // Muestro carro
        c1.getCarrito().mostrarCarrito();

        // Finalizo la compra
        c1.getCarrito().finalizarCompra();

    }
}