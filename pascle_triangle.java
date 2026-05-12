import java.util.Scanner;

public class pascle_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int rows = sc.nextInt();

        // Generate and print Pascal's Triangle
        for (int i = 0; i < rows; i++) {
            // Print leading spaces for alignment
            for (int space = 0; space < rows - i; space++) {
                System.out.print(" ");
            }

            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }

        sc.close();
    }
}

