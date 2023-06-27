import java.util.*;

public class FirstAndLastIndex {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int data = scn.nextInt();
        scn.close();

        // this code for first index value

        int low = 0;
        int hight = arr.length -1;
        int first_index = -1;

        while(low <= hight){
            int mid = (low + hight) / 2;
            if(data > arr[mid]){
                low = mid + 1;
            }else if(data < arr[mid]){
                hight = mid - 1;
            }else{
                first_index = mid;
                low = mid - 1;
            }
        }

        System.out.println(first_index);

        // this code for last index value

        low = 0;
        hight = arr.length - 1;
        int last_index = -1;

        while(low <= hight){
            int mid = (low + hight) / 2;
            if(data > arr[mid]){
                low = mid + 1;
            }else if(data < arr[mid]){
                hight = mid - 1;
            }else {
                last_index = mid;
                low  = mid + 1;
            }
        }

        System.out.println(last_index);

    }
}
