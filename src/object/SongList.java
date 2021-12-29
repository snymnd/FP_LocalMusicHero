package object;

public class SongList {
	
	private Integer[] timeBeat;
	public SongList(){
		init();
	}

	public Song[] song = new Song[5];
	
	public void init() {
        //Manuk Dadali - Jawa Barat
		song[0] = new Song();
		song[0].setPath(".//soundEffect//dadali.wav");
		song[0].setTitle("Manuk Dadali");
        song[0].setSubTitle("Jawa Barat");
		timeBeat = new Integer[] {24, 42, 60, 72, 
                                90, 108, 120, 138, 144,  
                                162, 204, 210,  
                                222, 234, 258, 
                                261, 270, 276, 279, 291, 
                                303, 324,  
                                336, 348, 357, 360, 
                                366, 378, 387, 390, 397, 
                                408, 417, 432,  
                                465, 477, 
                                501, 504, 513, 516, 519, 
                                531, 543, 552, 564, 
                                576};
		song[0].setTimeBeat(timeBeat);
		timeBeat = new Integer[] {24, 42, 48, 60, 72, 
                                90, 96, 120, 138, 144,  
                                162, 168, 180, 192, 204, 210,  
                                222, 225, 234, 240, 246,  252, 258, 
                                261, 270, 279, 282, 285, 291, 
                                300, 303, 312, 318, 324, 327, 
                                330, 342, 348, 354, 357, 360, 
                                366, 378, 381, 387, 390, 392, 397, 
                                408, 417, 423, 432,  
                                441, 447, 453, 456, 465, 477, 483, 
                                501, 513, 516, 519, 525, 
                                531, 537, 543, 549, 552, 558, 564, 
                                576};
		song[0].setTimeBeat1(timeBeat);
		timeBeat = new Integer[] {-2, 24, 27, 30, 42, 48, 54, 60, 72, 78, 
                                90, 96, 102, 108, 120, 126, 138, 144, 150, 
                                162, 168, 174, 180, 192, 198, 204, 210, 216, 
                                222, 225, 231, 234, 240, 246, 249, 252, 258, 
                                261, 264, 267, 270, 276, 279, 282, 285, 291, 
                                294, 297, 300, 303, 309, 312, 318, 324, 327, 
                                330, 333, 336, 342, 345, 348, 354, 357, 360, 
                                366, 369, 372, 378, 381, 387, 390, 392, 397, 
                                399, 405, 408, 414, 417, 423, 429, 432, 438, 
                                441, 447, 453, 456, 462, 465, 471, 477, 483, 
                                486, 492, 501, 504, 510, 513, 516, 519, 525, 
                                531, 534, 537, 543, 549, 552, 558, 564, 567, 
                                576, 579, 581};
		song[0].setTimeBeat2(timeBeat);

		timeBeat = new Integer[] {24, 59, 83, 123, 141, 
                                203, 237,  
                                297, 324, 348, 384, 393, 
                                453, 477, 489, 498,  
                                537, 564, 589, 591};
		song[0].setTimeSpecialBeat(timeBeat);
		timeBeat = new Integer[] {24, 45, 83, 93, 131, 141, 
                                155, 195, 227, 264, 
                                315, 324, 348, 360, 372, 393, 
                                411, 429, 453, 468, 477, 498, 504, 
                                516, 549, 564,582, 589, 591};
		song[0].setTimeSpecialBeat1(timeBeat);
		timeBeat = new Integer[] {24, 45, 59, 75, 83, 93, 107, 123, 131, 141, 
                                155, 165, 179, 195, 203, 227, 237, 246, 252, 264, 
                                282, 297, 315, 324, 330, 348, 360, 372, 384, 393, 
                                404, 411, 429, 444, 453, 468, 477, 489, 498, 504, 
                                516, 537, 549, 564, 570, 582, 589, 591};
		song[0].setTimeSpecialBeat2(timeBeat);

		
        //Manuk Dadali - Jawa Barat
		song[1] = new Song();
		song[1].setPath(".//soundEffect//dadali.wav");
		song[1].setTitle("Ampar-ampar Pisang");
		song[1].setSubTitle("Jawa Barat");
		timeBeat = new Integer[]{1,3 ,6 ,9 ,12 ,15 ,18 ,21 ,24 ,27 ,30 ,33 ,36 ,39 ,42 ,45 ,48 ,51 ,54 ,57 ,60 ,63 ,66 ,69 ,72 ,75 ,78 ,81 ,84 ,87 ,90 ,93 ,96 ,99 ,102 ,105 ,108 ,111 ,114 ,117 ,120 ,123 ,126 ,129 ,132 ,135 ,138 ,141 ,144 ,147 ,150 ,153 ,156 ,159 ,162 ,165 ,168 };
		song[1].setTimeBeat(timeBeat);
		timeBeat = new Integer[]{1 ,159 ,162 ,165 ,168 };
		song[1].setTimeBeat1(timeBeat);
		timeBeat = new Integer[]{165 ,168 };
		song[1].setTimeBeat2(timeBeat);
		timeBeat = new Integer[]{441, 458, 465, 482, 487, 507, 513, 531, 536, 554, 560, 578, 584, 598};
		song[1].setTimeSpecialBeat(timeBeat);
		timeBeat = new Integer[]{441, 458, 465, 482, 487, 507, 513, 531, 536, 554, 560, 578, 584, 598};
		song[1].setTimeSpecialBeat1(timeBeat);
		timeBeat = new Integer[]{441, 458, 465, 482, 487, 507, 513, 531, 536, 554, 560, 578, 584, 598};
		song[1].setTimeSpecialBeat2(timeBeat);

        //Manuk Dadali - Jawa Barat
        song[2] = new Song();
		song[2].setPath(".//soundEffect//dadali.wav");
		song[2].setTitle("Manuk Dadali");
		song[2].setSubTitle("Jawa Barat");
		timeBeat = new Integer[]{30, 55, 79, 102, 126, 150, 175, 199, 221, 246, 270, 294, 320, 342, 
            366, 390, 422, 421, 438, 445, 462, 467, 487, 493, 511, 516, 534, 540, 558, 564, 578};
		song[2].setTimeBeat(timeBeat);
		timeBeat = new Integer[]{8, 30, 36, 55, 60, 79, 104, 122, 128, 146, 151, 170, 176, 195, 
            200, 219, 224, 241, 251, 257, 263, 266, 269, 290, 314, 340, 362, 386, 410, 442, 441, 
            458, 465, 482, 487, 507, 513, 531, 516, 534, 540, 578, 584, 598};
		song[2].setTimeBeat1(timeBeat);
		timeBeat = new Integer[]{28, 50, 56, 75, 80, 99, 104, 122, 128, 146, 151, 170, 176, 195, 200, 
            219, 224, 241, 251, 257, 263, 266, 269, 278, 290, 314, 324, 336, 340, 347, 356, 362, 374, 
            386, 399, 410, 422, 431, 442, 441, 458, 465, 482, 487, 507, 513, 531, 536, 554, 560, 578, 584, 598};
		song[2].setTimeBeat2(timeBeat);

		timeBeat = new Integer[]{441, 458, 465, 482, 487, 507, 513, 531, 536, 554, 560, 578, 584, 598};
		song[2].setTimeSpecialBeat(timeBeat);
		timeBeat = new Integer[]{441, 458, 465, 482, 487, 507, 513, 531, 536, 554, 560, 578, 584, 598};
		song[2].setTimeSpecialBeat1(timeBeat);
		timeBeat = new Integer[]{441, 458, 465, 482, 487, 507, 513, 531, 536, 554, 560, 578, 584, 598};
		song[2].setTimeSpecialBeat2(timeBeat);

        //Manuk Dadali - Jawa Barat
		song[3] = new Song();
		song[3].setPath(".//soundEffect//dadali.wav");
		song[3].setTitle("Manuk Dadali");
		song[3].setSubTitle("Jawa Barat");
		timeBeat = new Integer[]{30, 55, 79, 102, 126, 150, 175, 199, 221, 246, 270, 294, 320, 342, 
            366, 390, 422, 421, 438, 445, 462, 467, 487, 493, 511, 516, 534, 540, 558, 564, 578};
		song[3].setTimeBeat(timeBeat);
		timeBeat = new Integer[]{8, 30, 36, 55, 60, 79, 104, 122, 128, 146, 151, 170, 176, 195, 
            200, 219, 224, 241, 251, 257, 263, 266, 269, 290, 314, 340, 362, 386, 410, 442, 441, 
            458, 465, 482, 487, 507, 513, 531, 516, 534, 540, 578, 584, 598};
		song[3].setTimeBeat1(timeBeat);
		timeBeat = new Integer[]{28, 50, 56, 75, 80, 99, 104, 122, 128, 146, 151, 170, 176, 195, 200, 
            219, 224, 241, 251, 257, 263, 266, 269, 278, 290, 314, 324, 336, 340, 347, 356, 362, 374, 
            386, 399, 410, 422, 431, 442, 441, 458, 465, 482, 487, 507, 513, 531, 536, 554, 560, 578, 584, 598};
		song[3].setTimeBeat2(timeBeat);
		
		timeBeat = new Integer[]{441, 458, 465, 482, 487, 507, 513, 531, 536, 554, 560, 578, 584, 598};
		song[3].setTimeSpecialBeat(timeBeat);
		timeBeat = new Integer[]{441, 458, 465, 482, 487, 507, 513, 531, 536, 554, 560, 578, 584, 598};
		song[3].setTimeSpecialBeat1(timeBeat);
		timeBeat = new Integer[]{441, 458, 465, 482, 487, 507, 513, 531, 536, 554, 560, 578, 584, 598};
		song[3].setTimeSpecialBeat2(timeBeat);

        //Manuk Dadali - Jawa Barat
		song[4] = new Song();
		song[4].setPath(".//soundEffect//dadali.wav");
		song[4].setTitle("Manuk Dadali");
		song[4].setSubTitle("Jawa Barat");
		timeBeat = new Integer[]{30, 55, 79, 102, 126, 150, 175, 199, 221, 246, 270, 294, 320, 342, 
            366, 390, 422, 421, 438, 445, 462, 467, 487, 493, 511, 516, 534, 540, 558, 564, 578};
		song[4].setTimeBeat(timeBeat);
		timeBeat = new Integer[]{8, 30, 36, 55, 60, 79, 104, 122, 128, 146, 151, 170, 176, 195, 
            200, 219, 224, 241, 251, 257, 263, 266, 269, 290, 314, 340, 362, 386, 410, 442, 441, 
            458, 465, 482, 487, 507, 513, 531, 516, 534, 540, 578, 584, 598};
		song[4].setTimeBeat1(timeBeat);
		timeBeat = new Integer[]{28, 50, 56, 75, 80, 99, 104, 122, 128, 146, 151, 170, 176, 195, 200, 
            219, 224, 241, 251, 257, 263, 266, 269, 278, 290, 314, 324, 336, 340, 347, 356, 362, 374, 
            386, 399, 410, 422, 431, 442, 441, 458, 465, 482, 487, 507, 513, 531, 536, 554, 560, 578, 584, 598};
		song[4].setTimeBeat2(timeBeat);

		timeBeat = new Integer[]{441, 458, 465, 482, 487, 507, 513, 531, 536, 554, 560, 578, 584, 598};
		song[4].setTimeSpecialBeat(timeBeat);
		timeBeat = new Integer[]{441, 458, 465, 482, 487, 507, 513, 531, 536, 554, 560, 578, 584, 598};
		song[4].setTimeSpecialBeat1(timeBeat);
		timeBeat = new Integer[]{441, 458, 465, 482, 487, 507, 513, 531, 536, 554, 560, 578, 584, 598};
		song[4].setTimeSpecialBeat2(timeBeat);		
	}
	
}
