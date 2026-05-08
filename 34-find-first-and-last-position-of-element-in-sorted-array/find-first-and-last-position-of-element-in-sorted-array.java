class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;

        int lb=LowerBond(nums,n,target);
        if(lb==n || nums[lb]!=target){
            return new int[]{-1,-1};
        } 

        return new  int[] {lb,upperBond(nums,n,target)-1};
        
    }
    public int LowerBond(int []nums,int n,int target){
        int left=0;
        int right=n-1;

        int ans=n;

        while(left<=right){
            int mid=(left+right)/2;

            if(nums[mid]>=target){
                ans=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }

        return ans;
    }
    public int upperBond(int [] nums,int n,int target){
        int left=0;
        int right=n-1;

        int ans=n;

        while(left<=right){
            int mid=(left+right)/2;

            if(nums[mid]>target){
                ans=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }

        return ans;
    }

}