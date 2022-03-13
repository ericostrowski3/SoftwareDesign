import java.util.Scanner;

class Expert {
		public static void main(String args[]){
			Scanner in = new Scanner(System.in);
			
			String sy = "Y";
			String sn = "N";

			System.out.println("Does compiling locally produce an error?");
			String s1 = in.next();
			
			if (s1.equals(sy)){
				System.out.println("Fix program syntax; try again");
			

			} else if (s1.equals(sn)) {
				System.out.println("Does running the profram locally behave as expected?");
				String s2 = in.next();
				
				if (s2.equals(sn)){
					System.out.println("Fix program; try again");


				} else if (s2.equals(sy)){
					System.out.println("Does git status print nothing to commit, working tree clean?");
					String s3 = in.next();
					
					
				}
			}
		}		
	}
