public class LeetCode26 {

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,3,4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        // Duplicate counter
        int j=0;
        int nextVal=0;
        for (int i=0; i < nums.length;i++){
            j = 0;
            while(i+j+1 < nums.length && nums[i] == nums[i+j+1]){
                i+=1;
            }
            nums[nextVal] = nums[i];
            nextVal++;
        }
        return nextVal;
    }
}