class Solution {
    public String removeTrailingZeros(String num) {
        String ans = "";
        int i = num.length()-1 ;
        for(;i>=0 && num.charAt(i) == '0' ; i--);
        if(i==num.length()-1)
            return num ;
        ans = num.substring(0,i+1);
        return ans ;
    }
}