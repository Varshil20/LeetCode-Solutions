class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int freq[] = new int[100001];

        for(int i = 0 ; i < costs.length ; i++){
            freq[costs[i]]++;
        }
        int count = 0;

        
        for (int i = 1; i < freq.length; i++) {
            if (freq[i] > 0) {
                int canBuy = Math.min(freq[i], coins / i);
                count += canBuy;
                coins -= canBuy * i;

                if (coins < i) {
                    break;
                }
            }
        }  

        return count; 
    }
}