class Solution {
    public int removeDuplicates(int[] nums) {
    
       int j=0;
       //int [] arr =new int[nums.length];

        for(int i=0;i<nums.length;i++){

            if(i==0 || nums[i]!=nums[i-1]){
                nums[j++]=nums[i];
            }

        }

         return j;
       

    }
}