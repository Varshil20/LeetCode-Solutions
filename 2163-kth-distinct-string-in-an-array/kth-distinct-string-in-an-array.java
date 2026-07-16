class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String , Boolean> freq = new HashMap<>();

        for(int i = 0 ; i < arr.length ; i++){
            String crnt = arr[i];

            if(freq.containsKey(crnt)){
                freq.put(crnt , false);
            }
            else{
                freq.put(crnt , true);
            }
        }
        
        int count = 0;
        String ans = "";

        for(int i = 0 ; i < arr.length ; i++){
            String crnt = arr[i];

            if(freq.get(crnt)){
                count++;
            }

            if(count == k){
                ans = crnt;
                break;
            }
        }

        return ans;
    }
}