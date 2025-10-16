class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        if(k>0){
        k=k%n;
        int first=0;
        int last=n-1;
        while(first<last){
            int temp=nums[first];
            nums[first]=nums[last];
            nums[last]=temp;
            first++;
            last--;
        }


        first=k;
        last=n-1;
        while(first<last){
            nums[first]=nums[first]^nums[last];
            nums[last]=nums[first]^nums[last];
            nums[first]=nums[first]^nums[last];
            first++;
            last--;
        }

         first=0;
        last=k-1;
        while(first<last){
            nums[first]=nums[first]^nums[last];
            nums[last]=nums[first]^nums[last];
            nums[first]=nums[first]^nums[last];
            first++;
            last--;
        }
        
        }
    }
}