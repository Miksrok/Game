//переделать

import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Random random = new Random();
		int number = random.nextInt(6);
		int usersAnswer = -1;
		int count = 1;
		Scanner sc = new Scanner(System.in);

		while (number != usersAnswer) {
			String userInput = getUserInput(sc);
			
			if (number == usersAnswer) {
				System.out.println("bingo!" + " " + count + " попыток");
				count = 1;
				number = random.nextInt(6);
			} else {
				processWrongAnswer(usersAnswer, number);
				count++;
			}
			
			

		}

	}
	
	private static String getUserInput(Scanner sc) {
		System.out.println("your number");
		//стелать чет со стрингомюююконвертнуть в интеджер
		if (sc.hasNextInt()) {
			return sc.next();
		} else {
			String exit = sc.next();
			
			if (exit.equals("q")) {
				sc.close();
				System.out.println("bye!");
				//break;
			}
			return "q";
		}
	}
	
	private static void processWrongAnswer(int usersAnswer, int number) {
		if (usersAnswer > number) {
			System.out.println("less");
			System.out.println("try again");
		} else if (usersAnswer < number) {
			System.out.println("more");
			System.out.println("try again");
		}
	}
}
