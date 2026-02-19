class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                //swap(nums[mid],nums[low]);
                int t = nums[mid];
                nums[mid] = nums[low];
                nums[low] = t;
                low++;
                mid++;
            } 
            else if (nums[mid] == 1) {
                mid++;
            } 
            else if (nums[mid] == 2) {
                // swap(nums[mid],nums[high]);
                int t = nums[mid];
                nums[mid] = nums[high];
                nums[high] = t;
                high--;
            }
        }
    }
}