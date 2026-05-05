class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> st =new Stack<>();

        for(String str:operations){
            if(str.equals("+")){


               int top=st.pop();

                int newtop=st.peek()+top;

                st.push(top);
                st.push(newtop);

            }else if(str.equals("D")){

             st.push(st.peek()*2);

            }else if(str.equals("C")){
                st.pop();
            }else{
                st.push(Integer.parseInt(str));
            }
        }

int total=0;
        for(int i:st){
total+=i;

        }

        return total;

    }
}