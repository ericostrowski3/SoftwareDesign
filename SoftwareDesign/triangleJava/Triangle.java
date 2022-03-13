class Triangle {
	public static void triangle(int h){
		for (int i = 0; i < h; i = i + 1){
			for (int x = 0; x < h - i; x = x + 1){
				System.out.println(" ");
			}
			for (int y = 0; y <= i; y = y + 1){
				System.out.println("X ");
			}
			
		}
	}
}

