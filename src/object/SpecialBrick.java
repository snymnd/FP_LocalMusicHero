package object;

import java.awt.Image;

import main.ImageLoader;

public class SpecialBrick extends Brick{
	
	private ImageLoader specialBrickImage = new ImageLoader(ImageLoader.specialBrick);

	public SpecialBrick(int line) {
		super(line);
		setPoin(10);
        setSpeed(8);
	}
	
	@Override
	public Image getImage() {
		return specialBrickImage.getImage();
	}
	
}
