class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(s.charAt(i)=='('|| s.charAt(i)=='{' || s.charAt(i)=='[')
                st.push(s.charAt(i));
            else if(ch==')'||ch=='}'||ch==']'){
                if(st.size()==0)
                    return false;
                else if(ch==')')
                {
                    if(st.peek()!='(')
                    return false;
                }
                else if(ch=='}')
                {
                    if(st.peek()!='{')
                    return false;
                }
                else if(ch==']')
                {
                    if(st.peek()!='[')
                    return false;
                }
                st.pop();
            }
            
        }
        if(st.size()==0)
            return true;
        else
            return false;
        
            
    }
}