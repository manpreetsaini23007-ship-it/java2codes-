import java.util.Scanner;
public class largest_in_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st number : ");
        int num1 = sc.nextInt();
        System.out.print("enter 2nd number : ");
        int num2 = sc.nextInt();
        if(num1 > num2){
            System.out.print("largest number : " +num1 );
        }else{
            System.out.print("largest number : " +num2 );
        }
        sc.close();
    }
}

