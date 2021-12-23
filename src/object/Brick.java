package object;

import java.awt.Image;
import java.awt.Rectangle;

import main.Frame;
import main.ImageLoader;

public class Brick{
	private Image brickImage;
	public boolean isDead; 
	public int line;
	private int x; 
	private int y = -100;
	private int ySpeed = 5;
	private int poin = 2;
	
	private int height = 30;
	private int width = 60;

	public Rectangle bounds;
	
	public Brick(int line) {
		this.line = line;
		findGoal(); 
		bounds = new Rectangle(x, y, width, height); 
		setImage();
	}
	
	public void update() {
		if(!isDead) {	
			if(y < Frame.HEIGHT + height) { 
                y += ySpeed;
			}else {
				isDead = true;
			}
			//update brick position
			bounds.setBounds(x, y, width, height);
		}
	}
	
	public void findGoal() {
		if(line == 0) {
			x = 388;
		}
		if(line == 1) {
			x = 448;
		}
		if(line == 2) {
			x = 508;
		}
		if(line == 3) {
			x = 568;
		}
		if(line == 4) {
			x = 628;
		}
	}
	
	//setter
    public void setSpeed(int speed) {
        this.ySpeed = speed;
    }

	public void setImage() {
		this.brickImage = new ImageLoader(ImageLoader.bricks).getSubImage(line);
	}
	
	public void setPoin(int poin) {
		this.poin = poin;
	}
	
	//getter
	public int getPoin() {
		return this.poin;
	}
	
	public Image getImage() {
		return brickImage;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public int getWidth() {
		return (int) width;
	}
	public int getHeight() {
		return (int) height;
	}


}
