public class gcd {
    public static int gcd(int x, int y){
        //Euclidean algo
        if(x<0||y<0){
            return -1;
        }

        if(y==0){
            return x;
        }
        return  gcd(y,x%y);
    }

    public static void main(String[] args) {
        int n= gcd(24,18);
        System.out.println(n);
    }
}
