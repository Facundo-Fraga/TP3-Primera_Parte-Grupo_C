package modelo;

/**
 * La clase ThirdPartyAudioPlayerAMusicPlayer actúa como un adaptador que 
 * implementa la interfaz MusicPlayer y utiliza un reproductor de audio 
 * de terceros para reproducir canciones.
 */
public class ThirdPartyAudioPlayerAMusicPlayer implements MusicPlayer {
    private ThirdPartyAudioPlayer thirdPartyAudioPlayer;

    /**
     * Constructor que inicializa el adaptador con un reproductor de terceros.
     * 
     * @param thirdPartyAudioPlayer Instancia de ThirdPartyAudioPlayer a usar.
     */
    public ThirdPartyAudioPlayerAMusicPlayer(ThirdPartyAudioPlayer thirdPartyAudioPlayer) {
        this.thirdPartyAudioPlayer = thirdPartyAudioPlayer;
    }

    /**
     * Reproduce una canción dada por su nombre de archivo.
     * 
     * @param fileName El nombre del archivo de la canción a reproducir.
     */
    @Override
    public void playSong(String fileName) {
        System.out.println("Reproduciendo ThirdPartyAudioPlayerAMusicPlayer \t" + thirdPartyAudioPlayer.getFile());
        thirdPartyAudioPlayer.setFile(fileName); // Se pone en cola la música
    }
}
