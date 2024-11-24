package biblioteca.modulo;

public class Administrador extends Persona {
    private String idEmpleado;

    public Administrador(String nombre, String apellido, String id, String direccion, String telefono, String idEmpleado) {
        super(nombre, apellido, id, direccion, telefono);
        this.idEmpleado = idEmpleado;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    @Override
    public String toString() {
        return super.toString()+"\nAdministrador{" +
                "idEmpleado='" + idEmpleado + '\'' +
                '}';
    }
}
