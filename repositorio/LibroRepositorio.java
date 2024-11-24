package biblioteca.repositorio;

import biblioteca.modulo.Libro;

import java.util.ArrayList;
import java.util.List;

public class LibroRepositorio implements Repositorio<Libro> {

    List<Libro> listaLibros;

    public LibroRepositorio() {
        this.listaLibros = new ArrayList<>();
    }

    @Override
    public void crear(Libro libro) {
        listaLibros.add(libro);

    }

    @Override
    public Libro leerPorId(String id) {
        for (Libro l : listaLibros) {
            if (l.getIdlibro().equals(id)) {
                return l;
            } else {
                System.out.println("No se encontro ningun libro puto");
            }
        }
        return null;
    }

    @Override
    public void actualizar(Libro libro) {
        Libro libroExistente = leerPorId(libro.getIdlibro());
        if (libroExistente != null) {
            libroExistente.setAutor(libro.getAutor());
            libroExistente.setGenero(libro.getGenero());
            libroExistente.setTitulo(libro.getTitulo());
            libroExistente.setNumeroPagina(libro.getNumeroPagina());
            System.out.println("Se Actualizo el libro... Puto...");
        } else {
            System.out.println("no se realizo ninguna actualizacion...");
        }
    }

    @Override
    public void eliminarPorId(String id) {
        Libro libro = leerPorId(id);
        if (libro != null) {
            listaLibros.remove(libro);
            System.out.println("Se borro el Libro...");
        } else {
            System.out.println("No se Borro ningun libro.");
        }
    }
    public List<Libro> listaLibros(){
        return listaLibros;
    }
}
