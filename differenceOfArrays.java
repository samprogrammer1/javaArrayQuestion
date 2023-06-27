import java.util.*;

public class differenceOfArrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];

        //write code for arr1
        for (int i = 0; i < n1; i++) {
            arr1[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int[] arr2 = new int[n2];
        
        //write code fro 2 array
        for (int i = 0; i < n2; i++) {
            arr2[i] = scn.nextInt();
        }
        scn.close();

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        
        int[] diff = new int[n2];
        int k = diff.length - 1;
        int c = 0;

        while (k >= 0) {
            int d = 0;
            int alv = i >= 0 ? arr1[i] : 0;
            if(arr2[j] + c >= alv ){
                d = arr2[j] + c - alv;
                c = 0; 
            }else{
                d = arr2[j] + c + 10 - alv;
                c = -1;
            }

            diff[k] = d;
            
            i--;
            j--;
            k--;
        }

        int idx = 0;
        while(idx < diff.length && diff[idx] == 0){
            idx++;
        }

        while(idx < diff.length){
            System.out.println(diff[idx++]);
        }

        
    }
}
