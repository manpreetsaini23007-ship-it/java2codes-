import java.util.Scanner;
public class sum_of_two_number{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print(" enter frirst number : ");
        int a= sc.nextInt();
        System.out.print(" enter second number :");
        int b= sc.nextInt();
        int sum = a+b;
        System.out.print(" sum of " + a + " and " + b + " is : " + sum);
        sc.close();
    }
}