class Solution {
    public int countSegments(String s) {

        String str = s.trim();

        if (str.length() == 0) {
            return 0;
        }

        int segments = 1;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                segments++;
                while (i < str.length() && str.charAt(i) == ' ') {
                    i++;
                }
            }
        }
        return segments;
    }
}