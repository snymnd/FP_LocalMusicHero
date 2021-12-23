package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import object.SoundEffect;

public class Difficulty {
	private Rectangle[] difficultyBounds = { 
			new Rectangle(Frame.WIDTH/2-90, 200, 175, 90),
			new Rectangle(Frame.WIDTH/2-90, 300, 175, 90),
			new Rectangle(Frame.WIDTH/2-90, 400, 175, 90)}; 
	private Image[] difficultyImages = {
			new ImageLoader(ImageLoader.easyButton).getImage(), 
			new ImageLoader(ImageLoader.mediumButton).getImage(),
			new ImageLoader(ImageLoader.hardButton).getImage()  
			};
	private SoundEffect sfx = new SoundEffect();
	private Rectangle songTitle =  new Rectangle(Frame.WIDTH/2-200, 100, 175, 90);
    private Rectangle songSubTitle =  new Rectangle(Frame.WIDTH/2-200, 150, 175, 90);
	
	public Difficulty() {

	}
	
	public void update() {
		for (int i = 0; i < difficultyBounds.length; i++) {
			if(difficultyBounds[i].contains(Controller.mousePoint)) {
				sfx.button2.play();
				Controller.difficulty = i;
				Controller.switchStates(STATE.GAME);
				Menu.playSong.play();
			}
		}
	}
	public void render(Graphics g) {
		g.setColor(Color.WHITE);
		g.setFont(new Font("SansSerif", Font.BOLD, 50)); 
		g.drawString(Menu.songList.song[Menu.chosenSongIdx].getTitle(), Frame.WIDTH/2-g.getFontMetrics().stringWidth(Menu.songList.song[Menu.chosenSongIdx].getTitle())/2, songTitle.y);
        g.drawString(Menu.songList.song[Menu.chosenSongIdx].getSubTitle(), Frame.WIDTH/2-g.getFontMetrics().stringWidth(Menu.songList.song[Menu.chosenSongIdx].getSubTitle())/2, songSubTitle.y);
		for(int i = 0; i < difficultyImages.length; i++) {
			g.drawImage(difficultyImages[i], difficultyBounds[i].x, difficultyBounds[i].y, difficultyBounds[i].width, difficultyBounds[i].height, null);
		}
	}

}
