class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        /*int res = 0;
        
        for(int i = 0 ;i<items.size();i++){
            if(ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue)) res++;
            if(ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue)) res++;
            if(ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue)) res++;
        }
        
        return res;*/

        int checkIdx = 0;
        int ans = 0;

        if(ruleKey.equals("color")){
            checkIdx = 1;
        }
        else if(ruleKey.equals("name")){
            checkIdx = 2;
        }

        int len = items.size();

        for(int i = 0 ; i < len ; i++){
            if(items.get(i).get(checkIdx).equals(ruleValue)){
                ans++;
            }
        }

        return ans;
    }
}