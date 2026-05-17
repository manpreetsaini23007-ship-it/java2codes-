import java.util.Scanner;
public class weekdays_ifelse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number (1-7): ");
        int days = sc.nextInt();

        if(days == 1){
            System.out.print("Monday");
        } else if(days == 2){
            System.out.print("Tuesday");
        } else if(days == 3){
            System.out.print("Wednesday");
        } else if(days == 4){
            System.out.print("Thursday");
        } else if(days == 5){
            System.out.print("Friday");
        } else if(days == 6){
            System.out.print("Saturday");
        } else if(days == 7){
            System.out.print("Sunday");
        } else {
            System.out.print("Invalid input");
        }
        sc.close();
    }
}
