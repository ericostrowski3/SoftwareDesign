class Volume {
	public static void main(String args[]){
		double r = Double.parseDouble(args[0]);

		try {
			double v = (4.0/3.0)*Math.PI*Math.pow(r, 3);
			System.out.printf("%.1f\n", v);
		} catch (Exception e) {
			System.err.printf("ill-formed radius value: %s\n", args[0]);
			System.exit(1);
		}
	}
}
