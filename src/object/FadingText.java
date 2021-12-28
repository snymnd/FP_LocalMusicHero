package object;

import java.awt.Color;
import java.awt.Graphics;

import main.Frame;

public class FadingText {

	private int kindScore;
	private int y = 300;
	private int x = 450;
	private int fadeAmount = 250; 
	private String text = "";
	public boolean isDead = false;
	private Color color;
	
	public FadingText(int kindScore, int poin) {
		this.kindScore = kindScore;
		this.x = 900;
		if(kindScore == 0) {
			text = "-2 Miss";
			color = new Color(255, 0, 0);
		}
        else if(kindScore == 1) { //Too Early
			text = "+ " + poin + " Too Early";
			color = new Color(255, 255, 0);
		}
        else if(kindScore == 2) { //Too Late
			text = "+ " + poin + " Too Late";
			color = new Color(255, 255, 0);
		}else if(kindScore == 3){ //Perfect
			text = "+"+poin+"-PERFECT";
			color = new Color(30,180, 70);
		}
	}
    
	public FadingText(int kindScore, int poin, int combo) {
		this.kindScore = kindScore;
		this.x = 900;
		color = new Color(255, 255, 255);
		text = combo + "x Combo!"; 
	}
	
	public FadingText(String text) {
		y = 500;
		this.text = text;
		color = new Color(255, 255, 255);
	}
	
	public void update() {
		y -= 2; 
		if(fadeAmount > 5) {
			fadeAmount -= 5; 
		}
        else {
			isDead = true;
		}
	}
	
	public void render(Graphics g) {
		if(!isDead) {
			g.setColor(new Color(color.getRed(), color.getGreen(), color.getBlue(), fadeAmount));
			g.drawString(text, x, y);
		}
	}
	
	public void centerText(Graphics g) {
		if(!isDead) {
			g.setColor(new Color(255, 255, 255, fadeAmount));
			g.drawString(text, Frame.WIDTH/2 - g.getFontMetrics().stringWidth(text)/2, y);
		}
	}
}
