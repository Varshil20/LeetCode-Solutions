class Solution {
    public int romanToInt(String s) {
        int total = 0;

        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);

            if(i < s.length() - 1 && value(ch) < value(s.charAt(i+1))){
                total = total + value(s.charAt(i+1)) - value(ch);
                i++;
            }
            else{
                total += value(ch);
            }
        }

        return total;
    }

    private int value(char ch){
        switch(ch){
            case 'M' :
            return 1000;
         
            case 'D' :
            return 500;
        
            case 'C' :
            return 100;
            
            case 'L' :
            return 50;
            
            case 'X' :
            return 10;
            
            case 'V' :
            return 5;
            
            case 'I' :
            return 1;
            
        }
        return 0;
    }
}