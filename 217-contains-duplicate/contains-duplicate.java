class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Arrays.sort(nums);
        int n=nums.length;
        int j=0;
        int [] temp =new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i==0||nums[i]!=nums[i-1]){
                temp[j++]=nums[i];
            }
        }

        int [] arr=Arrays.copyOf(temp,j);
        int k=arr.length;

        if(k<n) return true;
        else{
            return false;
        }
       
    }
}