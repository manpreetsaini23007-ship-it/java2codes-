import java.util.Scanner;
public class print_odd_number {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        System.out.print(" odd number from 1 to " + num + " are :");
        for(int i = 1 ; i<=num ; i++){
            if( i % 2== 1){
                System.out.print( i + " ");
            }
        }
        sc.close();
    }
}
