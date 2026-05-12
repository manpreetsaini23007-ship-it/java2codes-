import java.util.Scanner;
public class odd_even {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int num = sc.nextInt();
        
        if(num % 2 == 0){
            System.out.print("the number " + num + " is even ");
        }else{
            System.out.print("the number " + num + " is odd ");
        }
        sc.close();
    }
}
