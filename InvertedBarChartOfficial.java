import java.util.Scanner;

public class InvertedBarChartOfficial {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] array = new int[n];

        for(int i =0; i < n; i++){
            array[i] = scn.nextInt();
        }
        // max value int array algorithm
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }

        for (int floor = 1; floor <= max; floor++) {
            for (int i = 0; i < array.length; i++) {
                if(array[i] >= floor){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
