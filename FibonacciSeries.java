import java.util.*;

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Taking an input from the user
        String S = sc.nextLine();
        int c = 0, k = 0; // Initializing c(distinct number of elements in the string) to 0
        int distinct[] = new int[10];
        // Checking for Distince elements in the String
        for (int i = 0; i < S.length(); i++) {
            for (int j = i + 1; j < S.length(); j++) {
                if (S.charAt(i) == S.charAt(j)) {
                    c++;
                }
            }
            distinct[k] = c;
            k++;
            c = 0; // After every iteration of distinct element resetting c to 0
        }
        // Checking if the distinct terms are less than 3 or not to print as Dynamic
        for (k = 0; k < distinct.length; k++) {
            if (distinct[k] >= 3) {
                    System.out.println("Not");
                    break;
                }
            else {
                System.out.println("Dynamic");
                break;
            }
        }
    }
}