package biblioteca.repositorio;

import biblioteca.modulo.Lector;

import java.util.ArrayList;
import java.util.List;

public class LectorRepositorio implements Repositorio<Lector>{
    List<Lector> listaLectores;

    public LectorRepositorio() {
        this.listaLectores = new ArrayList<>();
    }

    @Override
    public void crear(Lector lector) {
    listaLectores.add(lector);

    }

    @Override
    public Lector leerPorId(String id) {
        for (Lector lector:listaLectores){
            if (lector.getIdlector().equals(id)){
                return lector;
            }
        }
        return null;
    }

    @Override
    public void actualizar(Lector lector) {
        Lector lectorExistente= leerPorId(lector.getId());
        if(lectorExistente!=null){
            lectorExistente.setActivo(lector.isActivo());
            lectorExistente.setApellido(lector.getApellido());
            lectorExistente.setNombre(lector.getNombre());
            lectorExistente.setDireccion(lector.getDireccion());
            lectorExistente.setTelefono(lector.getTelefono());
            System.out.println("Se actualizo lector");
        }

    }

    @Override
    public void eliminarPorId(String id) {
        Lector lector= leerPorId(id);
        if(lector!=null){
            listaLectores.remove(lector);
            System.out.println("Se Elimino el lector");
        }else{
            System.out.println("No se elimino nada");
        }
    }
    public List<Lector> listaTodosLectores(){
        return listaLectores;
    }
}
