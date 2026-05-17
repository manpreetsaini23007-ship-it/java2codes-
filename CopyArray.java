public class CopyArray {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int[] copy=new int[arr.length];
        for(int i=0;i<arr.length;i++) copy[i]=arr[i];
        for(int x:copy) System.out.print(x+" ");
    }
}