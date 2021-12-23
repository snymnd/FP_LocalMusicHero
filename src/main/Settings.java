package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import handlers.MouseHandler;
import object.FadingText;
import object.User;

public class Settings {
	private Rectangle[] buttons = {new Rectangle(10,10, 30, 30), 
								   new Rectangle(Frame.WIDTH/2 - 40, 325, 100, 50)};
	private Image[] buttonImages = {new ImageLoader(ImageLoader.backArrow).getImage(), 
									new ImageLoader(ImageLoader.resetScore).getImage()};
	private Image background =new ImageLoader(ImageLoader.settingsBG).getImage();

	private int[] scores = new int[3];
	private FadingText[] display = new FadingText[3];
	
	private int pressTimer = 0;
	
	public Settings() {
	}

	public void update() {
		if(pressTimer < 15) {
			pressTimer++;
			if(pressTimer == 3) {
				scores = User.getScore();
			}
		}
		for(int i = 0; i < display.length; i++) {
			if(display[i] != null) {
				display[i].update();
				if(display[i].isDead) {
					display[i] = null;
				}
			}
		}
		if(MouseHandler.MOUSEDOWN && pressTimer >= 15) {
			
			if(buttons[0].contains(Controller.mousePoint)) {
				pressTimer = 0;
				for(int i = 0; i < display.length; i++) {
					display[i] = null;
				}
				Controller.switchStates(STATE.MENU);
			}
			if(buttons[1].contains(Controller.mousePoint)) {
				//Reset Scores
				scores[0] = 0;
				scores[1] = 0;
				scores[2] = 0;
				User.resetScores();
				addText("Score Reset");
			}
			scores = User.getScore();
		}
	}

	public void render(Graphics g) {
		g.drawImage(background, 0, 0, Frame.WIDTH, Frame.HEIGHT, null);
		g.drawString("Settings", Frame.WIDTH/2-g.getFontMetrics().stringWidth("Settings")/2, 100);
		for(int i = 0; i < buttons.length; i++) {
			g.drawImage(buttonImages[i], buttons[i].x, buttons[i].y, buttons[i].width, buttons[i].height, null);
		}

		g.drawString("Score (Easy):   " + scores[0], Frame.WIDTH/2-g.getFontMetrics().stringWidth("Score (Easy):   ")/2, 145);
		g.drawString("Score (Med) :   " + scores[1], Frame.WIDTH/2-g.getFontMetrics().stringWidth("Score (Med):   ")/2, 195);
		g.drawString("Score (Hard):   " + scores[2], Frame.WIDTH/2-g.getFontMetrics().stringWidth("Score (Hard):   ")/2, 245);
		
		for(int i = 0; i < display.length; i++) {
			if(display[i] != null) {
				display[i].centerText(g);
			}
		}
		g.setColor(Color.white);
	}
	private void addText(String text) {
		for(int i = 0; i < display.length; i++) {
			if(display[i] == null) {
				display[i] = new FadingText(text);
				MouseHandler.MOUSEDOWN = false;
				break;
			}
		}
	}
}
