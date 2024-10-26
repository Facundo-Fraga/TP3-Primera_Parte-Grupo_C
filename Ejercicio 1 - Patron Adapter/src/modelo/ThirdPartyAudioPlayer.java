package modelo;

/**
 * La clase ThirdPartyAudioPlayer simula un reproductor de audio de terceros.
 * Permite establecer y obtener el archivo de audio que se va a reproducir,
 * así como iniciar la reproducción de la música.
 */
public class ThirdPartyAudioPlayer {
    private String file = ""; // Nombre del archivo de música

    /**
     * Constructor que inicializa el reproductor de audio con un archivo específico.
     * 
     * @param file El nombre del archivo de música a reproducir.
     */
    public ThirdPartyAudioPlayer(String file) {
        this.file = file;
    }

    /**
     * Inicia la reproducción de un archivo de música.
     * 
     * @param file El nombre del archivo de música a reproducir.
     */
    public void startAudio(String file) {
        this.file = file; // Establece el archivo a reproducir
        System.out.println("Reproduciendo ThirdPartyAudioPlayer \t" + file);
    }

    /**
     * Obtiene el archivo de música que se está reproduciendo.
     * 
     * @return El nombre del archivo de música si está establecido,
     *         o un mensaje indicando que no hay archivo de música.
     */
    public String getFile() {
        if (file.equals("")) {
            return "Sin file de musica"; // Mensaje si no hay archivo
        }
        return file; // Retorna el archivo actual
    }

    /**
     * Establece un nuevo archivo de música a reproducir.
     * 
     * @param file El nombre del nuevo archivo de música.
     */
    public void setFile(String file) {
        this.file = file; // Establece el archivo
    }
}