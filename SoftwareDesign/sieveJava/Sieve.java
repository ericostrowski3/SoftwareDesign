class Sieve {
	public static void main(String args[]) {
		int p = 2;
		int n = Integer.parseInt(args[0]);
		
		boolean prime[] = new boolean[n+1];
		for(int i=0; i<=n; i=i+1){
			prime[i] = true;
		}
		for (p = 2; p*p <=n; p=p+1) {
			if (prime[p] == true){
				for (int i = p*2; i <=n; i=i+p){
					prime[i] = false;
					}
				}
			}
		for(int i = 2; i<=n; i=i+1){
			if(prime[i] == true){
				System.out.println(i);
				}
			}
		}
	} 
