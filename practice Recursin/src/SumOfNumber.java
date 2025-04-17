public class SumOfNumber {

    public static int sumofDigits(int n){
        if(n<0){
            return 0;
        }
        if(n==0){
            return 0;
        }
        return n%10 + sumofDigits(n/10);
    }

    public static void main(String[] args) {
        int n = 123;
        int sum = sumofDigits(n);
        System.out.println(sum);
    }
}
