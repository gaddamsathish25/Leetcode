class Solution {
    public int[] findErrorNums(int[] nums) {
       HashSet<Integer> hs =new HashSet<>();
       int n=nums.length;
       int sum=0;
       int duplicate=0; 
       for(int i=0;i<nums.length;i++){
        int value=nums[i];
        if(!hs.contains(value)){
            hs.add(value);
            sum+=value;
        }else{
                duplicate=value;
          }
       }

       int before=n*(n+1)/2;

       int missing =before-sum;

       int ans[]={duplicate,missing};

       return ans;


    }
}