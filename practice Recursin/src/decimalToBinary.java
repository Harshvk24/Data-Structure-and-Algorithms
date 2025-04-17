public class decimalToBinary {

    public static int d2b(int n){

        if(n==0){
            return 0;
        }
        return n%2 + 10*d2b(n/2);
    }

    public static void main(String[] args) {
        int n = d2b(10);
        System.out.println(n);
    }
}
