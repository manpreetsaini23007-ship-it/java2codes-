import java.util.Scanner;
public class voting {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.print("enter your age: ");
        int age = sc.nextInt();

        if(age >=18){
            System.out.print("you are eligible for voitng");
        }else{
            System.out.print("MINOR !!!!");
        }
        sc.close();
    }
}

