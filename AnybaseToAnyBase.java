import java.util.*;

public class AnybaseToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();
        scn.close();
        int res = getValue(n , b1 , b2);

        System.out.println(res);
    }

    public static int getValue(int n ,int b1 , int b2){
        int dec = AnyBaseToDecimal(n , b1);
        int final_value =  DecimalToAnyBase(dec , b2);
        return final_value;
    }

    public static int AnyBaseToDecimal(int n ,int b1){
        int ans = 0; int power = 1;
        while(n > 0) {
            int remender = n % 10;
            n = n / 10;
            ans +=  remender * power;
            power =power * b1;
        }
        return ans;
    }


    public static int DecimalToAnyBase(int dec , int b2){
        int ans = 0; int power = 1;

        while(dec > 0 ){
            int rem = dec % b2;
            dec = dec / b2;
            ans += rem * power;
            power = power * 10;

        }
        return ans;
    }
}