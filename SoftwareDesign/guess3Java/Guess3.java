import java.util.Scanner;
import java.util.Random;

class Guess3 {
	public static void main(String args[]) {
		int i1 = 0, i2 = 0;

		if (args.length == 1) {
			i1 = Integer.parseInt(args[0]);
		} else {
			Random r = new Random();
			i1 = r.nextInt(10) + 1;
		}

		/* i1 now bears a random value. */
		
		Scanner in = new Scanner(System.in);

		for (int i = 0; i < 3; i++){
			System.out.printf("Guess a number: ");
			i2 = in.nextInt();
			if (i2 == i1){
				System.out.println("Match!");
				i = 3;
			} else if (i2 > i1) {
				System.out.println("Too high.");
			} else {
				System.out.println("Too low.");
			}
		}
	}
}
