public class Frequency {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,3,3};
        int[] freq=new int[10];
        for(int x:arr) freq[x]++;
        for(int i=0;i<freq.length;i++)
            if(freq[i]>0) System.out.println(i+"="+freq[i]);
    }
}