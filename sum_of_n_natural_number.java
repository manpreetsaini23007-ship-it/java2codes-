import java.util.Scanner;
public class sum_of_n_natural_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int sum = 0;
        for(int i=1 ; i<=num ; i++){
            sum = sum + i;
        }
        System.out.print("Sum of " + num + " natural number : " + sum);
        sc.close();
    }
}
