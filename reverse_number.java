import java.util.Scanner;
public class reverse_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int num = sc.nextInt();

        int reverse = 0;
        while(num != 0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10; 
        }
        System.out.print("reversed number : " + reverse);
        sc.close();
    }
}
