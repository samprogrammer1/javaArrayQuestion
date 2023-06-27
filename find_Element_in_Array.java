import java.util.*;

public class find_Element_in_Array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        // array input loop
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int find_element = scn.nextInt();
        scn.close();
        int element = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == find_element){
                element = i;
            }
        }

        System.out.println(element);

    }
}
