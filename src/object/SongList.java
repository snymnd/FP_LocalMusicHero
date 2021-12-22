package object;

public class SongList {
	
	private Integer[] timeBeat;
	public SongList(){
		init();
	}
	public Song[] song = new Song[5];
	
	public void init() {
		
		song[0] = new Song();
		song[0].setPath(".//soundEffect//dadali.wav");
		song[0].setTitle("Manuk Dadali");
        song[0].setSubTitle("Jawa Barat");
		timeBeat = new Integer[]{30, 55, 79, 102, 126, 150, 175, 199, 221, 246, 270, 294, 320, 342, 
            366, 390, 422, 421, 438, 445, 462, 467, 487, 493, 511, 516, 534, 540, 558, 564, 578};
		song[0].setTimeBeat(timeBeat);
		timeBeat = new Integer[]{8, 30, 36, 55, 60, 79, 104, 122, 128, 146, 151, 170, 176, 195, 
            200, 219, 224, 241, 251, 257, 263, 266, 269, 290, 314, 340, 362, 386, 410, 442, 441, 
            458, 465, 482, 487, 507, 513, 531, 516, 534, 540, 578, 584, 598};
		song[0].setTimeBeat1(timeBeat);
		timeBeat = new Integer[]{165 ,168 };
		song[0].setTimeBeat2(timeBeat);
		
		song[1] = new Song();
		song[1].setPath(".//soundEffect//song-1.wav");
		song[1].setTitle("Ampar-ampar Pisang");
		timeBeat = new Integer[]{1,3 ,6 ,9 ,12 ,15 ,18 ,21 ,24 ,27 ,30 ,33 ,36 ,39 ,42 ,45 ,48 ,51 ,54 ,57 ,60 ,63 ,66 ,69 ,72 ,75 ,78 ,81 ,84 ,87 ,90 ,93 ,96 ,99 ,102 ,105 ,108 ,111 ,114 ,117 ,120 ,123 ,126 ,129 ,132 ,135 ,138 ,141 ,144 ,147 ,150 ,153 ,156 ,159 ,162 ,165 ,168 };
		song[1].setTimeBeat(timeBeat);
		timeBeat = new Integer[]{1 ,159 ,162 ,165 ,168 };
		song[1].setTimeBeat1(timeBeat);
		timeBeat = new Integer[]{165 ,168 };
		song[1].setTimeBeat2(timeBeat);

        song[2] = new Song();
		song[2].setPath(".//soundEffect//dadali.wav");
		song[2].setTitle("Manuk Dadali");
		timeBeat = new Integer[]{1,3 ,6 ,9 ,12 ,15 ,18 ,21 ,24 ,27 ,30 ,33 ,36 ,39 ,42 ,45 ,48 ,51 ,54 ,57 ,60 ,63 ,66 ,69 ,72 ,75 ,78 ,81 ,84 ,87 ,90 ,93 ,96 ,99 ,102 ,105 ,108 ,111 ,114 ,117 ,120 ,123 ,126 ,129 ,132 ,135 ,138 ,141 ,144 ,147 ,150 ,153 ,156 ,159 ,162 ,165 ,168 };
		song[2].setTimeBeat(timeBeat);

		song[3] = new Song();
		song[3].setPath(".//soundEffect//dadali.wav");
		song[3].setTitle("Manuk Dadali");
		timeBeat = new Integer[]{1,3 ,6 ,9 ,12 ,15 ,18 ,21 ,24 ,27 ,30 ,33 ,36 ,39 ,42 ,45 ,48 ,51 ,54 ,57 ,60 ,63 ,66 ,69 ,72 ,75 ,78 ,81 ,84 ,87 ,90 ,93 ,96 ,99 ,102 ,105 ,108 ,111 ,114 ,117 ,120 ,123 ,126 ,129 ,132 ,135 ,138 ,141 ,144 ,147 ,150 ,153 ,156 ,159 ,162 ,165 ,168 };
		song[3].setTimeBeat(timeBeat);

		song[4] = new Song();
		song[4].setPath(".//soundEffect//dadali.wav");
		song[4].setTitle("Manuk Dadali");
		timeBeat = new Integer[]{1,3 ,6 ,9 ,12 ,15 ,18 ,21 ,24 ,27 ,30 ,33 ,36 ,39 ,42 ,45 ,48 ,51 ,54 ,57 ,60 ,63 ,66 ,69 ,72 ,75 ,78 ,81 ,84 ,87 ,90 ,93 ,96 ,99 ,102 ,105 ,108 ,111 ,114 ,117 ,120 ,123 ,126 ,129 ,132 ,135 ,138 ,141 ,144 ,147 ,150 ,153 ,156 ,159 ,162 ,165 ,168 };
		song[4].setTimeBeat(timeBeat);		
	}
	
}
