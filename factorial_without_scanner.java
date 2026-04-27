public class factorial_without_scanner {
    public static void main(String[] args){
        int num = 5;
        int fact = 1;
        for(int i= 1 ; i<= num ; i++){
             fact = fact * i;
        }
        System.out.print("factoril : " + fact );
    }
}
