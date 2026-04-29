class Solution {
    public boolean isPalindrome(String s) {
       StringBuilder str =new StringBuilder();
         for(char ch:s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
               str.append(Character.toLowerCase(ch));
            }
         }

        String st=str.toString();
        int left=0;
        int right=st.length()-1;

        while(left<right){
          if(st.charAt(left)==st.charAt(right)){
            left++;
            right--;

          }else{
            return false;
          }

        }

        return true;
         
    }
}