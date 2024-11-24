package biblioteca.repositorio;

import biblioteca.modulo.Administrador;
import biblioteca.modulo.Lector;

import java.util.ArrayList;
import java.util.List;

public class AdministradorRepositorio implements Repositorio<Administrador> {
    List<Administrador> listaAdministrador;

    public AdministradorRepositorio() {
        this.listaAdministrador = new ArrayList<>();
    }

    @Override
    public void crear(Administrador administrador) {
        listaAdministrador.add(administrador);
    }

    @Override
    public Administrador leerPorId(String id) {

        for (Administrador administrador : listaAdministrador) {
            if (administrador.getIdEmpleado().equalsIgnoreCase(id)) {
                return administrador;
            }
        }
        return null;
    }

    @Override
    public void actualizar(Administrador administrador) {
        Administrador administrador1 = leerPorId(administrador.getIdEmpleado());
        if (administrador1 != null) {
            administrador1.setNombre(administrador.getNombre());
            administrador1.setApellido(administrador.getApellido());
            administrador1.setDireccion(administrador.getDireccion());
            administrador1.setTelefono(administrador.getTelefono());
            System.out.println("Se actualizo el Administrador");
        }
    }

    @Override
    public void eliminarPorId(String id) {
        Administrador administrador = leerPorId(id);
        if (administrador != null) {
            listaAdministrador.remove(administrador);
            System.out.println("Se Elimino el Administrador");
        } else {
            System.out.println("No se elimino nada");
        }
    }

    public List<Administrador> listarTodosLosAdmin() {
        return listaAdministrador;
    }
}
