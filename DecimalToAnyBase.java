import java.util.*;

public class DecimalToAnyBase{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        scn.close();
        // LinkedList<String> dn = getValueInBase(n, b);
        int dn = getValueInBase(n, b);
        System.out.println(dn);
    }

    public static int getValueInBase(int n, int b){
        int ans = 0; int m = 1;

        while(n > 0 ){
            int rem = n % b;
            n = n /b;
            ans += rem * m;
            m *= 10;
        }
        return ans;
        
    }

}