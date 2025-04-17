import java.util.*;
public class ArrayProject {

    // Temperature project
    // Find no of dayas above average temprature
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many days temperature? ");

        int numDays = sc.nextInt();
        int[] temp = new int[numDays];
        int sum=0;
        for (int i=0;i<numDays;i++){
            System.out.println("Day"+ i+1 + "temperature ");
            temp[i]= sc.nextInt();
            sum+=temp[i];
        }
        double average = sum/numDays;
        System.out.println();
        int above =0;
        for (int i=0;i<numDays;i++){
            if(temp[i]> average){
                above++;
            }
        }
        System.out.println("Average temperature = "+ average);
        System.out.println("Days above average is "+ above);


    }

}
