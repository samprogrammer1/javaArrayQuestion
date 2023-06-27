import java.util.Scanner;

public class AnyBaseToSubtraction {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        scn.close();
        int res = getSubtraction(b, n1 ,n2);

        System.out.println(res);
    }

    public static int getSubtraction(int b , int n1, int n2) {
        int ans = 0 ;
        int power = 1;

        int carry = 0;
        while(n1 > 0 || n2 > 0 || carry > 0){
            int rem1 = n1 % 10;
            int rem2 = n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;

            int sub = 0 ;
            rem2 = rem2 + carry;

            if(rem2 >= rem1){
                carry = 0;
                sub = rem2 - rem1;
            }else{
                carry = -1;
                sub = rem2 + b - rem1; 
            }

            ans = ans + sub * power;
            power = power * 10; 
        }
        return ans;

    }
}
