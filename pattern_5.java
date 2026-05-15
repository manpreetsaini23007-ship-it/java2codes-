import java.util.Scanner;
public class pattern_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // making diamond shape by combining both digonal lines "\" and "/"
        System.out.print("enter a number: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if( i+j>=n-1 && i>=j ){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if( i+j<=n-1 && i<=j ){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
