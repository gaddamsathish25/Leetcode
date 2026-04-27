class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxsum=0;
        int currsum=0;

        for(int i=0;i<k;i++){
            currsum+=nums[i];
        }
        maxsum=currsum;

        for(int i=k;i<nums.length;i++){
            currsum+=nums[i]-nums[i-k];

            maxsum=Math.max(currsum,maxsum);
        }

return maxsum/k;


    }
}