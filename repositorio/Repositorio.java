package biblioteca.repositorio;

interface Repositorio<T> {
    void crear(T t);
    T leerPorId(String id);
    void actualizar(T t);
    void eliminarPorId (String id);
}
