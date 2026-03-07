class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n=candies.length;
        ArrayList <Boolean> al =new ArrayList<>();
        int max =candies[0];
        for(int i=1;i<n;i++){
                 if(candies[i]>max){
                    max=candies[i];
                 }
        }

        for(int i =0;i<n;i++){
                int sum =candies[i]+extraCandies;
                if(sum>=max){
                    al.add(true);
                }else{
                    al.add(false);
                }
        }

        return al;
    }
}