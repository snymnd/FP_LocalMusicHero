package main;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import object.SongList;
import object.SoundEffect;

public class Map {
	private Rectangle[] mapPoint = {new Rectangle(312, 428, 17, 17),
			new Rectangle(408, 437, 17, 17),
			new Rectangle(161, 329, 17, 17),
			new Rectangle(295, 411, 17, 17),
			new Rectangle(999, 329, 17, 17)};
	private Image pin = new ImageLoader(ImageLoader.pin).getImage();

	public static SongList songList = new SongList();
	private SoundEffect sfx = new SoundEffect();
	
	public Map() {
		
	}
	public void tick() {
		for (int i = 0; i < mapPoint.length; i++) {
		 	if(mapPoint[i].contains(Controller.mousePoint)) {
		 		sfx.button1.play();
		 		Menu.chosenSongIdx = i;
				Menu.playSong.SetFile(songList.song[i].getPath());
		 		Menu.difficultyMenu = true;
		 	}
		 }
	}
	
	public void render(Graphics g) {
		for(int i = 0; i < mapPoint.length; i++) {
			g.drawImage(pin, mapPoint[i].x, mapPoint[i].y, mapPoint[i].width, mapPoint[i].height, null);
		}
	}
	
}
