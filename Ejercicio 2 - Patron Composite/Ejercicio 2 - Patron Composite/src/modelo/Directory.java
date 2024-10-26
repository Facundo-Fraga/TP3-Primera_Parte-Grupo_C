package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * La clase Directory representa un directorio en el sistema de archivos.
 * Puede contener una lista de FileSystemComponent (ya sea Archivos o Directorios).
 */

public class Directory extends FileSystemComponent {

    private List<FileSystemComponent> components = new ArrayList<>(); // Lista de componentes (archivos o directorios) que contiene el directorio.

    /**
     * Constructor de la clase Directory.
     * 
     * @param name Nombre del directorio.
     */
    
     public Directory(String name) {
        super(name);
    }

    /**
     * Agrega un nuevo componente (Archivo o Directorio) al directorio actual.
     * 
     * @param component El archivo o directorio a agregar.
     */
    
    @Override
    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }

    /**
     * Elimina un componente (Archivo o Directorio) del directorio actual.
     * 
     * @param component El archivo o directorio a eliminar.
     */
    
    @Override
    public void removeComponent(FileSystemComponent component) {
        components.remove(component);
    }

    /**
     * Muestra los detalles del directorio, incluyendo su nombre y los contenidos de forma recursiva.
     */
    
    @Override
    public void showDetails() {
        System.out.println("Directorio: " + name);
        for (FileSystemComponent component : components) {
            component.showDetails();
        }
    }
}
