class Zeller {
	public static void main(String args[]) {
		int h = 0;
		int q = 0;
		int m = 0;
		int y = 0;

		/* Check for correct number of command-line arguments. */
		if (args.length != 3) {
			System.err.println("usage: java Zeller DAY MONTH YEAR");
			System.exit(1);
		}

		/* Convert string arguments to int for calculations. */
		try {
			q = Integer.parseInt(args[0]);
			m = Integer.parseInt(args[1]);
			y = Integer.parseInt(args[2]);
		} catch (Exception e) {
			System.err.printf("ill-formed input: %s %s %s\n",
			                   args[0],
			                   args[1],
			                   args[2]);
			System.exit(1);
		}

		/* Perform calculations (consider declaring more variables). */
		if (m == 1){
			y = y-1;
			m = 13;
		} if (m == 2){
			y = y-1;
			m = 14;
		}
		int k = y%100;
		int j = y/100;
		h = (q+((13*(m+1))/5)+k+(k/4)+(j/4)+5*j)%7;
		
		/* Print result. */
		System.out.printf("%d\n", h);
	}
}
