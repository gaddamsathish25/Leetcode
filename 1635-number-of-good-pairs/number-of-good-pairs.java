class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int x=nums[i];
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
        int count=0;
        for(int k:hm.keySet()){
            int val=hm.get(k);
            int y=0;

            if(val>1){
                y=val*(val-1)/2;
                count+=y;
            }
        }

        return count;
    }
}