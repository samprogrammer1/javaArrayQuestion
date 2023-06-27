import java.util.*;

public class spanOfArray {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] array =  new int[n];

        for(int i = 0; i < n; i++){
            array[i] = scn.nextInt();
        }
        scn.close();
        int min = array[0];
        int max = array[0];

        for(int i = 1; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
            if(array[i] > max){
                max = array[i];
            }
        }
        int span = max - min;
        System.out.println(span);
    }
}
