import java.util.Scanner;
public class pattern_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // code for both digonal lines "\" and "/"
        System.out.print("enter a number: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i + j >= n - 1 && i <= j){ 
                    // can be done upside down by changing "<=" signs
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
