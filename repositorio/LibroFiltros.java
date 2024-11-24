package biblioteca.repositorio;

import biblioteca.modulo.Genero;
import biblioteca.modulo.Libro;

import java.util.ArrayList;
import java.util.List;

public class LibroFiltros {
    private LibroRepositorio libroRepositorio;

    public LibroFiltros(LibroRepositorio libroRepositorio) {
        this.libroRepositorio = libroRepositorio;
    }

    public List<Libro> librosPorGenero(Genero genero){
        List<Libro> listaLibroGenero=new ArrayList<>();
        for (Libro libro:libroRepositorio.listaLibros()){
            if(libro.getGenero().equals(genero)){
                listaLibroGenero.add(libro);
            }
        }
        return listaLibroGenero;
    }
    public List<Libro> librosPorAutor(String autor){
        List<Libro> listaLibroAutor=new ArrayList<>();
        for (Libro libro:libroRepositorio.listaLibros()){
            if(libro.getAutor().equalsIgnoreCase(autor)){
                listaLibroAutor.add(libro);
            }
        }
        return listaLibroAutor;
    }
    public List<Libro> librosPorNumeroPaginas(int numeroPaginasMIN,int numeroPaginasMAX ){
        List<Libro> listaLibroNumeroPaginas=new ArrayList<>();
        for (Libro libro:libroRepositorio.listaLibros()){
            if(libro.getNumeroPagina()>=numeroPaginasMIN && libro.getNumeroPagina()<=numeroPaginasMAX){
                listaLibroNumeroPaginas.add(libro);
            }
        }
        return listaLibroNumeroPaginas;
    }
}
