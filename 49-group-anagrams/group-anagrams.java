//import java.util.Arrays;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, Integer> map = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();
        int index = -1;

        for (int i = 0; i < strs.length; i++) {
            String crntStr = strs[i];
            String sortedStr = sortString(crntStr);

            if (map.containsKey(sortedStr)) {
                ans.get(map.get(sortedStr)).add(crntStr);
            } else {
                map.put(sortedStr, ++index);
                ans.add(new ArrayList<>());
                ans.get(index).add(crntStr);
            }
        }

        return ans;
    }

    private String sortString(String x) {
        char arr[] = x.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}