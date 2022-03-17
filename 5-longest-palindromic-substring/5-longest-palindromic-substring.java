class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<=1) return s;
        
        int max_len=1;
        int start=0,end=0;
        for(int i=0;i<s.length()-1;++i){
            int left=i,right=i;
            while(left>=0 && right<s.length()){
                if(s.charAt(left)==s.charAt(right)){
                    left--;right++;
                }
                else 
                    break;
            }
            int len=right-left-1;
            if(len>max_len){
                max_len=len;
                start=left+1; end=right-1;
            }       
        }
        for(int i=0;i<s.length()-1;++i){
            int left=i,right=i+1;
            while(left>=0 && right<s.length()){
                if(s.charAt(left)==s.charAt(right)){
                    left--;right++;
                }
                else 
                    break;
            }
            int len=right-left-1;
            if(len>max_len){
                max_len=len;
                start=left+1; end=right-1;
            }       
        } 
        return s.substring(start,end+1);           
    }
}