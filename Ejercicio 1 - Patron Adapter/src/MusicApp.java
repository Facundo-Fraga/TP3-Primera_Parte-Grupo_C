import modelo.ThirdPartyAudioPlayer;
import modelo.ThirdPartyAudioPlayerAMusicPlayer;

public class MusicApp {
    public static void main(String[] args) throws Exception {
        // Crear una instancia del reproductor de terceros
        ThirdPartyAudioPlayer thirdPartyAudioPlayer = new ThirdPartyAudioPlayer("cancion1.mp3");

        // Crear un adaptador para el reproductor de terceros
        ThirdPartyAudioPlayerAMusicPlayer musicPlayer = new ThirdPartyAudioPlayerAMusicPlayer(thirdPartyAudioPlayer);

        // Reproducir una canción con el MusicPlayer
        musicPlayer.playSong("cancion2.mp3");

        // También podemos usar el método de la interfaz MusicPlayer
        musicPlayer.playSong("cancion3.mp3");
       
        musicPlayer.playSong("");
    }
}
