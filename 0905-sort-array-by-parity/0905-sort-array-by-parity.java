class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0, right = nums.length-1;
        while(left < right) {
            if(nums[left]%2 == 0) {
                left++;
            }
            if(nums[right]%2 != 0) {
                right--;
            }
            if(left<right && nums[left]%2!=0 && nums[right]%2==0)
            {
                int t = nums[left];
                nums[left] = nums[right];
                nums[right] = t;
                left++;
                right--;
            }
        }
        return nums;
    }
}