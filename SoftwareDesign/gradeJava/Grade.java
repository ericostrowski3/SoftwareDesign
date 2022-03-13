class Grade {
	public static void main(String args[]){
		int p = Integer.parseInt(args[0]);
		if (p >= 93){
			System.out.println("A");
		} else if (89<p && p<92){
			System.out.println("AB");
		} else if (83<p && p<88){
			System.out.println("B");
		} else if (79<p && p<82){
			System.out.println("BC");
		} else if (70<p && p<78){
			System.out.println("C");
		} else if (60<p && p<69){
			System.out.println("D");
		} else if (p<59){
			System.out.println("F");
		}
	}
}
