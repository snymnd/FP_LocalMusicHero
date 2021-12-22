package files;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import Other.User;

public class Files {
	private static String filePath = getDefaultDirectory() + "/GuitarHero/";
	public static String SCORESPATH = getDefaultDirectory() + "/GuitarHero/Scores.txt";

	public Files() {
		
	}

	public static void init() {
		createDir(filePath);
		createFile(SCORESPATH);
	}

	public static void createDir(String filePath) {
		File path = new File(filePath);
		if (!path.exists()) {
			path.mkdir();
		}
	}

	public static void createFile(String filePath) {
			File path = new File(filePath);
			FileWriter writer;
			if (!path.exists()) {
				try {
					path.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
			try {
				writer = new FileWriter(path);
				writer.write("0\n");//Easy score
				writer.write("0\n");//Medium score
				writer.write("0\n");//Hard score
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}	
		}
	}
	
	public static int[] getScores() {
		File file = new File(SCORESPATH);
		int[] scores = new int[3];
		Scanner scanner;
		try {
			scanner = new Scanner(file);
			for(int i = 0; i < 3; i++) {
				if(scanner.hasNextInt()) {
					scores[i] = scanner.nextInt();
				}
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return scores;
	}

	public static void saveScore(int placement, int score) {
		File file = new File(SCORESPATH);
		int[] scores = getScores();
		FileWriter writer;
		try {
			writer = new FileWriter(file);
			for(int i = 0; i < placement; i++) {
				writer.write(scores[i] + "\n");
			}
			writer.write(score + "\n");
			for(int i = placement+1; i < 3; i++) {
				writer.write(scores[i] + "\n");
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void resetScores() {
		File file = new File(SCORESPATH);
		FileWriter writer;
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				 writer = new FileWriter(file);
				 writer.write("0\n");//Easy score
				 writer.write("0\n");//Medium score
				 writer.write("0\n");//Hard score
				 writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else {
			try {
				 writer = new FileWriter(file);
				 writer.write("0\n");//Easy score
				 writer.write("0\n");//Medium score
				 writer.write("0\n");//Hard score
				 writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
    
	public static String getDefaultDirectory() {
		String OS = System.getProperty("os.name").toUpperCase();
		System.getenv("APPDATA");
		return System.getProperty("user.home");
	}
}
