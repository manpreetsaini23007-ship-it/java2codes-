import java.util.Scanner;
import java.util.Arrays;
public class Anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first string: ");
        String a=sc.nextLine();
        System.out.print("Enter second string: ");
        String b=sc.nextLine();
        char[] ca=a.toCharArray(), cb=b.toCharArray();
        Arrays.sort(ca); Arrays.sort(cb);
        System.out.println(Arrays.equals(ca,cb)?"Anagram":"Not Anagram");
    }
}
