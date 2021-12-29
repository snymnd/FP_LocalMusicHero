package object;

public class SongList {
	
	private Integer[] timeBeat;
	public SongList(){
		init();
	}

	public Song[] song = new Song[22];
	
	public void init() {
        //Lagu 1 - Manuk Dadali - Jawa Barat
		song[0] = new Song();
		song[0].setPath(".//soundEffect//dadali_jabar.wav");
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

		
        //Lagu 2
		song[1] = new Song();
		song[1].setPath("#");
		song[1].setTitle("Bungong Jeumpah");
		song[1].setSubTitle("Aceh");
		timeBeat = new Integer[]{};
		song[1].setTimeBeat(timeBeat);
		timeBeat = new Integer[]{};
		song[1].setTimeBeat1(timeBeat);
		timeBeat = new Integer[]{};
		song[1].setTimeBeat2(timeBeat);

		timeBeat = new Integer[]{};
		song[1].setTimeSpecialBeat(timeBeat);
		timeBeat = new Integer[]{};
		song[1].setTimeSpecialBeat1(timeBeat);
		timeBeat = new Integer[]{};
		song[1].setTimeSpecialBeat2(timeBeat);

        //Lagu 3
		song[2] = new Song();
		song[2].setPath("#");
		song[2].setTitle("Butet");
		song[2].setSubTitle("Sumatra Utara");
		timeBeat = new Integer[]{};
		song[2].setTimeBeat(timeBeat);
		timeBeat = new Integer[]{};
		song[2].setTimeBeat1(timeBeat);
		timeBeat = new Integer[]{};
		song[2].setTimeBeat2(timeBeat);

		timeBeat = new Integer[]{};
		song[2].setTimeSpecialBeat(timeBeat);
		timeBeat = new Integer[]{};
		song[2].setTimeSpecialBeat1(timeBeat);
		timeBeat = new Integer[]{};
		song[2].setTimeSpecialBeat2(timeBeat);

        //Lagu 4
		song[3] = new Song();
		song[3].setPath("#");
		song[3].setTitle("Soleram");
		song[3].setSubTitle("Riau");
		timeBeat = new Integer[]{};
		song[3].setTimeBeat(timeBeat);
		timeBeat = new Integer[]{};
		song[3].setTimeBeat1(timeBeat);
		timeBeat = new Integer[]{};
		song[3].setTimeBeat2(timeBeat);

		timeBeat = new Integer[]{};
		song[3].setTimeSpecialBeat(timeBeat);
		timeBeat = new Integer[]{};
		song[3].setTimeSpecialBeat1(timeBeat);
		timeBeat = new Integer[]{};
		song[3].setTimeSpecialBeat2(timeBeat);

        //Lagu 5
		song[4] = new Song();
		song[4].setPath("#");
		song[4].setTitle("Lalan Belek");
		song[4].setSubTitle("Bengkulu");
		timeBeat = new Integer[]{};
		song[4].setTimeBeat(timeBeat);
		timeBeat = new Integer[]{};
		song[4].setTimeBeat1(timeBeat);
		timeBeat = new Integer[]{};
		song[4].setTimeBeat2(timeBeat);

		timeBeat = new Integer[]{};
		song[4].setTimeSpecialBeat(timeBeat);
		timeBeat = new Integer[]{};
		song[4].setTimeSpecialBeat1(timeBeat);
		timeBeat = new Integer[]{};
		song[4].setTimeSpecialBeat2(timeBeat);

        //Lagu 6
		song[5] = new Song();
		song[5].setPath("#");
		song[5].setTitle("Lipang-Lipang-Dang");
		song[5].setSubTitle("Lampung");
		timeBeat = new Integer[]{};
		song[5].setTimeBeat(timeBeat);
		timeBeat = new Integer[]{};
		song[5].setTimeBeat1(timeBeat);
		timeBeat = new Integer[]{};
		song[5].setTimeBeat2(timeBeat);

		timeBeat = new Integer[]{};
		song[5].setTimeSpecialBeat(timeBeat);
		timeBeat = new Integer[]{};
		song[5].setTimeSpecialBeat1(timeBeat);
		timeBeat = new Integer[]{};
		song[5].setTimeSpecialBeat2(timeBeat);

        //Lagu 7
		song[6] = new Song();
		song[6].setPath("#");
		song[6].setTitle("Keroncong Kemayoran");
		song[6].setSubTitle("Jakarta");
		timeBeat = new Integer[]{};
		song[6].setTimeBeat(timeBeat);
		timeBeat = new Integer[]{};
		song[6].setTimeBeat1(timeBeat);
		timeBeat = new Integer[]{};
		song[6].setTimeBeat2(timeBeat);

		timeBeat = new Integer[]{};
		song[6].setTimeSpecialBeat(timeBeat);
		timeBeat = new Integer[]{};
		song[6].setTimeSpecialBeat1(timeBeat);
		timeBeat = new Integer[]{};
		song[6].setTimeSpecialBeat2(timeBeat);

        //Lagu 8
		song[7] = new Song();
		song[7].setPath("#");
		song[7].setTitle("Gidang Talun");
		song[7].setSubTitle("Yogyakarta");
		timeBeat = new Integer[]{};
		song[7].setTimeBeat(timeBeat);
		timeBeat = new Integer[]{};
		song[7].setTimeBeat1(timeBeat);
		timeBeat = new Integer[]{};
		song[7].setTimeBeat2(timeBeat);

		timeBeat = new Integer[]{};
		song[7].setTimeSpecialBeat(timeBeat);
		timeBeat = new Integer[]{};
		song[7].setTimeSpecialBeat1(timeBeat);
		timeBeat = new Integer[]{};
		song[7].setTimeSpecialBeat2(timeBeat);

        //Lagu 9
		song[8] = new Song();
		song[8].setPath("#");
		song[8].setTitle("Rek Ayo Rek");
		song[8].setSubTitle("Jawa Timur");
		timeBeat = new Integer[]{};
		song[8].setTimeBeat(timeBeat);
		timeBeat = new Integer[]{};
		song[8].setTimeBeat1(timeBeat);
		timeBeat = new Integer[]{};
		song[8].setTimeBeat2(timeBeat);

		timeBeat = new Integer[]{};
		song[8].setTimeSpecialBeat(timeBeat);
		timeBeat = new Integer[]{};
		song[8].setTimeSpecialBeat1(timeBeat);
		timeBeat = new Integer[]{};
		song[8].setTimeSpecialBeat2(timeBeat);

        //Lagu 10
		song[9] = new Song();
		song[9].setPath("#");
		song[9].setTitle("Cik Cik Periuk");
		song[9].setSubTitle("Kalimantan Barat");
		timeBeat = new Integer[]{};
		song[9].setTimeBeat(timeBeat);
		timeBeat = new Integer[]{};
		song[9].setTimeBeat1(timeBeat);
		timeBeat = new Integer[]{};
		song[9].setTimeBeat2(timeBeat);

		timeBeat = new Integer[]{};
		song[9].setTimeSpecialBeat(timeBeat);
		timeBeat = new Integer[]{};
		song[9].setTimeSpecialBeat1(timeBeat);
		timeBeat = new Integer[]{};
		song[9].setTimeSpecialBeat2(timeBeat);

        //Lagu 11
		song[10] = new Song();
		song[10].setPath("#");
		song[10].setTitle("Ampar-Ampar Pisang");
		song[10].setSubTitle("Kalimantan Selatan");
		timeBeat = new Integer[]{};
		song[10].setTimeBeat(timeBeat);
		timeBeat = new Integer[]{};
		song[10].setTimeBeat1(timeBeat);
		timeBeat = new Integer[]{};
		song[10].setTimeBeat2(timeBeat);

		timeBeat = new Integer[]{};
		song[10].setTimeSpecialBeat(timeBeat);
		timeBeat = new Integer[]{};
		song[10].setTimeSpecialBeat1(timeBeat);
		timeBeat = new Integer[]{};
		song[10].setTimeSpecialBeat2(timeBeat);

        //Lagu 12
		song[11] = new Song();
		song[11].setPath("#");
		song[11].setTitle("Indung-Indung");
		song[11].setSubTitle("Kalimantan Timur");
		timeBeat = new Integer[]{};
		song[11].setTimeBeat(timeBeat);
		timeBeat = new Integer[]{};
		song[11].setTimeBeat1(timeBeat);
		timeBeat = new Integer[]{};
		song[11].setTimeBeat2(timeBeat);

		timeBeat = new Integer[]{};
		song[11].setTimeSpecialBeat(timeBeat);
		timeBeat = new Integer[]{};
		song[11].setTimeSpecialBeat1(timeBeat);
		timeBeat = new Integer[]{};
		song[11].setTimeSpecialBeat2(timeBeat);

        //Lagu 13
		song[12] = new Song();
		song[12].setPath("#");
		song[12].setTitle("Macepet Cepetan");
		song[12].setSubTitle("Bali");
		timeBeat = new Integer[]{};
		song[12].setTimeBeat(timeBeat);
		timeBeat = new Integer[]{};
		song[12].setTimeBeat1(timeBeat);
		timeBeat = new Integer[]{};
		song[12].setTimeBeat2(timeBeat);

		timeBeat = new Integer[]{};
		song[12].setTimeSpecialBeat(timeBeat);
		timeBeat = new Integer[]{};
		song[12].setTimeSpecialBeat1(timeBeat);
		timeBeat = new Integer[]{};
		song[12].setTimeSpecialBeat2(timeBeat);

        //Lagu 14
		song[13] = new Song();
		song[13].setPath("#");
		song[13].setTitle("Cempake");
		song[13].setSubTitle("NTB");
		timeBeat = new Integer[]{};
		song[13].setTimeBeat(timeBeat);
		timeBeat = new Integer[]{};
		song[13].setTimeBeat1(timeBeat);
		timeBeat = new Integer[]{};
		song[13].setTimeBeat2(timeBeat);

		timeBeat = new Integer[]{};
		song[13].setTimeSpecialBeat(timeBeat);
		timeBeat = new Integer[]{};
		song[13].setTimeSpecialBeat1(timeBeat);
		timeBeat = new Integer[]{};
		song[13].setTimeSpecialBeat2(timeBeat);

        //Lagu 15
		song[14] = new Song();
		song[14].setPath("#");
		song[14].setTitle("Anak Kambing Saya");
		song[14].setSubTitle("NTT");
		timeBeat = new Integer[]{};
		song[14].setTimeBeat(timeBeat);
		timeBeat = new Integer[]{};
		song[14].setTimeBeat1(timeBeat);
		timeBeat = new Integer[]{};
		song[14].setTimeBeat2(timeBeat);

		timeBeat = new Integer[]{};
		song[14].setTimeSpecialBeat(timeBeat);
		timeBeat = new Integer[]{};
		song[14].setTimeSpecialBeat1(timeBeat);
		timeBeat = new Integer[]{};
		song[14].setTimeSpecialBeat2(timeBeat);

        //Lagu 16
		song[15] = new Song();
		song[15].setPath("#");
		song[15].setTitle("Bulu Londong");
		song[15].setSubTitle("Sulawesi Barat");
		timeBeat = new Integer[]{};
		song[15].setTimeBeat(timeBeat);
		timeBeat = new Integer[]{};
		song[15].setTimeBeat1(timeBeat);
		timeBeat = new Integer[]{};
		song[15].setTimeBeat2(timeBeat);

		timeBeat = new Integer[]{};
		song[15].setTimeSpecialBeat(timeBeat);
		timeBeat = new Integer[]{};
		song[15].setTimeSpecialBeat1(timeBeat);
		timeBeat = new Integer[]{};
		song[15].setTimeSpecialBeat2(timeBeat);

        //Lagu 17
		song[16] = new Song();
		song[16].setPath("#");
		song[16].setTitle("Wangku Worio");
		song[16].setSubTitle("Sulawesi Tenggara");
		timeBeat = new Integer[]{};
		song[16].setTimeBeat(timeBeat);
		timeBeat = new Integer[]{};
		song[16].setTimeBeat1(timeBeat);
		timeBeat = new Integer[]{};
		song[16].setTimeBeat2(timeBeat);

		timeBeat = new Integer[]{};
		song[16].setTimeSpecialBeat(timeBeat);
		timeBeat = new Integer[]{};
		song[16].setTimeSpecialBeat1(timeBeat);
		timeBeat = new Integer[]{};
		song[16].setTimeSpecialBeat2(timeBeat);
        
        //Lagu 18
		song[17] = new Song();
		song[17].setPath("#");
		song[17].setTitle("O Ina Ni Keke");
		song[17].setSubTitle("Sulawesi Utara");
		timeBeat = new Integer[]{};
		song[17].setTimeBeat(timeBeat);
		timeBeat = new Integer[]{};
		song[17].setTimeBeat1(timeBeat);
		timeBeat = new Integer[]{};
		song[17].setTimeBeat2(timeBeat);

		timeBeat = new Integer[]{};
		song[17].setTimeSpecialBeat(timeBeat);
		timeBeat = new Integer[]{};
		song[17].setTimeSpecialBeat1(timeBeat);
		timeBeat = new Integer[]{};
		song[17].setTimeSpecialBeat2(timeBeat);

        //Lagu 19
		song[18] = new Song();
		song[18].setPath("#");
		song[18].setTitle("Rasa Sayange");
		song[18].setSubTitle("Maluku");
		timeBeat = new Integer[]{};
		song[18].setTimeBeat(timeBeat);
		timeBeat = new Integer[]{};
		song[18].setTimeBeat1(timeBeat);
		timeBeat = new Integer[]{};
		song[18].setTimeBeat2(timeBeat);

		timeBeat = new Integer[]{};
		song[18].setTimeSpecialBeat(timeBeat);
		timeBeat = new Integer[]{};
		song[18].setTimeSpecialBeat1(timeBeat);
		timeBeat = new Integer[]{};
		song[18].setTimeSpecialBeat2(timeBeat);

        //Lagu 20
		song[19] = new Song();
		song[19].setPath("#");
		song[19].setTitle("Borero");
		song[19].setSubTitle("Maluku Utara");
		timeBeat = new Integer[]{};
		song[19].setTimeBeat(timeBeat);
		timeBeat = new Integer[]{};
		song[19].setTimeBeat1(timeBeat);
		timeBeat = new Integer[]{};
		song[19].setTimeBeat2(timeBeat);

		timeBeat = new Integer[]{};
		song[19].setTimeSpecialBeat(timeBeat);
		timeBeat = new Integer[]{};
		song[19].setTimeSpecialBeat1(timeBeat);
		timeBeat = new Integer[]{};
		song[19].setTimeSpecialBeat2(timeBeat);

        //Lagu 21
		song[20] = new Song();
		song[20].setPath("#");
		song[20].setTitle("Satu Tungku Tiga Batu");
		song[20].setSubTitle("Papua Barat");
		timeBeat = new Integer[]{};
		song[20].setTimeBeat(timeBeat);
		timeBeat = new Integer[]{};
		song[20].setTimeBeat1(timeBeat);
		timeBeat = new Integer[]{};
		song[20].setTimeBeat2(timeBeat);

		timeBeat = new Integer[]{};
		song[20].setTimeSpecialBeat(timeBeat);
		timeBeat = new Integer[]{};
		song[20].setTimeSpecialBeat1(timeBeat);
		timeBeat = new Integer[]{};
		song[20].setTimeSpecialBeat2(timeBeat);

        //Lagu 22
		song[21] = new Song();
		song[21].setPath("#");
		song[21].setTitle("Yamko Rambe Yamko");
		song[21].setSubTitle("Papua");
		timeBeat = new Integer[]{};
		song[21].setTimeBeat(timeBeat);
		timeBeat = new Integer[]{};
		song[21].setTimeBeat1(timeBeat);
		timeBeat = new Integer[]{};
		song[21].setTimeBeat2(timeBeat);

		timeBeat = new Integer[]{};
		song[21].setTimeSpecialBeat(timeBeat);
		timeBeat = new Integer[]{};
		song[21].setTimeSpecialBeat1(timeBeat);
		timeBeat = new Integer[]{};
		song[21].setTimeSpecialBeat2(timeBeat);
	}
}
