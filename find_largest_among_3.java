import java.util.Scanner;
public class find_largest_among_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the frist number: ");
        int a = sc.nextInt();
        System.out.print("enter the second number: ");
        int b = sc.nextInt();
        System.out.print("enter the third number: ");
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.print("a is greatest ");
        } else if(b>a && b>c){
            System.out.print("b is greatest ");
        } else{
            System.out.print("c is greatest ");
        }
        sc.close();
        }
}

