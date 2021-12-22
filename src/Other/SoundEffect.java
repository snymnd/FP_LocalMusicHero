package Other;

import main.SoundPlayer;

public class SoundEffect {

	private String pathButton1 = ".//soundEffect//button-6.wav";
	private String pathButton2 = ".//soundEffect//button-5.wav";

	public SoundPlayer button1 = new SoundPlayer();
	public SoundPlayer button2 = new SoundPlayer();
	
	public SoundEffect() {
		button1.SetFile(pathButton1);
		button2.SetFile(pathButton2);
	}

}
