class Solution {
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();

        if (n % 2 != 0) {

            sb.append("a".repeat(n));

        } else {
            sb.append("a");

            sb.append("b".repeat(n - 1));
        }

        return sb.toString();
    }
}