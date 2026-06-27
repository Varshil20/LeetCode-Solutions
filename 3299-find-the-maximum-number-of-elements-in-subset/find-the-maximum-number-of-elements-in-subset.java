class Solution {
    public int maximumLength(int[] nums) {
        Map<Integer , Integer> count = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){
            count.put(nums[i] , count.getOrDefault(nums[i] , 0) + 1);
        }

        int max = 1;

        if(count.containsKey(1)){
            int one = count.get(1);

            if(one % 2 == 0){
                one--;
            }

            max = Math.max(max , one);
        }
        count.remove(1);

        

        for(int x : count.keySet()){
            int crntLen = 0;
            long crnt = x;

            while(crnt < 1000000000L && count.getOrDefault((int)crnt , 0) >= 2){
                crnt *= crnt;
                crntLen += 2;
            }

            if(crnt < 1000000000L && count.getOrDefault((int) crnt , 0) > 0){
                crntLen++;
            }
            else{
                crntLen--;
            }

            max = Math.max(max , crntLen);
        }

        return max;
    }
}