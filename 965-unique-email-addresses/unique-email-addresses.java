class Solution {
    public int numUniqueEmails(String[] emails) {

        /*Set<String> ans = new HashSet<>();

        for (int i = 0; i < emails.length; i++) {
            String splitarr[] = emails[i].split("@");
            String localname[] = splitarr[0].split("\\+");
            ans.add(localname[0].replace(".", "") + "@" + splitarr[1]);
        }

        return ans.size();*/

        //ANOTHER MRTHOD
        Set<String> ans = new HashSet<>();
        for(int i = 0 ; i < emails.length ; i++){
            String email = processEmail(emails[i]);

            ans.add(email);
        }

        return ans.size();
  
    }

     private String processEmail(String email){
            int idx = email.indexOf('@');

            StringBuilder sb = new StringBuilder();

            //for loop to enter local name part before domain
            for(int i = 0 ; i < idx ; i++){
                char ch = email.charAt(i);
                if(ch == '+'){
                    break;
                }
                if(ch != '.'){
                    sb.append(ch);
                }
            }

            //append domain part
            sb.append(email.substring(idx));
            return sb.toString();
        }
}