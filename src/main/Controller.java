package main;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

import java.awt.image.BufferedImage;

import javax.swing.JPanel;

import files.Files;
import handlers.KeyHandler;
import handlers.MouseHandler;
import object.User;

public class Controller extends JPanel implements Runnable {

   private static final long serialVersionUID = 1L;
   
   private Thread thread;
   private Graphics2D g;
   private BufferedImage image;

   //default state on Menu
   private static STATE state = STATE.MENU;

   private static Game game;
   private static Menu menu;
   private static Settings settings;

   public static Point mousePoint = new Point(0, 0);
   public static KeyHandler key;

   public static int score = 0;
   public static int difficulty = 0;

   //font
   public static Font smallFont = new Font("SansSerif", Font.PLAIN, 18);
   public static Font bigFont = new Font("SansSerif", Font.PLAIN, 22);

   public Controller() {
      super();
      setPreferredSize(new Dimension(Frame.WIDTH, Frame.HEIGHT));
      setFocusable(true);
      requestFocus(true);
   }

   public void addNotify() {
      super.addNotify();
      if (thread == null) {
         thread = new Thread(this);
         thread.start();
      }
   }

   @Override
   //smoother FPS gameloop
   public void run() {
      init();
      //https://gamedev.stackexchange.com/questions/160329/java-game-loop-efficiency (method 2)
      long lastTime = System.nanoTime();
      double amountOfTicks = 60.0;
      double fps = 1000000000 / amountOfTicks;
      double delta = 0;
      long timer = System.currentTimeMillis();

      while (true) {
         long now = System.nanoTime();
         delta += (now - lastTime) / fps;
         lastTime = now;
         while (delta >= 1) {
            display();
            delta--;
         }
         if (System.currentTimeMillis() - timer > 1000) {
            timer += 1000;
         }
      }
   }

   //	//alternative
   //	public void run() {
   //		init();
   //		
   //	    while (running) {
   //	        display();
   //	        
   //	        try {
   //				Thread.sleep(1000/120);
   //			} catch (InterruptedException e) {
   //				// TODO Auto-generated catch block
   //				e.printStackTrace();
   //			}
   //	    }
   //	}

   private void init() {
      image = new BufferedImage(Frame.WIDTH, Frame.HEIGHT, BufferedImage.TYPE_INT_RGB);

      g = (Graphics2D) image.getGraphics();
      key = new KeyHandler();
      this.addKeyListener(key);
      this.getKeyListeners();
      this.addMouseListener(new MouseHandler());
      this.addMouseMotionListener(new MouseHandler());
      menu = new Menu();
      Files.init();
      settings = new Settings();
      User user = new User();
   }

   private void display() {
      g.setFont(smallFont);
      switch (state) {
      case MENU:
         menu.update();
         menu.render(g);
         break;

      case GAME:
         game.update();
         game.render(g);
         break;

      case SETTINGS:
         settings.update();
         settings.render(g);
         break;

      default:
         break;
      }
      Graphics g2 = getGraphics();
      g2.drawImage(image, 0, 0, null);
      g2.dispose();
   }

   public static void switchStates(STATE state) {
      Controller.state = state;
      if (state == STATE.GAME) {
         game = new Game(difficulty);
      }
      if (state == STATE.MENU) {
         menu = new Menu();
      }
   }

}