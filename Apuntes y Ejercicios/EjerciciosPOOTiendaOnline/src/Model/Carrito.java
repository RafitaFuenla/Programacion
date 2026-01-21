package Model;
import java.util.HashMap;

    public class Carrito {
        private HashMap<Producto, Integer> items;

        public Carrito() {
            this.items = new HashMap<>();
        }

        public void anadirProducto(Producto p, int cantidad) {
            if (items.containsKey(p)) {
                // El producto YA está → sumamos cantidades
                int cantidadActual = items.get(p);
                items.put(p, cantidadActual + cantidad);
            } else {
                // El producto NO está → lo añadimos
                items.put(p, cantidad);
            }
        }

        public void eliminarProducto(Producto p){
            items.remove(p);
        }

        public double calcularTotal(){
            double total = 0;

            for (Producto producto : items.keySet()) {
                int cantidad = items.get(producto);
                double precio = producto.getPrecio();
                total += cantidad * precio;
            }
            return total;
        }

        public void mostrarCarrito() {
            System.out.println("\n--- CARRITO DE COMPRA ---");

            int contador = 1;  // Para numerar los productos (1, 2, 3...)

            for (Producto producto : items.keySet()) {
                int cantidad = items.get(producto);
                double precioUnitario = producto.getPrecio();
                double subtotal = cantidad * precioUnitario;

                System.out.println(contador+ ". " +producto.getNombre() +
                        " x" +cantidad+ " - " +subtotal+ "€");
                contador++;
            }

            System.out.println("Total: " +calcularTotal()+ "€");
        }

        public void finalizarCompra() {
            for (Producto producto : items.keySet()) {
                int cantidadComprada = items.get(producto);
                int stockActual = producto.getStock();
                int nuevoStock = stockActual - cantidadComprada;
                producto.setStock(nuevoStock);
            }
            System.out.println("\nFinalizando compra...");
            System.out.println("✓ Compra realizada con éxito");
            System.out.println("Stock actualizado");
        }
    }


