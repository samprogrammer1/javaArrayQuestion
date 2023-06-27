import java.util.*;;

public class AnyBaseToAddition {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        scn.close();
        int res = getSum(b , n1, n2);

        System.out.println(res);
    }

    public static int getSum(int b , int n1, int n2){
        int ans =0;

        int c = 0;
        int p = 1;
        while(n1 > 0 || n2 > 0 || c > 0){
            int rem1 = n1 % 10 ;
            int rem2 = n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;

            int sum = rem1 + rem2 + c;
            c = sum / b;
            System.out.println(sum + " / " +  b +" = "+ c );
            sum = sum % b;


            ans += sum * p;
            p = p * 10;
        }

        return ans;
    }

}
