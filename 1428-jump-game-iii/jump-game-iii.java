class Solution {
    public boolean canReach(int[] arr, int start) {
       Queue<Integer> q=new LinkedList<>();
       q.add(start);
       while(!q.isEmpty()){
        int curr=q.poll();
        if(arr[curr]<0) continue;
        if(arr[curr]==0) return true;
        int jump=arr[curr];
        arr[curr]=-arr[curr];
        if(curr+jump<arr.length) q.add(curr+jump);
        if(curr-jump>=0) q.add(curr-jump);
       } 
       return false;
    }
}