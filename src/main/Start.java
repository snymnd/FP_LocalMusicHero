package main;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import handlers.MouseHandler;
import object.SoundEffect;

public class Start {
	private Rectangle logoBounds = new Rectangle(Frame.WIDTH/2-351, -351, 702, 351);
	private Image logo = new ImageLoader(ImageLoader.logo).getImage();
	
	
	private Rectangle[] optionsBounds = { 
										new Rectangle(Frame.WIDTH/2-170, 400, 148, 120), 
										new Rectangle(Frame.WIDTH/2+30, 400, 148, 120)
										}; 
	private Image[] optionImages = {
			new ImageLoader(ImageLoader.PlayButton).getImage(), 
			new ImageLoader(ImageLoader.SettingsButton).getImage()
		};
	
	private SoundEffect sfx = new SoundEffect();
	private boolean pushMenu=false;
	private boolean drop=true;
	
	public Start() {

	}
	
	public void update() {
		dropLogo();
		if(MouseHandler.MOUSEDOWN) {
			if(optionsBounds[0].contains(Controller.mousePoint)) {
				sfx.button1.play();
				pushMenu = true;
				if(pushMenu) {
					pushMenu();
				}
			}
			if(optionsBounds[1].contains(Controller.mousePoint)) {
				sfx.button1.play();
				Controller.switchStates(STATE.SETTINGS);	
			}
		}
		if(pushMenu) {
			pushMenu();
		}
	}
	public void render(Graphics g) {
		g.drawImage(logo, logoBounds.x, logoBounds.y, logoBounds.width, logoBounds.height, null);
		if(!drop) {//wait for drop animation
			for(int i = 0; i < optionsBounds.length; i++) {
				g.drawImage(optionImages[i], optionsBounds[i].x, optionsBounds[i].y, optionsBounds[i].width, optionsBounds[i].height, null);
			}
		}
		
	}
	
	public void pushMenu() {
		for(int i = 0; i < optionsBounds.length; i++) {
			if(optionsBounds[i].y < Frame.HEIGHT) {
				optionsBounds[i].y += 20;
			}else {
				Menu.mapMenu = true; 
			}
		}
	}
	public void dropLogo() {
		if(logoBounds.y < Frame.HEIGHT/2 - 300) {
			logoBounds.y += 10;
		}else {
			drop = false;
		}
	}
	
}
