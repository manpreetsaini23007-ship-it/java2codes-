import java.util.Scanner;
public class fibonacci_reccursion {
    static int fib (int n){
        if(n<=1)
        return 1;
    return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        System.out.print("fibonacci series : " );
        for(int i = 0 ; i<n ; i++){
            System.out.print(fib(i)+ " ");
        }
        sc.close();
    }
}
