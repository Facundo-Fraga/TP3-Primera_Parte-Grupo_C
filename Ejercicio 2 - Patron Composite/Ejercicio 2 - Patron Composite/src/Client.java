import modelo.File;
import modelo.Directory;

public class Client { //Responsable de crear una estructura de archivos y directorios, y mostrar sus detalles.

    /**
     * Método principal que crea y muestra la estructura de archivos y directorios.
     * 
     * @param args Argumentos de línea de comandos (no utilizados).
     */

    public static void main(String[] args) throws Exception {
        
        // Creación de archivos individuales
        File file1 = new File("documento.txt", 1200);
        File file2 = new File("foto.jpg", 3400);
        File file3 = new File("video.mp4", 8900);

        // Creación de directorios
        Directory mainDir = new Directory("Directorio Principal");
        Directory subDir1 = new Directory("Subdirectorio 1");
        Directory subDir2 = new Directory("Subdirectorio 2");

        // Agregar archivos a los directorios
        subDir1.addComponent(file1);
        subDir1.addComponent(file2);
        subDir2.addComponent(file3);

        // Agregar subdirectorios al directorio principal
        mainDir.addComponent(subDir1);
        mainDir.addComponent(subDir2);

        // Mostrar los detalles de toda la estructura del sistema de archivos
        mainDir.showDetails();
    }
}
