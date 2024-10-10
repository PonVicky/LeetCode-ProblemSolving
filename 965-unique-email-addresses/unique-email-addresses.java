class Solution {
    public int numUniqueEmails(String[] emails) {
        HashMap<String,Integer> map = new HashMap<>();
        for(String str : emails){
            String domain = "";
            String local = "";
            String email = "";
            boolean check = true, check2 = false;
            for(int i=0;i<str.length();i++){
                char ch = str.charAt(i);
                if(ch == '@') check2=  true;
                if(ch!='@' && check){
                    if(ch == '.'){
                        continue;
                    }else if(ch =='+'){
                        check = false;
                        continue;
                    }
                    local+=ch;
                }else if(check2){
                    check = false;
                    domain += ch;
                }
            }
            email = local+domain;
            if(domain.length() >= 6){
                map.put(email,1);
            }
        }

        return map.size();
    }
}