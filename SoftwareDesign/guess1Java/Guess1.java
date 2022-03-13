import java.util.Scanner;
import java.util.Random;

class Guess1 {
	public static void main(String args[]) {
		int i1 = 0, i2 = 0, g = 0;

		if (args.length == 1) {
			i1 = Integer.parseInt(args[0]);
		} else {
			Random r = new Random();
			i1 = r.nextInt(10) + 1;
		}

		/*
		 * i1 now bears a random value. Prompt the user, read the input
		 * value, check against i1, and print response.
		 */
		Scanner in = new Scanner(System.in);
		System.out.printf("Guess a number: ");
		g = in.nextInt();
		if (g == i1) {
			System.out.println("Match!");
		} else {
			System.out.println("Does not match.");
		}
	}
}
