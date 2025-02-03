class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(stack.isEmpty()){
                stack.push(ch);
                list.add(i);
                continue;
            }

            if(stack.peek() == '(' && ch == ')'){
                stack.pop();
                if(stack.isEmpty()) list.add(i);
            }else{
                stack.push(ch);
            }
        }
        String str = "";
        for(int i=0;i<list.size();i+=2){
            str+=s.substring(list.get(i)+1,list.get(i+1));
        }

        return str;

    }
}