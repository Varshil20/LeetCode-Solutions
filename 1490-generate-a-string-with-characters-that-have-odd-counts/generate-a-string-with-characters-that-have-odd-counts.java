class Solution {
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();

        if(n % 2 !=0){
            int i = 0;
            while(i < n){
                sb.append('a');
                i++;
            }
        }
        else{
            sb.append('a');
            int i = 1;
            while(i < n){
                sb.append('b');
                i++;
            }
        }

        return sb.toString();
    }
}