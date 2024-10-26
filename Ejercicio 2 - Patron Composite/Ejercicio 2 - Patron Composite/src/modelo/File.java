package modelo;

/**
 * La clase File representa un archivo en el sistema de archivos.
 * Almacena el nombre del archivo y su tamaño en bytes.
 */

 public class File extends FileSystemComponent {
    
    private int size; // Tamaño del archivo en bytes.

    /**
     * Constructor de la clase File.
     * 
     * @param name Nombre del archivo.
     * @param size Tamaño del archivo en bytes.
     */
    
     public File(String name, int size) {
        super(name); // Invoca el constructor de la clase base para inicializar 'name'
        this.size = size;
    }

    /**
     * Muestra los detalles del archivo, incluyendo su nombre y tamaño.
     */
    
    @Override
    public void showDetails() {
        System.out.println("Archivo: " + name + " (" + size + " bytes)");
    }
}
