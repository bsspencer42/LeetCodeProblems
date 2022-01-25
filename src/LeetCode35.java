import java.util.Arrays;

public class LeetCode35 {

    public static void main(String[] args) {
        int[] nums = {2,7,8,9,10};
        int target = 1;
        System.out.println("Answer: " + searchInsert(nums,target));
    }

    public static int searchInsert(int[] nums, int target) {
        return innerSearch(nums,0,nums.length-1,target);
    }

    public static int innerSearch(int[] nums,int left, int right,int target){
        // Vars
        int mid = left+(right-left)/2;
        System.out.println("Mid = " + mid);
        // Base Case - Found target
        if (nums[mid] == target){
            return mid;
        }
        // Base Case - Single Value
        else if (right <= left){
            if (nums[mid] < target){
                System.out.println("test");
                return mid+1;
            }
            else if (mid > 0){
                return mid;
            }
            else {
                return 0;
            }
        }

        // Recursion
        if (nums[mid] > target){
            // Go left
            System.out.println("Going left...");
            System.out.println("Left = " + left + ", Right = " + (mid-1));
            return innerSearch(nums,left, mid -1,target);
        }
        else {
            // Go Right
            System.out.println("Going right...");
            return innerSearch(nums,mid+1,right,target);
        }

    }

}
