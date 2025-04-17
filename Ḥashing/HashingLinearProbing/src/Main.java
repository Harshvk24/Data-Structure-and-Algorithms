public class Main {
    public static void main(String[] args) {
        String s = "NAME";
        int sum=0;
        for(int i=0;i<s.length();i++){
            sum = sum+s.charAt(i);
        }
        System.out.println(sum);
    }
}
