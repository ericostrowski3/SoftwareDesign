class Area {
public static void main(String args[]){
	double r = Double.parseDouble(args[0]);
	try {
			double a = Math.PI*Math.pow(r, 2);
			System.out.printf("%.1f\n", a);
                } catch (Exception e) {
                        System.err.printf("ill-formed year: %s\n", args[0]);
                        System.exit(1);
                }
	}
}
