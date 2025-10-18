/**
 * 
 */
package vocabulary;

import java.util.Scanner;

/**
 * 
 */
public class DaysofWeek {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// use loops and swift to create a Gaeilge tool

		// import scanner

		Scanner scanner = new Scanner(System.in);

		// declaring variables

		String userResponse, answer;

		// String [] sets up an array, this holds multiple values in the same variable
		// in order and assigns them a number so for e.g, Monday = 1 and An Luan = 1
		// for the for statement, this will allow the program to recognize if 1==1, then
		// the answer is correct as the values can be accessed by their position (known
		// as index)

		String[] dayOfweekEng = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

		String[] daysIrish = { "An Luan", "An Mhairt", "An Cheadaoin", "An Deardaoin", "An Aoine", "An Satharn",
				"An Domhnach" };

		System.out.println("Dia Duit! Let's practice Gaeilge.");

		// ask for input.

		System.out.println("Ce thusa?");

		System.out.println("Is mise _____");

		// reference user input

		userResponse = scanner.nextLine();

		// respond

		System.out.println("Iontach " + userResponse + "! Let's go through laethanta na Seachtaine (days of the week).");

		// the loop == increment lets the loop move on to the next day

		for (int loop = 0; loop < dayOfweekEng.length; loop++) {
			boolean correct;
			correct = false;

			// if correct is true, then !correct = false!
			// we are essentially saying here, if the answer is wrong, keep asking the
			// question. if it is correct, move on to the next day of the week

			while (!correct) {
				System.out.println("What is the gaeilge for " + dayOfweekEng[loop] + "?");

				answer = scanner.nextLine();

				if (answer.trim().equalsIgnoreCase(daysIrish[loop])) {

					System.out.println("Maith thu!");

					// when the answer is correct, we must change the variable to true, so that it
					// moves onto the next day otherwise we get an infinite loop
					correct = true;

				} else {
					System.out.println("Aris! Try again.");

				}

			}

		}

	}
}
