class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int [] pos =new int[n/2];
        int[] neg=new int[n/2];

        int p=0;
        int e=0;
        for(int i=0;i<n;i++){
                if(nums[i]>0){
                pos[p]=nums[i];
                p++;
                }
                else{
                    neg[e]=nums[i];
                    e++;
                }
        }
        int i=0;
        int j=0;
        int k=0;
        while(i<pos.length && j<neg.length){
            nums[k++]=pos[i++];
            nums[k++]=neg[j++];
        }

        return nums;
    }
}