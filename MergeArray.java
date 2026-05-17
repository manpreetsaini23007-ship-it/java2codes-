public class MergeArray {
    public static void main(String[] args) {
        int[] a={1,2}, b={3,4};
        int[] c=new int[a.length+b.length];
        int k=0;
        for(int x:a) c[k++]=x;
        for(int x:b) c[k++]=x;
        for(int x:c) System.out.print(x+" ");
    }
}