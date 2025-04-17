import java.util.*;

public class ArrayPair {
    public static void main(String[] args)

    {
        String s = new String();
        s= integerToString()
                Scanner sc = new Scanner(System.in);
        ArrayPair mn = new ArrayPair();

        int[] nums = {2, 7, 13, 15};
        int[] result = mn.twoSum(nums, 20);
        System.out.println(Arrays.toString(result));
    }


    public static int[] twoSum(int[] nums,int target){
        for (int i=0;i< nums.length;i++){
            for(int j =i+1;j< nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[] {i,j};
                }
            }
        }
        throw new IllegalArgumentException("No solution found");
    }

}
