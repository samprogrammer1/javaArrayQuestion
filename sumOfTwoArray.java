import java.util.Scanner;

public class sumOfTwoArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];

        //write array for arr1
        for(int i =0; i < n1; i++){
            arr1[i] = scn.nextInt();
        }
        
        int n2 = scn.nextInt();
        int[] arr2 = new int[n2];

        // write code for arr2
        for(int i = 0; i < n2 ; i++){
            arr2[i] = scn.nextInt();
        }
        scn.close();

        int[] sum = new int[n1 > n2 ? n1 : n2];
        int i = n1 -1;
        int j = n2 -1;
        int k = sum.length - 1;
        int c = 0;
        while(i >= 0 || j >= 0){
            int d = c;

            if(i >= 0){
                d += arr1[i]; 
            }
            if(j >= 0){
                d += arr2[j];
            }

            c = d / 10;
            d = d % 10;
            sum[k] = d;

            k--;
            j--;
            i--;
        }

        if(c > 0){
            System.out.println(c);
        }
        for(int val : sum){
            System.out.println(val);
        }


    }
}
