class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int n = nums.length - 1;
        int elment=0;
        for (int i = 0; i <=n; i++) {
            if (count == 0) {
                elment = nums[i];
                count = 1;
            } else if (nums[i] == elment) {
                count++;
            } else if (nums[i] != elment) {
                count--;
            }
        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i]==elment) {
                cnt++;
            }
        }
        if (cnt > (nums.length / 2)) {
            return elment;
        }
        return elment;
    }
}