import java.util.*;

public class AnybaseToMultiplication {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        scn.close();
        int res = getProduct(b , n1 , n2);

        System.out.println(res);
    }

    public static int getProduct(int b , int n1 , int n2){
        // write your code here
        int ans = 0 ;
        int p =1;
        while(n2 > 0 ){
            int d2 = n2 % 10;
            n2 = n2 / 10;

            int sqrd = getProductWithASingleDigital(b, n1, d2);
            
           ans = getSum(b, ans, sqrd * p );
            p = p * 10;
        }

        return ans;
    }

    public static int getProductWithASingleDigital(int b , int n1 , int d2){
        int ans = 0;
        int power = 1;
        int carray = 0;
        while (n1 > 0 || carray > 0) {
            int rem1 = n1 % 10;
            n1 = n1 / 10;

            int multi = rem1 * d2 + carray;

            carray = multi / b;
            multi = multi % b;

            ans = ans + multi * power;
            power = power * 10;
        }

        return ans;
    }

    public static int getSum(int b , int n1 , int n2) {
        int ans = 0; int power = 1; 
        int carry = 0;
        while(n1 > 0 || n2 > 0 || carry > 0){
            int rem1 = n1 % 10;
            int rem2 = n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;

            int sum = rem1 + rem2 + carry;
            carry = sum / b;
            sum = sum  % b;
            
            ans += sum * power;
            power = power * 10;
        }

        return ans;

    } 
}
