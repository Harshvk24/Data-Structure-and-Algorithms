import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class BucketSort {

    int arr[];

    public BucketSort(int arr[]){
        this.arr = arr;
    }

    //Helper - print buckets
    public void printBucket(ArrayList<Integer>[] buckets){
        for(int i =0;i<buckets.length;i++){
            System.out.println("\n Bucket#"+i+":");
            for (int j=0;j<buckets[i].size();j++){
                System.out.print(buckets[i].get(j)+ " ");
            }
        }
    }

    //Bucket Sorting
    public void bucketSort(){
        int numOfBucket = (int) Math.ceil(Math.sqrt(arr.length));
        int maxValue = Integer.MAX_VALUE;
        for(int value:arr){
            if(value>maxValue){
                maxValue = value;
            }
        }

        ArrayList<Integer>[] buckets = new ArrayList[numOfBucket];
        for(int i=0;i<buckets.length;i++){
            buckets[i] = new ArrayList<Integer>();
        }

        for(int value:arr){
            int bucketNumber = (int) Math.ceil((float)value*numOfBucket/(float)maxValue);
            buckets[bucketNumber-1].add(value);
        }

        System.out.println("\n\nPrinting bucket before sorting...");
        printBucket(buckets);

        for (ArrayList<Integer> bucket : buckets){
            Collections.sort(bucket);
        }

        System.out.println("\n\nPrinting bucket after sorting...");
        printBucket(buckets);

        int index =0;
        for(ArrayList<Integer> bucket:buckets){
            for(int value:bucket){
                arr[index]=value;
                index++;
            }
        }
    }

    public static void printArray(int [] arr){
        for(int j=0;j< arr.length;j++){
            System.out.print(arr[j]+ " ");
        }
        System.out.println();

    }

}
