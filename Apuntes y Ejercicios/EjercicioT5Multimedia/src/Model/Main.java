package Model;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static boolean existeID(ArrayList<Multimedia> coleccion, int id) {
        for (Multimedia item : coleccion) {
            if (item.getIdentificador() == id) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Multimedia> coleccion = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1. Añadir elemento");
            System.out.println("2. Eliminar elemento");
            System.out.println("3. Listar elementos");
            System.out.println("4. Buscar por autor");
            System.out.println("5. Buscar por actor");
            System.out.println("6. Buscar por director");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("\n¿Qué tipo de multimedia quieres agregar?");
                    System.out.println("1. Libro");
                    System.out.println("2. Video");
                    System.out.println("3. Audio");
                    System.out.print("Tipo: ");
                    int tipo = sc.nextInt();
                    sc.nextLine(); // Limpiar buffer

                    switch (tipo) {
                        case 1 -> {
                            System.out.print("Título: ");
                            String titulo = sc.nextLine();
                            System.out.print("Autor: ");
                            String autor = sc.nextLine();
                            System.out.print("Tamaño (MB): ");
                            int tamanio = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Formato: ");
                            String formato = sc.nextLine();
                            System.out.print("Número de páginas: ");
                            int nPaginas = sc.nextInt();

                            Libro libro = new Libro(titulo, autor, tamanio, formato, nPaginas);
                            coleccion.add(libro);
                            System.out.println("✓ Libro añadido correctamente.");
                        }
                        case 2 -> {
                            System.out.print("Título: ");
                            String titulo = sc.nextLine();
                            System.out.print("Autor: ");
                            String autor = sc.nextLine();
                            System.out.print("Tamaño (MB): ");
                            int tamanio = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Formato: ");
                            String formato = sc.nextLine();
                            System.out.print("Director: ");
                            String director = sc.nextLine();
                            System.out.print("Actores: ");
                            String actores = sc.nextLine();

                            Video video = new Video(titulo, autor, tamanio, formato, director, actores);
                            coleccion.add(video);
                            System.out.println("✓ Video añadido correctamente.");
                        }
                        case 3 -> {
                            System.out.print("Título: ");
                            String titulo = sc.nextLine();
                            System.out.print("Autor: ");
                            String autor = sc.nextLine();
                            System.out.print("Tamaño (MB): ");
                            int tamanio = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Formato: ");
                            String formato = sc.nextLine();
                            System.out.print("Duración (segundos): ");
                            int duracion = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Soporte: ");
                            String soporte = sc.nextLine();

                            Audio audio = new Audio(titulo, autor, tamanio, formato, duracion, soporte);
                            coleccion.add(audio);
                            System.out.println("✓ Audio añadido correctamente.");
                        }
                        default -> System.out.println("✗ Tipo no válido");
                    }
                }

                case 2 -> {
                    System.out.print("\nIntroduce el ID del elemento a eliminar: ");
                    int idEliminar = sc.nextInt();

                    if (existeID(coleccion, idEliminar)) {
                        for (int i = 0; i < coleccion.size(); i++) {
                            if (coleccion.get(i).getIdentificador() == idEliminar) {
                                coleccion.remove(i);
                                System.out.println("✓ Elemento eliminado correctamente.");
                                break;
                            }
                        }
                    } else {
                        System.out.println("✗ No existe ningún elemento con ese ID.");
                    }
                }

                case 3 -> {
                    System.out.println("\n¿Qué quieres listar?");
                    System.out.println("1. Libros");
                    System.out.println("2. Videos");
                    System.out.println("3. Audios");
                    System.out.println("4. Todos");
                    System.out.print("Opción: ");
                    int tipoLista = sc.nextInt();

                    switch (tipoLista) {
                        case 1 -> {
                            System.out.println("\n=== LIBROS ===");
                            boolean encontrado = false;
                            for (Multimedia item : coleccion) {
                                if (item instanceof Libro) {
                                    item.mostrarDatos();
                                    encontrado = true;
                                }
                            }
                            if (!encontrado) {
                                System.out.println("No hay libros en la colección.");
                            }
                        }
                        case 2 -> {
                            System.out.println("\n=== VIDEOS ===");
                            boolean encontrado = false;
                            for (Multimedia item : coleccion) {
                                if (item instanceof Video) {
                                    item.mostrarDatos();
                                    encontrado = true;
                                }
                            }
                            if (!encontrado) {
                                System.out.println("No hay videos en la colección.");
                            }
                        }
                        case 3 -> {
                            System.out.println("\n=== AUDIOS ===");
                            boolean encontrado = false;
                            for (Multimedia item : coleccion) {
                                if (item instanceof Audio) {
                                    item.mostrarDatos();
                                    encontrado = true;
                                }
                            }
                            if (!encontrado) {
                                System.out.println("No hay audios en la colección.");
                            }
                        }
                        case 4 -> {
                            System.out.println("\n=== TODA LA COLECCIÓN ===");
                            if (coleccion.isEmpty()) {
                                System.out.println("La colección está vacía.");
                            } else {
                                for (Multimedia item : coleccion) {
                                    item.mostrarDatos();
                                }
                            }
                        }
                        default -> System.out.println("✗ Opción no válida");
                    }
                }

                case 4 -> {
                    System.out.print("\nIntroduce el nombre del autor: ");
                    sc.nextLine();
                    String autorBuscado = sc.nextLine();

                    System.out.println("\nLibros de " + autorBuscado + ":");
                    boolean encontrado = false;
                    for (Multimedia item : coleccion) {
                        if (item instanceof Libro) {
                            if (item.getAutor().equalsIgnoreCase(autorBuscado)) {
                                System.out.println("- " + item.getTitulo());
                                encontrado = true;
                            }
                        }
                    }
                    if (!encontrado) {
                        System.out.println("No se encontraron libros de ese autor.");
                    }
                }

                case 5 -> {
                    System.out.print("\nIntroduce el nombre del actor: ");
                    sc.nextLine();
                    String actorBuscado = sc.nextLine();

                    System.out.println("\nPelículas con " + actorBuscado + ":");
                    boolean encontrado = false;
                    for (Multimedia item : coleccion) {
                        if (item instanceof Video) {
                            Video video = (Video) item;
                            if (video.getActores().toLowerCase().contains(actorBuscado.toLowerCase())) {
                                System.out.println("- " + video.getTitulo());
                                encontrado = true;
                            }
                        }
                    }
                    if (!encontrado) {
                        System.out.println("No se encontraron películas con ese actor.");
                    }
                }

                case 6 -> {
                    System.out.print("\nIntroduce el nombre del director: ");
                    sc.nextLine();
                    String directorBuscado = sc.nextLine();

                    System.out.println("\nPelículas de " + directorBuscado + ":");
                    boolean encontrado = false;
                    for (Multimedia item : coleccion) {
                        if (item instanceof Video) {
                            Video video = (Video) item;
                            if (video.getDirector().equalsIgnoreCase(directorBuscado)) {
                                System.out.println("- " + video.getTitulo());
                                encontrado = true;
                            }
                        }
                    }
                    if (!encontrado) {
                        System.out.println("No se encontraron películas de ese director.");
                    }
                }

                case 0 -> System.out.println("\n¡Hasta pronto!");
                default -> System.out.println("✗ Opción no válida");
            }
        } while (opcion != 0);

        sc.close();
    }
}