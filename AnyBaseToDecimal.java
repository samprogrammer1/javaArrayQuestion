import java.util.Scanner;

public class AnyBaseToDecimal {
    

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        scn.close();
        int d = getValueInDecimal(n, b);
        System.out.println(d);
    }

    public static int getValueInDecimal(int n, int b){
        int answer = 0; int multipler = 0;
        while(n > 0) {
            int r = n % 10;
            n = n / 10;
            answer += r * Math.pow(b, multipler);
            multipler++;
        }
        return answer;
    }
}
