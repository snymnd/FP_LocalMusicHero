package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;

import handlers.KeyHandler;
import handlers.MouseHandler;
import object.Brick;
import object.FadingText;
import object.SoundEffect;
import object.SpecialBrick;
import object.User;

public class Game extends JPanel{
	private static final long serialVersionUID = 1L;
	
	private Image backArrow = new ImageLoader(ImageLoader.backArrow).getImage();
	
	//Brick intersection indicators
	private Rectangle[] bounds = {new Rectangle(388, Frame.HEIGHT-115, 300, 10), //top bound
								  new Rectangle(388, Frame.HEIGHT-85, 300, 10)}; //bottom bound
	
	private Rectangle backButton = new Rectangle(10,10, 30, 30);
	
	private Image background;

	private KeyHandler key;
	private Queue<Brick> brickQueue; 
	private FadingText[] sideText;
	
	private int score = 0;
	public static int time = 61;
	public static int beatClock = 0;
	private int combo = 0;
	
	private int difficulty;
	
	private Timer timer;
	private SoundEffect sfx = new SoundEffect();
	
	private boolean gameOver = false;
	private boolean setHighScore = false;
	private boolean newHighScore = false;
	
	Random random = new Random();
	Integer[] beat;
	

	
	public Game(int difficulty) { 
		this.difficulty = difficulty;
		init();
		
		switch(difficulty) {
		case 0:
			beat = Menu.songList.song[Menu.chosenSongIdx].getTimeBeat();
			break;
		case 1:
			beat = Menu.songList.song[Menu.chosenSongIdx].getTimeBeat1();
			break;
		case 2:
			beat = Menu.songList.song[Menu.chosenSongIdx].getTimeBeat2();
			break;
		default:
			break;
		}

		timer = new Timer(); //javaUtil
		
		//game timer
		timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                time--; 
            }     
        }, 0, 1000);
		
		//beatClock timer (1/10 time)
		timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                beatClock++; 
                createBricks();
            }     
        }, 0, 100);
		
	}
	public void init() {
		brickQueue = new LinkedList<Brick>();
		sideText = new FadingText[20];
		this.key = Controller.key; 
		background = new ImageLoader(ImageLoader.gameBG).getImage();
	}
	

	public void update() { 
		if (MouseHandler.MOUSEDOWN) { //MouseHandler.java
			if (backButton.contains(Controller.mousePoint)) {
				Controller.switchStates(STATE.MENU);
				Menu.playSong.stop();
				gameOver=true;
				sfx.button2.play();
			}
		}
		
		
		if(!gameOver) {
			
			if (!brickQueue.isEmpty()) {
				for (Brick brick : brickQueue) { 
					brick.update();
					//"is dead" mean miss condition when is over late
					if (brick.isDead) { 
						brickQueue.remove();
						addSidetext(0,0);
						combo = 0;
						if(score >= 2) {
							score -= 2;
						}
						break;
					}
				}
			}
			for(int i = 0; i < sideText.length; i++) {
				if(sideText[i] != null) {
					sideText[i].update();
					if(sideText[i].isDead) {
						//clear the index
						sideText[i] = null;
					}
				}
			}
			
			gameScoring();
			
			if(time <= 0) {
				gameOver = true;
			}
		}else {
			timer.cancel();
			time = 61;
			beatClock = 0;
			if(!setHighScore) {
				if(User.getScore()[difficulty] < score) {
					User.setNewScore(difficulty, score);
					newHighScore = true;
				}
				setHighScore = true;
			}
		}
	}
	
	public void render(Graphics g) {
		g.drawImage(background, 0, 0, Frame.WIDTH, Frame.HEIGHT, null);
		g.drawImage(backArrow, backButton.x, backButton.y, backButton.width, backButton.height, null);
		
		if(!gameOver) {
			g.setFont(Controller.smallFont);
			for(int i = 0; i < sideText.length; i++) {
				if(sideText[i] != null) {
					sideText[i].render(g);
				}
			}
			//score
			g.setColor(Color.WHITE);
			g.drawString("Score : " + score, 900, 20);
			g.drawString("Time  : " + time, 900, 40);
			g.drawString("Combo : " + combo, 900, 60);
			
			g.setFont(Controller.bigFont);
			for(int i = 0; i < bounds.length; i++) {
				g.setColor(new Color(75*(i+1), 75*(i+1), 75*(i+1)));
				g.fillRect(bounds[i].x, bounds[i].y, bounds[i].width, bounds[i].height);
				g.setColor(Color.WHITE);
				g.drawRect(bounds[i].x, bounds[i].y, bounds[i].width, bounds[i].height);
			}
			
			//Lines
			g.drawLine(388, 0, 388, Frame.HEIGHT); //left vertical line
			g.drawLine(388, Frame.HEIGHT-190, 688, Frame.HEIGHT-190); //horizontal line
			
			////Color line indicators
			int r1 = 0, g1 = 0, b1 = 0;
			for(int i = 0; i < 5; i++) {
				if(key.hasReleased == User.bindcodes[i]) {
					if(i == 0) {
						g1 = 0; //green
					}else if(i == 1) {
						r1 = 255; //red
					}else if(i == 2) {
						g1 = 255;//yellow
						r1 = 255;
					}else if(i == 3) {
						b1 = 255; //blue
					}else {
						g1 = 120; //orange
						r1 = 255;
					}
					
					g.setColor(new Color(r1, g1, b1, 90));
					g.fillRect(388+(i*60), Frame.HEIGHT - 190, 60, 190);
				}
				g.setColor(Color.white);
				g.drawLine(448+(i*60), 0, 448+(i*60), Frame.HEIGHT); //last 5 vertical line
				
				g.drawString("" + User.binds[i], 413+(i*60), Frame.HEIGHT-87);
			}
			
			//Color box
			int r2 = 0, g2 = 0, b2 = 0;
			for(int i = 0; i < 5; i++) {
					if(i == 0) {
						g2 = 255;
					}else if(i == 1) {
						r2 = 255;
					}else if(i == 2) {
						g2 = 255;
						r2 = 255;
					}else if(i == 3) {
						b2 = 255;
					}else {
						g2 = 120;
						r2 = 255;
					}
					g.setColor(new Color(r2, g2, b2, 150));
					g.fillRect(388+(i*60), Frame.HEIGHT-105, 60, 25);
					g2 = 0;
					r2 = 0;
					b2 = 0;
			}

			g.setColor(Color.white);
			for(Brick brick: brickQueue) {
				g.drawImage(brick.getImage(), (int) brick.getX(), (int) brick.getY(), brick.getWidth(), brick.getHeight(), null);
			}
			
		}else { 
			g.setColor(Color.white);
            g.setFont(Controller.bigFont);
			g.drawString("Game Over!", Frame.WIDTH/2-g.getFontMetrics().stringWidth("Game Over!")/2, 100);
			g.drawString("Score: " + score, Frame.WIDTH/2-g.getFontMetrics().stringWidth("Score: " + score)/2, 150);
			if(newHighScore) {
				g.setColor(Color.RED);
				g.drawString("New High Score!!", Frame.WIDTH/2-g.getFontMetrics().stringWidth("New High Score!!")/2, 250);
				g.setColor(Color.WHITE);
				g.setFont(Controller.smallFont);
			}	
		} 
	}
	

	public void createBricks() {
		int rand = 0;
		if(difficulty == 0) {
			rand =  random.nextInt(3);
			if(Arrays.asList(beat).contains(beatClock) && (beatClock%4 !=0)) {
				brickQueue.add(new Brick(rand));
			}else if(Arrays.asList(beat).contains(beatClock) && (beatClock%4 ==0)){
				brickQueue.add(new SpecialBrick(rand));
			}

		}else if(difficulty == 1) {
			rand =  random.nextInt(4);
			if(Arrays.asList(beat).contains(beatClock) && (beatClock%4 !=0)) {
				brickQueue.add(new Brick(rand));
			}else if(Arrays.asList(beat).contains(beatClock) && (beatClock%4 ==0)){
				brickQueue.add(new SpecialBrick(rand));
			}
		
		}else {
			rand =  random.nextInt(5);
			if(Arrays.asList(beat).contains(beatClock) && (beatClock%4 !=0)) {
				brickQueue.add(new Brick(rand));
			}else if(Arrays.asList(beat).contains(beatClock) && (beatClock%4 ==0)){
				brickQueue.add(new SpecialBrick(rand));
			}
		}
	}
	
	
	public void gameScoring() {
		for(int i = 0; i < 5; i++) {
			if(key.currentPress == User.bindcodes[i]) { 
				if(!brickQueue.isEmpty()) {
					for(Brick brick: brickQueue) {
						if(brick.line == i) { 
							//miss (really early)
							if(brick.getY()-15 > Frame.HEIGHT-190 && brick.getY()+15 < bounds[0].y) {
								addSidetext(0, 0);
								combo = 0;
								if(score > 2) {
									score -= 2;
								}
							}
							else if(brickQueue.element().bounds.intersects(bounds[0]) && !brickQueue.element().bounds.intersects(bounds[1])) { //top
								//to-early
								score += brick.getPoin();
								combo++;
								addSidetext(1, brick.getPoin());	
	
							}else if(brickQueue.element().bounds.intersects(bounds[1]) && !brickQueue.element().bounds.intersects(bounds[0])) { //Bottom
								//to late
								score += brick.getPoin();
								combo++;
								addSidetext(2, brick.getPoin());
			
							}else if(brickQueue.element().bounds.intersects(bounds[1]) && brickQueue.element().bounds.intersects(bounds[0])) { //Bottom
								//PERFECT
								score += brick.getPoin()*5;
								combo++;
								addSidetext(3, brick.getPoin()*5);
							}

							if(brick.getY()-15 > Frame.HEIGHT-190) {
								brickQueue.remove(brick);
								key.currentPress = -1;
								break;
							}
						}
					}
				}
			}
		}
	}
	
	
	private void addSidetext(int kind, int poin) {
		for(int i = 0; i < sideText.length; i++) {
			if(sideText[i] == null) {
				if(combo > 4 && combo % 5 == 0) { 
					sideText[i] = new FadingText(kind, poin, combo);
				}else {
					//
					sideText[i] = new FadingText(kind, poin);
					score += combo/5;
				}
				break;
			}
		}
	}
}
