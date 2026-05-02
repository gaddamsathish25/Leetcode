class Solution {
    public boolean canJump(int[] nums) {

    
int n=nums.length-1;

        for(int i=n-1;i>=0;i--){
            if((nums[i]+i)>=n){
                n=i;
            }
        }

        return n==0;

        // int n=nums.length;
        // int maxindex=0;

        // for(int i=0;i<n;i++){

        //     if(i>maxindex) return false;

        //     maxindex=Math.max(maxindex,nums[i]+i);

        // }

        // return true;

    }
}