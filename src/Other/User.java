package Other;

import java.awt.event.KeyEvent;

import files.Files;

public class User {
	
	public static int[] bindcodes = {65, 83, 68, 74, 75};
	public static String[] binds = {"A", "S", "D", "J", "K"};
	
	public User() {
	
    }
    
	public static int[] getScore() {
		return Files.getScores();
	}
	public static void resetScores() {
		Files.resetScores();
	}
	public static void setNewScore(int placement, int score) {
		Files.saveScore(placement, score);
	}
}
