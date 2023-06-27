import java.util.Scanner;

public class SubsetOFArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] array = new int[n];

        for(int i = 0; i < n; i++) {
            array[i] = scn.nextInt();
        }
        scn.close();
        int limit = (int)Math.pow(2, array.length);
        for(int i = 0; i < limit; i++){
            String set = "";
            int temp = i;
            for (int j = array.length -1; j >= 0; j--) {
                int rem = temp % 2;
                temp = temp / 2;

                if(rem == 0){
                    set = "-"+ "\t"+set; 
                }else{
                    set = array[j] + "\t" + set;
                }
            }
            System.out.println(set);

        }
        

    }
}
