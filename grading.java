import java.util.Scanner;
public class grading {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter your marks: ");
        double marks = sc.nextDouble();

        if(marks >=90){
            System.out.print("A");
        }else if(marks >= 75 && marks <= 89){
            System.out.print("B");
        }else if(marks >= 50 && marks <= 74){
            System.out.print("C");
        }else{
            System.out.print("Fail");
        }
        sc.close();
    }
}
