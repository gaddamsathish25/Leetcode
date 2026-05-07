class Solution {
    public int majorityElement(int[] nums) {
        // int count = 0;
        // int n = nums.length - 1;
        // int elment=0;
        // for(int i=0;i<=n;i++){
        //     if(count==0){
        //         elment=nums[i];
        //         count=1;
        //     }else if(nums[i]==elment){
        //         count++;
        //     }else if(nums[i]!=elment){
        //         count--;
        //     }
        // }
        // return elment;




        // // int cnt = 0;
        // // for (int i = 0; i < n; i++) {
        // //     if (nums[i]==elment) {
        // //         cnt++;
        // //     }
        // // }
        // // if (cnt > (nums.length / 2)) {
        // //     return elment;
        // // }




        //using hashmap

        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int val=nums[i];
            if(hm.containsKey(val)){
                int prev=hm.get(val);
                hm.put(val,prev+1);
            }else{
                hm.put(val,1);
            }
        }

        int element=0;

        int max=0;

        for(int x:hm.keySet()){
            if(hm.get(x)>max){
                max=hm.get(x);
                element=x;
            }
        }

        return element;
        
    }
}