package biblioteca;

import biblioteca.modulo.Administrador;
import biblioteca.modulo.Genero;
import biblioteca.modulo.Lector;
import biblioteca.modulo.Libro;
import biblioteca.repositorio.AdministradorRepositorio;
import biblioteca.repositorio.LectorRepositorio;
import biblioteca.repositorio.LibroRepositorio;
import biblioteca.view.PrincipalView;

import java.util.List;

public class main {
    public static void main(String[] args) {

        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", Genero.FANTASIA, 20, "1", true);
        Libro libro2 = new Libro("1984", "George Orwell", Genero.FANTASIA, 328, "2", true);
        Libro libro3 = new Libro("El gran Gatsby", "F. Scott Fitzgerald",Genero.COMEDIA, 180, "3", true);
        Libro libro4 = new Libro("Orgullo y prejuicio", "Jane Austen", Genero.NOVELA, 432, "4", false);  // Este está reservado
        Libro libro5 = new Libro("Matar a un ruiseñor", "Harper Lee", Genero.NOVELA, 281, "5", true);
        Libro libro6 = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", Genero.FANTASIA, 1178, "6", true);
        Libro libro7 = new Libro("El Hobbit", "J.R.R. Tolkien", Genero.FANTASIA, 310, "7", true);
        Libro libro8 = new Libro("Cumbres Borrascosas", "Emily Brontë", Genero.NOVELA, 400, "8", false);
        Libro libro9 = new Libro("Crimen y Castigo", "Fiódor Dostoyevski", Genero.DRAMA, 430, "9", true);
        Libro libro10 = new Libro("La Odisea", "Homero", Genero.DRAMA, 350, "10", true);
        Libro libro11 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", Genero.NOVELA, 1072, "11", true);
        Libro libro12 = new Libro("Los Miserables", "Victor Hugo", Genero.DRAMA, 1462, "12", false);
        Libro libro13 = new Libro("El Perfume", "Patrick Süskind", Genero.TERROR, 275, "13", true);
        Libro libro14 = new Libro("Fahrenheit 451", "Ray Bradbury", Genero.ROMANCE, 256, "14", true);


        Lector Juan = new Lector("Juan", "Pérez", "L001", "Calle Ficticia 123, Ciudad X", "+34 123 456 789", "L001", true);
        Lector Ana = new Lector("Ana", "Gómez", "L002", "Avenida de la Luna 456, Ciudad Y", "+34 987 654 321", "L002", false);
        Lector Carlos = new Lector("Carlos", "Martínez", "L003", "Plaza Mayor 789, Ciudad Z", "+34 555 123 456", "L003", true);
        Lector Lucia = new Lector("Lucía", "Rodríguez", "L004", "Calle Sol 321, Ciudad W", "+34 666 987 654", "L004", false);
        Lector Jose = new Lector("José", "Hernández", "L005", "Calle del Mar 654, Ciudad V", "+34 777 456 789", "L005", true);

        Administrador admin1 = new Administrador("Juan", "Pérez", "12345678A", "Calle 123", "555-1234", "EMP001");
        Administrador admin2 = new Administrador("Ana", "Gómez", "87654321B", "Avenida 456", "555-5678", "EMP002");

        LibroRepositorio libroRepositorio= new LibroRepositorio();
        LectorRepositorio lectorRepositorio= new LectorRepositorio();
        AdministradorRepositorio administradorRepositorio= new AdministradorRepositorio();

        administradorRepositorio.crear(admin1);
        administradorRepositorio.crear(admin2);

        libroRepositorio.crear(libro1);
        libroRepositorio.crear(libro2);
        libroRepositorio.crear(libro3);
        libroRepositorio.crear(libro4);
        libroRepositorio.crear(libro5);
        libroRepositorio.crear(libro6);
        libroRepositorio.crear(libro7);
        libroRepositorio.crear(libro8);
        libroRepositorio.crear(libro9);
        libroRepositorio.crear(libro10);
        libroRepositorio.crear(libro11);
        libroRepositorio.crear(libro12);
        libroRepositorio.crear(libro13);
        libroRepositorio.crear(libro14);

        lectorRepositorio.crear(Ana);
        lectorRepositorio.crear(Jose);
        lectorRepositorio.crear(Carlos);
        lectorRepositorio.crear(Juan);
        lectorRepositorio.crear(Lucia);


        PrincipalView view = new PrincipalView(administradorRepositorio, lectorRepositorio, libroRepositorio);

    }
}
