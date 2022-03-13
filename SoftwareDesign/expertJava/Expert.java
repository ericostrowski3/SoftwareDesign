import java.util.Scanner;
 
class Expert {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String sy = "Y";
        String sn = "N";
 
        System.out.println("Does compiling locally produce an error?");
        String s1 = in.next();
        if (s1.equals(sy)){
            System.out.println("Fix program syntax; try again.");
 
        } else if (s1.equals(sn)) {
            System.out.println("Does running the program locally behave as expected?");
            String s2 = in.next();
            if (s2.equals(sn)){
                System.out.println("Fix program; try again.");
            } else if (s2.equals(sy)){
                System.out.println("Does git status print nothing to commit, working tree clean?");
                String s3 = in.next();
                if (s3.equals(sy)){
                    System.out.println("Consult Aquinas; did your submission pass?");
                    String s4 = in.next();
                    if (s4.equals(sy)){
                        System.out.println("Good! Manually review your submission.");
                    } else if (s4.equals(sn)){
                        System.out.println("Consult specification, and modify; try again.");
                    }
                } else if (s3.equals(sn)){
                    System.out.println("Does git status print Changes not staged for commit?");
                    String s5 = in.next();
                    if (s5.equals(sy)){
                        System.out.println("Use Git to add, commit, and push; try again.");
                    } else if (s5.equals(sn)){
                        System.out.println("Does git status print Changes to be committed?");
                        String s6 = in.next();
                        if (s5.equals(sy)){
                            System.out.println("Use Git to commit and push; try again.");
                        } else if (s5.equals(sn)){
                            System.out.println("Use Git to push; try again.");
                        }
                    }
                }
 
            }
        }
    }
}
