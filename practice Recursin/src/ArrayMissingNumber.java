import java.util.Scanner;

public class ArrayMissingNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5,6,8,9,10};
        missNumber(arr);
    }

    public  static void missNumber(int[] arr){
        int sum1=0;
        int sum2=0;
        for (int i:arr){
            sum1 +=i;
        }
        sum2 = 10*(10+1)/2;
        int diff = sum2-sum1;
        System.out.println(diff);
    }
}
