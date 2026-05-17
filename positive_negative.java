import java.util.Scanner;
public class positive_negative {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        if(num == 0){
            System.out.print("the number is zero ");
        }else if(num > 0){
            System.out.print("the number is positive ");
        }else{
            System.out.print("the number is negative ");
        }
        sc.close();
    }
}
