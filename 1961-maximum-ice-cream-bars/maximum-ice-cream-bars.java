class Solution {
    public int maxIceCream(int[] costs, int coins) {

        int maxCost = 0;
        for (int cost : costs) {
            maxCost = Math.max(maxCost, cost);
        }

        int freq[] = new int[maxCost + 1];

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