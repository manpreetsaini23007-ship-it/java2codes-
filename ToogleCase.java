import java.util.Scanner;
public class ToogleCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string: ");
        String s=sc.nextLine(), res="";
        for(char c:s.toCharArray()){
            if(Character.isUpperCase(c)) res+=Character.toLowerCase(c);
            else res+=Character.toUpperCase(c);
        }
        System.out.println("Toggled = " + res);
    }
}