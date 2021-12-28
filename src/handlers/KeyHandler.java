package handlers;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener{
	public int currentPress = -1;
	public int hasReleased = -1;

	public KeyHandler() {}

	public void keyTyped(KeyEvent e) {}

	public void keyPressed(KeyEvent e) {
		currentPress = e.getKeyCode();
		hasReleased = e.getKeyCode();
	}

	public void keyReleased(KeyEvent e) {
		currentPress = -1;
		hasReleased = -1;
	}
}
