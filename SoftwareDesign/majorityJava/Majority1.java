//attempt 1
public class Majority {
	public static int majority(int arr[]){
		int m = 0;
		int x = -1;
		int n = arr.length;
		for (int i = 0; i < n; i=i+1){
			int c = 0;
			for (int j = 0; j < n; j=j+1){
				if (arr[i] == arr[j]) {
					c = c+1;
				}
			}
			
			if (c > m){
				x = i;
			}
		}
		
		if (m > n/2) {
			return arr[x];
		} else {
			return -1;
		}
	}

	public static void main(String[] args){
		System.out.println(majority(new int[]{1,5,2,5,5}));
	}
}
