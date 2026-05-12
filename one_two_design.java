import java.util.Scanner;

public class one_two_design {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        // Print the pattern
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(); // move to next line
        }

        sc.close();
    }
}

