import java.util.Scanner;
public class calculator_ifelse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter 1st number: ");
        double num1 = sc.nextDouble();

        System.out.print("enter operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        System.out.print("enter 2nd number: ");
        double num2 = sc.nextDouble();

        if(operator == '+'){
            System.out.print("result: " +(num1 + num2));
        }else if(operator == '-'){
            System.out.print("result: " +(num1 - num2));
        }else if(operator == '*'){
            System.out.print("result: " +(num1 * num2));
        }else if(operator == '/'){
            System.out.print("result: " +(num1 / num2));
        }else{
            System.out.print("invalid operator");
        }
        sc.close();
    }
}
