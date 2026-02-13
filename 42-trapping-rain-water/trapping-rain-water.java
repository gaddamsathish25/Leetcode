class Solution {
    public int trap(int[] height) {
        int left=0,right=height.length-1,leftmax=0,rightmax=0,total=0;
        while(left<=right){
            if(height[left]<=height[right]){
                if(leftmax>height[left]){
                    total+=leftmax-height[left];
                }else{
                    leftmax=height[left];
                }
                left++;
            }
            else{
                if(rightmax>height[right]){
                    total+=rightmax-height[right];
                }else{
                    rightmax=height[right];
                }
                right--;
            }
        }
        return total;
    }
}