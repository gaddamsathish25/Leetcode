class Solution {
    public int lengthOfLastWord(String s) {
        
       String arr[] =s.trim().split("\\s+");

       int  n=arr.length-1;

        String str=arr[n];

         return str.length();


        
    }
    


}