class Solution {
    public String reorderSpaces(String text) {
        int spaces = 0;
        int words = 0;
        int i = 0;

        // Count spaces and words
        while (i < text.length()) {

            if (text.charAt(i) == ' ') {
                spaces++;
                i++;
            }
            else {

                while (i < text.length() && text.charAt(i) != ' ') {
                    i++;
                }

                words++;
            }
        }

        int divide = 0;
        int extra = 0;

        if (words > 1) {
            divide = spaces / (words - 1);
            extra = spaces % (words - 1);
        } else {
            extra = spaces;
        }

        text = text.trim();

        StringBuilder sb = new StringBuilder();

        int j = 0;

         while (j < text.length()) {

            if (text.charAt(j) != ' ') {
                sb.append(text.charAt(j));
                j++;
            }
            else {

                sb.append(" ".repeat(divide));

                while (j < text.length() && text.charAt(j) == ' ') {
                    j++;
                }
            }
        }

        sb.append(" ".repeat(extra));

        return sb.toString();
    }
}