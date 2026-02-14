class Solution {
    public String reverseWords(String s) {

       
        String arr[] =s.trim().split("\\s+");

        int left=0,right=arr.length-1;
       
        while(left<=right){
            String str=arr[left];
            arr[left]=arr[right];
            arr[right]=str;

            left++;
            right--;
        }

        String str=String.join(" ",arr);
        return str;



    





    }
}