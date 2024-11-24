package biblioteca.view;

import biblioteca.modulo.Administrador;
import biblioteca.modulo.Genero;
import biblioteca.modulo.Lector;
import biblioteca.modulo.Libro;
import biblioteca.repositorio.AdministradorRepositorio;
import biblioteca.repositorio.LectorRepositorio;
import biblioteca.repositorio.LibroRepositorio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class PrincipalView {

    private AdministradorRepositorio adminRepositorio;
    private LectorRepositorio lectorRepositorio;
    private LibroRepositorio libroRepositorio;
    private Administrador administrador;
    private Lector lector;
    private Scanner sca = new Scanner(System.in);
    private boolean salir = false;
    private int ocp;

    public PrincipalView(AdministradorRepositorio administradorRepositorio, LectorRepositorio lectorRepositorio, LibroRepositorio libroRepositorio) {
        this.adminRepositorio = administradorRepositorio;
        this.lectorRepositorio = lectorRepositorio;
        this.libroRepositorio = libroRepositorio;
        while (!salir) {
            System.out.println("\n--- Sistema de Gestión de Biblioteca Digital ---");
            System.out.println("1. Iniciar Sesión");
            System.out.println("Salir del sistema");
            System.out.println("Ingrese una Opcion");
            ocp = sca.nextInt();
            switch (ocp) {
                case 1:
                    System.out.println("Ingrese Id Empleado..");
                    sca.nextLine();
                    IniciarSecion(sca.nextLine());
                    break;
                case 2:
                    System.out.println("Saliendo...");
                    try {
                        TimeUnit.SECONDS.sleep(2);
                        System.out.println("Hasta Luego....");
                        salir = true;
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                default:
                    System.out.println("Opcion Erronea...");
            }
            System.out.println("Gracias por usar el sistema de biblioteca.");
        }
    }

    public void IniciarSecion(String id) {
        Administrador admin = adminRepositorio.leerPorId(id);
        Lector lector1 = lectorRepositorio.leerPorId(id);
        if (admin != null) {
            System.out.println("Como esta " + adminRepositorio.leerPorId(id).getNombre() + " ?");
            System.out.println("Que va a Realizar...");
            System.out.println("1. Crear Lector");
            System.out.println("2. Agregar Libro");
            System.out.println("3. Buscar Libros");
            System.out.println("====================");
            System.out.println("Ingrese Tarea...");
            ocp = sca.nextInt();
            switch (ocp) {
                case 1:
                    System.out.println("Se Creara un nuevo Lector..");
                    crearLecto();
                    break;
                case 2:
                    System.out.println("Se Agregara un nuevo Libro...");
                    crearLibro();
                    break;
                case 3:
                    System.out.println("Se Listaran los Libros");
                    listarLibros();
            }
        } else {
            if (lector1 != null) {
                System.out.println("Como esta " + lectorRepositorio.leerPorId(id).getNombre() + " ?");
                System.out.println("Que va a Realizar...");
                System.out.println("1. Buscar Libros");
                System.out.println("2. Reservar Libro");
                System.out.println("3. Leer Libro");
                System.out.println("====================");
                System.out.println("Ingrese Tarea...");
                ocp = sca.nextInt();
                switch (ocp) {
                    case 1:
                        sca.nextLine();
                        System.out.println("Se Buscar un libro..");
                        buscarLibro(sca.nextLine());
                        break;
                    case 2:
                        sca.nextLine();
                        System.out.println("Se Reservo un nuevo Libro...");
                        reservaLibros(sca.nextLine());
                        break;
                    case 3:
                        sca.nextLine();
                        System.out.println("Se Lee un Libro");
                        System.out.println("Ingrese el id del libro");
                        leerLibro(sca.nextLine());
                }
            }

        }
    }

    public void crearLecto() {
        Lector lector1 = new Lector();
        sca.nextLine();
        System.out.println("Ingrese Nombre..");
        lector1.setNombre(sca.nextLine());
        System.out.println("Ingrese Apellido..");
        lector1.setApellido(sca.nextLine());
        System.out.println("Ingrese ID");
        lector1.setId(sca.nextLine());
        System.out.println("Ingrese Direccion..");
        lector1.setDireccion(sca.nextLine());
        System.out.println("Ingrese Telefono");
        lector1.setTelefono(sca.nextLine());
        lector1.setActivo(true);
        lector1.setIdlector(String.valueOf(Math.random() * 2000));
        lectorRepositorio.crear(lector1);

    }

    public void crearLibro() {
        Libro libro = new Libro();
        sca.nextLine();
        System.out.println("Ingrese Nombre libro..");
        libro.setTitulo(sca.nextLine());
        System.out.println("Ingrese Autor..");
        libro.setAutor(sca.nextLine());
        libro.setGenero(Genero.FANTASIA);
        System.out.println("Ingrese Numero de paginas..");
        libro.setNumeroPagina(sca.nextInt());
        System.out.println("Ingrese Telefono");
        libro.setDisponible(true);
        libro.setIdlibro(String.valueOf(Math.random() * 20000));
        libroRepositorio.crear(libro);

    }

    public void listarLibros() {
        List<Libro> listaLibros = new ArrayList<>();
        listaLibros = libroRepositorio.listaLibros();

        for (Libro libro : listaLibros) {
            System.out.println("Libro: " + libro.getTitulo());
            System.out.println(" Autor: " + libro.getAutor());
        }
        System.out.println("Hay un total de " + listaLibros.size() + " Libros");

    }

    public void buscarLibro(String id) {
        Libro libro = libroRepositorio.leerPorId(id);
        System.out.println("Titulo Libro " + libro.getTitulo());
        System.out.println("Autor del Libro : " + libro.getTitulo());
        System.out.println("Status del Libro : " + (libro.isDisponible()?"Esta disponible":"No esta disponible"));
    }

    public void reservaLibros(String id) {
        Libro libro = libroRepositorio.leerPorId(id);
        libro.setDisponible(false);
        libroRepositorio.actualizar(libro);
        System.out.println("Se resorvo este libro");
    }

    public void leerLibro(String id) {
        Libro libro = libroRepositorio.leerPorId(id);
        Runnable leerLibro = () -> {
            for (int i = 0; i < libro.getNumeroPagina(); i++) {
                try {
                    TimeUnit.MILLISECONDS.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Voy por la pagina " + i);
            }
        };
        ExecutorService ejecutor = Executors.newSingleThreadExecutor();
        ejecutor.submit(leerLibro);
        ejecutor.shutdown();
    }


}
