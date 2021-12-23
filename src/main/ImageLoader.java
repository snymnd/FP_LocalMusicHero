package main;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageLoader {
	private BufferedImage img;
	public static String logo = "/Logo.png";
	public static String backArrow = "/Back.png";
	public static String bricks = "/Bricks.png";
	public static String PlayButton = "/Play.png";
	public static String SettingsButton = "/Setting.png";
	public static String SiteButton = "/About.png";
	public static String gameBG = "/Splash.png";
	public static String settingsBG = "/SettingsBG.png";
	public static String menuBG = "/Splash.png";
	public static String resetScore = "/ResetScore.png";
	public static String resetBinds = "/ResetBinds.png";
	public static String easyButton = "/Easy.png";
	public static String mediumButton = "/Medium.png";
	public static String hardButton = "/Hard.png";
    public static String pin = "/Current.png";
    public static String specialBrick = "/SpecialBrick.png";
	
	public ImageLoader(String path) {
		try {
			img = ImageIO.read(ImageLoader.class.getResourceAsStream(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public BufferedImage getImage() {
		return img; 
	}
	public BufferedImage getSubImage(int section) {
		return img.getSubimage(0, section*25, 50, 25);
	}
}