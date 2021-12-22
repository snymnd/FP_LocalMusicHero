package main;

import java.awt.Graphics;
import java.awt.Image;

import handlers.MouseHandler;
import object.SongList;

public class Menu {
	private Image backgroundImage = new ImageLoader(ImageLoader.menuBG).getImage();

	public static SongList songList = new SongList();
	
	private static Map map;
	private static Start start;
	private static Difficulty difficulty;
	
	public static int chosenSongIdx;
	public static SoundPlayer playSong = new SoundPlayer();
	
	public static boolean mapMenu;
	public static boolean difficultyMenu;

	public Menu() {
		init();
		map = new Map();
		start = new Start();
		difficulty = new Difficulty();
	}
	
	public void init() {
		//condition toggle
		mapMenu = false;
		difficultyMenu = false;
	}
	
	
	public void tick() {
		if(!mapMenu) {
			start.tick();
		}else {
			if(MouseHandler.MOUSEDOWN) {
				if(!difficultyMenu) {
					 map.tick();
				}else {
					difficulty.tick();
				}	
			}
		}
	}
	
	public void render(Graphics g) {
		g.drawImage(backgroundImage, 0, 0, Frame.WIDTH, Frame.HEIGHT, null);
		if(!mapMenu) {
			start.render(g);
		}else { 
			if(!difficultyMenu) {
				map.render(g);
			}else {
				difficulty.render(g);
			}
		}
	}
	
}
