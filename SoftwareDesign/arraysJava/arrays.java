class Arrays {
	public static void main(String args[]) {
		for (int i = 0; i < args.length; i++) {
			String argument = args[i];

			for (int j = 0; j < argument.length(); j++) {
				/* TODO: replace this with counting logic.  */
				
				System.out.printf("%c\n", argument.charAt(j));
			}
		}

		/* TODO: replace this with loop that prints results.  */
		System.out.printf("done\n");
	}
}
