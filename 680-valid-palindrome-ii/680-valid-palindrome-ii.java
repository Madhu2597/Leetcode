class Solution {
private static boolean isPalindrome(String s, int i, int j){
      while(i<j){
        if(s.charAt(i)==s.charAt(j)){
            i++;
            j--;
        }
        else{
            //return isPalindrome(s,i+1,j) || isPalindrome(s, .j-1);
            return false;
            }
        }
        return true;
    
  }
  public static boolean validPalindrome(String s) {
    // write your code here
    int i=0;
    int j=s.length()-1;
    while(i<j){
        if(s.charAt(i)==s.charAt(j)){
            i++;
            j--;
        }
        else{
            return isPalindrome(s,i+1,j) || isPalindrome(s,i,j-1);
        }
    }
    return true;
  }
}