class Solution {
    public int maxProduct(int[] nums) {
          int result=nums[0];
          int maxproduct=nums[0];
           int minproduct=nums[0];
          for(int i=1;i<nums.length;i++){

            if(nums[i]<0){
                int temp=maxproduct;
                maxproduct=minproduct;
                minproduct=temp;
            }


            maxproduct=Math.max(nums[i],nums[i]*maxproduct);
            minproduct=Math.min(nums[i],nums[i]*minproduct);

            result=Math.max(result,maxproduct);
          }
          return result;

    }
}