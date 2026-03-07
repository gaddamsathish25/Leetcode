class Solution {
    public String mergeAlternately(String word1, String word2) {
        String str ="";

        int left =0;
        int right=0;

        int n1=word1.length()-1;

        int n2=word2.length()-1;


        while(left<=n1 && right<=n2){
            char c1 =word1.charAt(left);
            char c2 =word2.charAt(right);
            str+=c1;
            str+=c2;
            left++;
            right++;
        }

         while(left<=n1){
            char c1 =word1.charAt(left);
            str+=c1;
            left++;
        }
         while(right<=n2){
            char c2 =word2.charAt(right);
            str+=c2;
            right++;
        }


        return str;
    }
}