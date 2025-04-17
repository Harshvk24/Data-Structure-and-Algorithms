public class Main {

    //create buckets
    //no of bucket = sq.roo of no of element
    //no of bucket = round(sqrt(no of elements))
    //appropriate bucket = cell(Value * no of bucket /maxValue)
    //sort bucket individually
    //merge bucket
    //use when uniformly distributed
    //TC : nlogn
    //Space n

    public static void main(String[] args) {
        int arr[] = {10 ,5, 7, 17 ,16,21,20,4,1};
        BucketSort bs = new BucketSort(arr);
        bs.printArray(arr);
        bs.bucketSort();
        bs.printArray(arr);
    }
}
