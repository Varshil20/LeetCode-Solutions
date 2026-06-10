class Solution {
    public boolean rotateString(String s, String goal) {
       if(s.length() != goal.length()){
        return false;
       }

       String doubled = s+s;

       for (int start = 0; start <= doubled.length() - goal.length(); start++) {
            int j = 0;

            while (j < goal.length() && doubled.charAt(start + j) == goal.charAt(j)) {
                j++;
            }

            if (j == goal.length()) {
                return true;
            }
        }

        return false;
    }
}