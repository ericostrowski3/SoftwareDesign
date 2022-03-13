class Easter {
	public static void main(String args[]) {
		int year  = 0;
		int month = 0;
		int day   = 0;

		/* Check for correct number of command-line arguments. */
		if (args.length != 1) {
			System.err.println("usage: java Easter YEAR");
			System.exit(1);
		}

		/* Convert string argument to int for calculations. */
		try {
			year = Integer.parseInt(args[0]);
		} catch (Exception e) {
			System.err.printf("ill-formed year: %s\n", args[0]);
			System.exit(1);
		}

		/* Perform calculations (consider declaring more variables). */
		
		int A = 0;
		int B = 0;
		int C = 0;
		int D = 0;
		int E = 0;
		int G = 0;
		int H = 0;
		int M = 0;
		int J = 0;
		int K = 0;
		int L = 0;
		int N = 0;
		int P = 0;
		

		A = year%19;
		B = year/100;
		C = year%100;
		D = B/4;
		E = B%4;
		G = (8*B+13)/25;
		H = (19*A+B-D-G+15)%30;
		M = (A+11*H)/319;
		J = C/4;
		K = C%4;
		L = (2*E+2*J-K-H+M+32)%7;
		N = (H-M+L+90)/25;
		P = (H-M+L+N+19)%32;
		month = N;

		/* Print result. */
		System.out.printf("%d/%d/%d\n", month, P, year);
	}
}
