import java.util.Arrays;
import java.util.Scanner;


public class hello { public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    sc.nextLine();
    int t = sc.nextInt();
    for(int i=0;i<t;i++){
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int j=0;j<n;j++){
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);
        int sum=0;
        if(m==n || m==1){
            if(n%2==0){
                sum = (arr[n/2]+arr[n/2+1])/2;
            }
            System.out.println(sum);
        }
        else{

        }
    }
}


}
}
