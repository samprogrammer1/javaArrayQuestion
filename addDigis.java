public class addDigis {

    static int addDigits(int n) {
        int sum = 0;
 
        // Loop to do sum while
        // sum is not less than
        // or equal to 9
        while (n > 0 || sum > 9)
        {
            if (n == 0) {
                n = sum;
                sum = 0;
            }
            sum += n % 10;
            n /= 10;
            System.out.println(sum + " and n = " + n);
        }
       
        return sum;
    }



    public static void main(String[] args) {
        int n = 3225;
        System.out.println(addDigits(n));
    }
}
