package biblioteca.modulo;

public class Lector extends  Persona{
    private String idlector;
    private boolean activo;

    public Lector() {
    }

    public Lector(String nombre, String apellido, String id, String direccion, String telefono, String idlector, boolean activo) {
        super(nombre, apellido, id, direccion, telefono);
        this.idlector = idlector;
        this.activo = activo;
    }

    public String getIdlector() {
        return idlector;
    }

    public void setIdlector(String idlector) {
        this.idlector = idlector;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return super.toString()+"\nLector{" +
                "idlector='" + idlector + '\'' +
                ", activo=" + activo +
                '}';
    }
}
