package snakeGame;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Sound {
    public static void RunMusic(String path) {
        try (AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File(path))) {
            Clip clip = AudioSystem.getClip();
            clip.open(inputStream);
            clip.start();
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (UnsupportedAudioFileException e) {
            System.err.println("Das angegebene Audioformat wird nicht unterstützt: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Fehler beim Laden der Audiodatei: " + e.getMessage());
        } catch (LineUnavailableException e) {
            System.err.println("Audioausgabegerät ist nicht verfügbar: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("Ungültige Eingabe für die Audiodatei: " + e.getMessage());
        }
    }
}

