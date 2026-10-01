class Solution {
    public boolean isValid(String l) {
        Stack<Character> s=new Stack<>();
        for(char a : l.toCharArray())
        {
            switch(a)
            {
                case '(','{','[' ->{
                    s.push(a);
                    break;
                }
                case ')' ->
                {
                    if(!s.isEmpty() && s.peek()=='(')  s.pop();
                    else return false;
                    break;
                }
                
                case ']' ->
                {
                    if(!s.isEmpty() && s.peek()=='[')  s.pop();
                    else return false;
                    break;
                }
                
                case '}' ->
                {
                    if(!s.isEmpty() && s.peek()=='{')  s.pop();
                    else return false;
                    break;
                }
                
            }
        }
        return s.isEmpty() ? true : false;

    }
}