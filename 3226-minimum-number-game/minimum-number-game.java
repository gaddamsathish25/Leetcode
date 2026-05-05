class Solution {
    public int[] numberGame(int[] nums) {
       
        PriorityQueue<Integer> pq=new PriorityQueue<>();


        int [] res=new int[nums.length];
        int j=0;

        for(int x:nums){
            pq.add(x);
        }
        
        while(!pq.isEmpty()){
           
            
           int alice=pq.poll();

           int bob=pq.poll();
            

            res[j++]=bob;
            

            res[j++]=alice;
           
            

        }
        
        return res;

    }
}