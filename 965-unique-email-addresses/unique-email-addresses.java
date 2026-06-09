class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> ans = new HashSet<>();

        for (int i = 0; i < emails.length; i++) {
            String splitarr[] = emails[i].split("@");
            String localname[] = splitarr[0].split("\\+");
            ans.add(localname[0].replace(".", "") + "@" + splitarr[1]);
        }

        return ans.size();
    }
}