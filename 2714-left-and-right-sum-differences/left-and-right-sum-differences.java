class Solution {
    public int[] leftRightDifference(int[] nums) {
        int [] leftsum=new int[nums.length];

        int [] rightsum=new int[nums.length];

        int [] answer=new int[nums.length];



        int lsum=nums[0];
        for(int i=1;i<nums.length;i++){
            leftsum[i]=lsum;
            lsum+=nums[i];
        }
        

        int rsum=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            rightsum[i]=rsum;
            rsum+=nums[i];
        }

        for(int i=0;i<nums.length;i++){
            answer[i]=Math.max(leftsum[i],rightsum[i])-Math.min(leftsum[i],rightsum[i]);
        }
            return answer;
    }
}