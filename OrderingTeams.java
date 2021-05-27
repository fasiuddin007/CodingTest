import java.util.Scanner;

public class OrderingTeams {
    //Method to check whether (i+1)th person is strictly greater than ith person
    public static boolean check(int a[], int b[]) {
        if (a[0] >= b[0] && a[1] >= b[1] && a[2] >= b[2]) {
            return a[0] > b[0] || a[1] > b[1] || a[2] > b[2];

        } else
            return false;
    }
    public static void main(String[] args) throws java.lang.Exception {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of Teams: ");
            int T = sc.nextInt();
            while (T > 0) {
                //Taking input for each team in terms of hardwork, intelligence and persistence
                int x[] = new int[3];
                for (int i = 0; i < 3; i++) {
                    x[i] = sc.nextInt();
                }
                int y[] = new int[3];
                for (int i = 0; i < 3; i++) {
                    y[i] = sc.nextInt();
                }
                int z[] = new int[3];
                for (int i = 0; i < 3; i++) {
                    z[i] = sc.nextInt();
                }

                int ordering = 0; 
                //Checking for each i+1 th person is better than ith person in terms of all three qualities or at least
                //better in in quality
                if (check(y, z)) {
                    if (check(z, x)) {
                        System.out.println("yes");
                        ordering = 1;
                    }
                }
                if (check(z, y)) {
                    if (check(y, x)) {
                        System.out.println("yes");
                        ordering = 1;
                    }
                }
                if (check(z, x)) {
                    if (check(x, y)) {
                        System.out.println("yes");
                        ordering = 1;
                    }
                }
                if (check(x, z)) {
                    if (check(z, y)) {
                        System.out.println("yes");
                        ordering = 1;
                    }
                }
                if (check(x, y)) {
                    if (check(y, z)) {
                        System.out.println("yes");
                        ordering = 1;
                    }
                }

                if (check(y, x)) {
                    if (check(x, z)) {
                        System.out.println("yes");
                        ordering = 1;
                    }
                }
                //checking if ordering is not 1 then the teams are not in order.
                if (ordering != 1)
                    System.out.println("no");

                T--;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}