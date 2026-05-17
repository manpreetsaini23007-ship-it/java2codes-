import java.util.Scanner;
public class LCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a=sc.nextInt(), b=sc.nextInt();
        int gcd=a; int bb=b;
        while(bb!=0){int t=bb; bb=gcd%bb; gcd=t;}
        int lcm=(a*b)/gcd;
        System.out.println("LCM = " + lcm);
    }
}