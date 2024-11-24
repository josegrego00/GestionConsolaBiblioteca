package biblioteca.modulo;

public enum Genero {
    TERROR("terror"),
    COMEDIA("comedia"),
    DRAMA("drama"),
    NOVELA("novela"),
    ROMANCE("romance"),
    FANTASIA("fantasia");

    private String nombreGenero;

    Genero(String nombreGenero) {
        this.nombreGenero = nombreGenero;
    }
}
