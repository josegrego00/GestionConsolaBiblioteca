# GestionConsolaBiblioteca
**Enunciado del Proyecto: Sistema de Gestión de Biblioteca Digital**

**Descripción General:**

El objetivo del proyecto es desarrollar un sistema para la gestión de una biblioteca digital utilizando principios de Programación Orientada a Objetos (POO) y aprovechando conceptos avanzados de Java como herencia, interfaces, repositorios, genéricos, la API de colecciones y threads.

---

### **Requisitos del Sistema**

1. **~~Gestión de Usuarios:~~**
    - ~~Se deben manejar dos tipos de usuarios principales:~~
        - **~~Lector**: Puede buscar y leer libros digitales disponibles.~~
        - **~~Administrador**: Puede agregar, eliminar o actualizar libros y gestionar usuarios.~~
    - ~~Implementar esta funcionalidad utilizando **herencia**.~~
2. **~~Gestión de Libros:~~**
    - ~~Los libros deben tener atributos como título, autor, género, número de páginas, y un identificador único.~~
    - E~~l sistema debe permitir realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre los libros utilizando un **repositorio** genérico.~~
3. **~~Búsqueda y Filtros:~~**
    - ~~Los lectores deben poder buscar libros por diferentes criterios como género, autor o rango de páginas.~~
    - ~~Utilizar la **API de colecciones** para implementar búsquedas y filtros de manera eficiente.~~
4. **Reservas y Simulación de Lectura:**
    - Un lector puede reservar un libro por un período limitado de tiempo.
    - Implementar un sistema de **threads** para simular la lectura de un libro. Por ejemplo, al "leer" un libro, un hilo debe simular el paso del tiempo mientras muestra mensajes como "Leyendo página 1...", "Leyendo página 2..." con intervalos de 1 segundo.
5. **~~Interfaces:~~**
    - ~~Crear una interfaz `CRUDRepository<T>` con métodos genéricos como `save(T entity)`, `deleteById(int id)`, `findById(int id)`, y `findAll()`~~.
    - I~~mplementar esta interfaz para manejar tanto libros como usuarios.~~
6. **~~Uso de Genéricos:~~**
    - ~~La interfaz y las clases que gestionan repositorios deben ser genéricas para soportar cualquier tipo de entidad.~~
    - ~~Implementar al menos dos tipos de repositorios: uno para los libros y otro para los usuarios.~~
7. **Persistencia de Datos:**
    - ~~Los datos de libros y usuarios deben almacenarse en memoria durante la ejecución usando estructuras de la API de colecciones (como `List`, `Map`, etc.).~~
    - Opcionalmente, puedes implementar la persistencia en archivos para guardar y cargar los datos entre ejecuciones.
8. **Interfaz de Usuario:**
    - Crear una interfaz de texto simple (en consola) para interactuar con el sistema. El menú debe ofrecer opciones como:
        - Registro y autenticación de usuarios.
        - Agregar o buscar libros.
        - Realizar reservas y simular la lectura.
