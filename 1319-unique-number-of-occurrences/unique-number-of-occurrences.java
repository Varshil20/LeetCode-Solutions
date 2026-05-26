class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int freq[] = new int[2001];

        for(int i = 0 ; i < arr.length ; i++){
            freq[arr[i] + 1000]++;
        }

        Set<Integer> set = new HashSet<>();

        for(int i = 0 ; i < freq.length ; i++){
           if (freq[i] > 0) {

                if (set.contains(freq[i])) {
                    return false;
                }

                set.add(freq[i]);
            }
        }
        return true;
    }
}