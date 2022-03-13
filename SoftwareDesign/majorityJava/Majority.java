class Majority {

	public static int majority(int[] votes){
		int m = votes[0];
		int c = 1;
		int n = votes.length;
		double h = n/2.0;
		double x = m/n;
		for(int i = 1; i < n; i=i+1){
			if(c == 0){
				m = votes[i];
				c = 1;
			} else if (votes[i] == m){
				c=c+1;
			} else {
				c=c-1;
			}
		}
		if(x > h){
			return m;
		} else {
			return -1;
		}
	}

	public static void main(String args[]){
		System.out.println(majority(new int[]{1,2,1,2}));
	}
}
