import java.io.*;

public class RoteteArrat {
    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();
    
        for(int val: a){
          sb.append(val + " ");
        }
        System.out.println(sb);
      }

      public static void reverse(int[] a , int i , int k){
        //wirte code for reverse array

        int li = i;
        int ri = a.length - 1;

        while(li < ri){
            int temp = a[li];
            a[li] = a[ri];
            a[ri] = temp;

            li++;
            ri--;
        }
      }
    
      public static void rotate(int[] a, int k){
        // write your code here
        k = k % a.length;
        System.out.println(k);
        if( k< 0){
            k = k + a.length;
        }

        // wirte code for start to k value reverse
        reverse(a, 0, a.length - k -1);
        reverse(a, a.length - k , a.length);
        reverse(a, 0, a.length);

      }
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
           a[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());
        
        rotate(a, k);
        display(a);
     }
}
