package main;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import object.SongList;
import object.SoundEffect;

public class Map {
   private Rectangle[] mapPoint = {
      new Rectangle(312, 428, 17, 17),
      new Rectangle(66, 178, 17, 17),
      new Rectangle(109, 214, 17, 17),
      new Rectangle(187, 268, 17, 17),
      new Rectangle(179, 340, 17, 17),

      new Rectangle(244, 381, 17, 17),
      new Rectangle(295, 411, 17, 17),
      new Rectangle(364, 451, 17, 17),
      new Rectangle(408, 437, 17, 17),
      new Rectangle(391, 276, 17, 17),

      new Rectangle(459, 326, 17, 17),
      new Rectangle(492, 254, 17, 17),
      new Rectangle(468, 456, 17, 17),
      new Rectangle(513, 464, 17, 17),
      new Rectangle(662, 487, 17, 17),
      
      new Rectangle(557, 337, 17, 17),
      new Rectangle(611, 343, 17, 17),
      new Rectangle(676, 245, 17, 17),
      new Rectangle(744, 271, 17, 17),
      new Rectangle(789, 340, 17, 17),
      
      new Rectangle(853, 326, 17, 17),
      new Rectangle(999, 325, 17, 17)
   };
   private Image pin = new ImageLoader(ImageLoader.pin).getImage();

   public static SongList songList = new SongList();
   private SoundEffect sfx = new SoundEffect();

   public Map() {

   }
   public void update() {
      for (int i = 0; i < mapPoint.length; i++) {
         if (mapPoint[i].contains(Controller.mousePoint)) {
            sfx.button1.play();
            Menu.chosenSongIdx = i;
            Menu.playSong.SetFile(songList.song[i].getPath());
            Menu.difficultyMenu = true;
         }
      }
   }

   public void render(Graphics g) {
      for (int i = 0; i < mapPoint.length; i++) {
         g.drawImage(pin, mapPoint[i].x, mapPoint[i].y, mapPoint[i].width, mapPoint[i].height, null);
      }
   }

}