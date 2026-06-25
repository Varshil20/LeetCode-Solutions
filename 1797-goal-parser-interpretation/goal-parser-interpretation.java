class Solution {
    public String interpret(String command) {
        /*
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < command.length() ; i++){
            char ch = command.charAt(i);

            if(ch == 'G'){
                sb.append('G');
            }
            else{
               int j = i+1;
               String temp = "";

               while(j < command.length() && command.charAt(j) != ')'){
                temp += command.charAt(j);
                j++;
               }

               if(temp == ""){
                sb.append('o');
               }
               else{
                sb.append("al");
               }
                i = j;
            }

           
        }

        return sb.toString(); */

        StringBuilder sb = new StringBuilder();
        
        for(int i = 0 ; i < command.length() ; i++){
            char ch = command.charAt(i);

            if(ch == 'G'){
                sb.append('G');
            }
            else if(ch == '(' ){
                if(command.charAt(i+1) == ')'){
                    sb.append('o');
                }
                else{
                    sb.append("al");
                }
            }
        }
        return sb.toString();
    }
}