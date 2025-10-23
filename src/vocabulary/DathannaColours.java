/**
 * 
 */
package vocabulary;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 */
public class DathannaColours {

	// array to store colours (dathanna) in gaeilge

	static String[] coloursAsGaeilge = { "gorm", "dughorm", "dubh", "donn", "corca", "bui", "oraiste", "ban", "airgead",
			"or", "liath", "glas", "dearg", "bandearg" };

	// array to store colours (dathanna) in english (bearla)

	static String[] coloursAsBearla = { "blue", "navy", "black", "brown", "purple", "yellow", "orange", "white",
			"silver", "gold", "grey", "green", "red", "pink" };

	// create method for quiz

	public static void coloursTest() {

		Scanner scanner = new Scanner(System.in);
		int score = 0;

		System.out.println("Dia duit. This module will cover dathanna (colours).");

		for (int i = 0; i < coloursAsGaeilge.length; i++) {
			System.out.println("Cen datha ata air? What colour is it? " + coloursAsBearla[i]);
			System.out.println("Ta dath ______ air.");
			String answer = scanner.nextLine().trim().toLowerCase();
			if (answer.equalsIgnoreCase(coloursAsGaeilge[i])) {
				System.out.println("Ceart, iontach!");
				score++;

			} else {
				System.out.println("Ba mhaith an iarracht i.");

			}

			System.out.println("Score: " + score);

		}

	}

	// Method to save the quiz score to a text file
	public static void saveScoreToFile(int score, int totalQuestions) {

		// opens a filewriter to store the score of this quiz.

		try (FileWriter writer = new FileWriter("irish_quiz_scores.txt", true)) { // 'true' for append mode - means the
																					// content is added to the end of
																					// the file instead of overwtitng it
			writer.write(
					"Score: " + score + "/" + totalQuestions + "    Date: " + java.time.LocalDateTime.now() + "\n");
			System.out.println("Score saved to irish_quiz_scores.txt");
			// saves it to current date and time to track progress
		} catch (IOException e) {
			// if theer are an errors - the code goes into catch block which will show an
			// error message for debugging
			System.out.println("An error occurred while saving the score.");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		coloursTest();
	}

}
