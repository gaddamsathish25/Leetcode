import java.util.*;
class Solution {
    String str="FizzBuzz";
    String str1="Fizz";
    String str2="Buzz";
    public List<String> fizzBuzz(int n) {
    List<String> l=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if((i%3==0) &&(i%5==0)){
                l.add(str);
            }
            else if(i%3==0){
                l.add(str1);
            }
            else if(i%5==0){
                l.add(str2);
            }
            else{
                l.add(String.valueOf(i));
            }
        }

        return l;
    }
}