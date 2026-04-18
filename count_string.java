import java.util.Scanner;
public class count_string {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
            System.out.print("enter array size: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[n];

        System.out.println("Enter elements : ");
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextLine();
        }

        System.out.print("enter string to count : ");
        String target = sc.nextLine();

        int count = 0;
        for(String s : arr){
            if(s.equals(target)){
                count++;
            }
        }
        System.out.println("count of " +target+ " occurs " +count+ " times. ");
        sc.close();
    }
}
