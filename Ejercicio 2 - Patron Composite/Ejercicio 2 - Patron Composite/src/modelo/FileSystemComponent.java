package modelo;

/**
 * Clase base abstracta para representar un componente en el sistema de archivos.
 * Puede ser un archivo (File) o un directorio (Directory).
 */

public abstract class FileSystemComponent {

    protected String name; // Nombre del archivo o directorio.

    /**
     * Constructor de la clase FileSystemComponent.
     * 
     * @param name Nombre del archivo o directorio.
     */

    public FileSystemComponent(String name) {
        this.name = name;
    }

    /**
     * Devuelve los detalles del componente del sistema de archivos.
     * Para los archivos, muestra los detalles del archivo.
     * Para los directorios, muestra los detalles del directorio y sus contenidos de forma recursiva.
     * Este método será implementado por las subclases.
     */
    
     public abstract void showDetails();

    /**
     * Método opcional para agregar un componente al objeto compuesto.
     * 
     * @param component El componente a agregar (puede ser un Archivo o Directorio).
     * @throws UnsupportedOperationException Si la operación no está soportada.
     */
    
     public void addComponent(FileSystemComponent component) {
        throw new UnsupportedOperationException("Operación no soportada");
    }

    /**
     * Método opcional para eliminar un componente del objeto compuesto.
     * 
     * @param component El componente a eliminar (puede ser un Archivo o Directorio).
     * @throws UnsupportedOperationException Si la operación no está soportada.
     */
    
     public void removeComponent(FileSystemComponent component) {
        throw new UnsupportedOperationException("Operación no soportada");
    }
}
