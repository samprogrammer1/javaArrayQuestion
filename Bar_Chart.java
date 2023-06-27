import java.util.*;

public class Bar_Chart {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        // write for loop input
        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();
        int max = arr[0];

        //checking which element is high number
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        //write code for bar chart print
        for(int floor = max; floor >= 1; floor--){
            for(int i = 0 ; i < arr.length ; i++){
                if(arr[i] >= floor){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }


    }
}
