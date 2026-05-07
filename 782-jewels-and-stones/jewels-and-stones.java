class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;

        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < stones.length(); i++) {
            char ch = stones.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < jewels.length(); i++) {
            char ch = jewels.charAt(i);
            int value = 0;
            if (hm.containsKey(ch)) {
                value = hm.get(ch);
                count += value;

            }
        }

        return count;

        //int i=0;

        //    for(char ch:hm.keySet()){

        //     char j=jewels.charAt(i);

        //     int val=hm.get(ch);

        //      if(ch==j){
        //         count+=val;

        //      }

        //}

        //return count;

    }
}