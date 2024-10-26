package modelo;

/**
 * La interfaz MusicPlayer define un contrato para reproducir canciones.
 * Proporciona un método por defecto para reproducir música.
 */
public interface MusicPlayer {
    /**
     * Reproduce una canción dada por su nombre de archivo.
     * 
     * @param fileName El nombre del archivo de la canción a reproducir.
     */
    public default void playSong(String fileName) {
        System.out.println("Reproduciendo MusicPlayer \t" + fileName);
    }
}
