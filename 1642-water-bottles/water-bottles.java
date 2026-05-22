class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total = 0;
        int empty = 0;

        while(numBottles > 0){
            total = total + numBottles; //drink bottles

            empty = empty + numBottles; // bocome empty

            numBottles = empty/numExchange;  //exchange it with filled bottle

            empty = empty%numExchange;  //remaing empty bottle
        }

        return total;
    }
}