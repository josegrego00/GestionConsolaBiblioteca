package biblioteca.modulo;



public class Libro {
    private String titulo;
    private String autor;
    private Genero genero;
    private int numeroPagina;
    private String idlibro;
    private boolean disponible;

    public Libro() {
    }

    public Libro(String titulo, String autor, Genero genero, int numeroPagina, String idlibro, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.numeroPagina = numeroPagina;
        this.idlibro = idlibro;
        this.disponible = disponible;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public int getNumeroPagina() {
        return numeroPagina;
    }

    public void setNumeroPagina(int numeroPagina) {
        this.numeroPagina = numeroPagina;
    }

    public String getIdlibro() {
        return idlibro;
    }

    public void setIdlibro(String idlibro) {
        this.idlibro = idlibro;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", genero=" + genero +
                ", numeroPagina=" + numeroPagina +
                ", idlibro='" + idlibro + '\'' +
                ", disponible=" + disponible +
                '}';
    }
}
