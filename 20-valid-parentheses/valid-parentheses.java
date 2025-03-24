class Solution  {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{'){
                stack.push(ch);
            }else{
                if(stack.isEmpty()) return false;
                int check = stack.peek();
                if((check == '(' && ch ==')') ||
                    (check == '[' && ch==']') ||
                    (check == '{' && ch=='}')){
                        stack.pop();
                    }else return false;
            }
        }
        if(stack.isEmpty()) return true;
        return false;
    }
}