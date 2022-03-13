class Min {
	public static int min(int[] a) {
		int m = -1;
		for (int i = 0; i < a.length; i=i+1){
			if (a[i] < m) {
				m = a[i];
			}
		}
		return m;
	}
}
