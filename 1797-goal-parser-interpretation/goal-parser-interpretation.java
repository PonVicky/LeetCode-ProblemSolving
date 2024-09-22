class Solution {
    public String interpret(String command) {
     String out  = "";
     for(int i=0;i<command.length();i++){
        char ch = command.charAt(i);
        if(ch=='G'){
            out+="G";
        }else if(ch == '('){
            char c =  command.charAt(i+1);
            if(c==')'){
                out+="o";
            }else if(c=='a'){
                out+="al";
            }
        }
     }   
         return out;

    }
}