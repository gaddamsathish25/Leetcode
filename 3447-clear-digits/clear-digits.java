class Solution {
    public String clearDigits(String s) {
        Stack<Character> st=new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(Character.isLetter(ch)){
                st.push(ch);

            }else{
                st.pop();
            }

        }
        StringBuilder  str=new StringBuilder();
        for(char ch:st){
            str.append(ch);
        }

        //str.reverse();

        return str.toString();




    }
}