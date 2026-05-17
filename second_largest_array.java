import java.util.Scanner;
public class second_largest_array {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter elements : ");
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int num : arr){
            if(num > max){
                secondMax = max;
                max = num;
            }else if(num > secondMax && num != max){
                secondMax = num;
            }
        }

        if(secondMax == Integer.MIN_VALUE){
            System.out.print("no second largest element found");
        }else{
            System.out.print("second largest number = " +secondMax);
        }

        sc.close();
    }
}
