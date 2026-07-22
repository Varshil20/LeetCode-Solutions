class Solution {
    public int compress(char[] chars) {

        //HIGH TIME COMPLEXITY

        /*StringBuilder sb = new StringBuilder();
        int grouplen = 1;

        for(int i=1 ; i<=chars.length ; i++){
            if(i<chars.length && chars[i] == chars[i-1]){
                grouplen++;
            }
            else{
                sb.append(chars[i-1]);

                if(grouplen > 1){
                    sb.append(grouplen);
                }

                grouplen = 1;
            }

        }

        for(int i=0 ; i<sb.length() ;i++){
            chars[i] = sb.charAt(i);
        }

        return sb.length();*/

        int i=0;
        int idx=0;
        
        while(i<chars.length){
            int grouplen = 0;
            while(i+grouplen < chars.length && chars[i] == chars[i+grouplen]){
                grouplen++;
            }

            chars[idx] = chars[i];
            idx++;

            if(grouplen > 1){
                char temp[] = Integer.toString(grouplen).toCharArray();

                for(int k=0 ; k < temp.length ; k++){
                    chars[idx] = temp[k];
                    idx++;
                }
            }

            i = i + grouplen;


        }

        return idx;
    }
}