public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10 , 20 , 30, 40, 50, 60, 70, 80, 90, 100};

        int data = 70;

        int low = 0;
        int hight = arr.length - 1;

        while(low <= hight){
            int mid = (low + hight) / 2;
            if(data > arr[mid]){
                low = mid + 1;
            }else if(data < arr[mid]){
                hight = mid - 1;
            }else{
                System.out.println(mid);
                return;
            }
        }

        System.out.println(-1);
        
    }
}
