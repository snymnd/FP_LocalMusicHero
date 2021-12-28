package main;

import javax.swing.JFrame;
public class Frame {

   private static JFrame frame;

   public static int WIDTH = 1080;
   public static int HEIGHT = 720;

   public static void main(String[] args) {
      frame = new JFrame("Lokal Music Hero");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new Controller()); //run controller
      frame.pack();
      frame.setSize(WIDTH, HEIGHT);
      frame.setResizable(false);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }
}