package main;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class SoundPlayer {
	Clip clip;
	
	public void SetFile(String path) {
		try {
			File file = new File(path);
			AudioInputStream sound = AudioSystem.getAudioInputStream(file);
			clip = AudioSystem.getClip();
			clip.open(sound);
		} catch (IOException e) {
			e.printStackTrace();
		} catch(Exception e) {
			
		}
	}

	public void play() {
		//make a delay to play the sound, before next instruction cut it
		try {
		Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clip.setFramePosition(0);
		clip.start();
	}
	public void stop() {
		clip.stop();;
	}
}