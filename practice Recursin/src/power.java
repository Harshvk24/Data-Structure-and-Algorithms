public class power {
    public static void main(String[] args) {
        int n = power(2,3);
        System.out.println(n);
    }

    public static int power(int base, int exp){
        if(exp<0){
            return -1;
        }
        if( exp==0){
            return 1;
        }
        return base * power(base, exp-1);
    }
}
