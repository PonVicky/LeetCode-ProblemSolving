import java.util.Hashtable;

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        int len = words.length;
        if(len  == 1){
            return 1;
        }
         Hashtable<Character,String> map = new Hashtable<>();
        map.put('a',".-");
        map.put('b',"-...");
        map.put('c',"-.-.");
        map.put('d',"-..");
        map.put('e',".");
        map.put('f',"..-.");
        map.put('g',"--.");
        map.put('h',"....");
        map.put('i',"..");
        map.put('j',".---");
        map.put('k',"-.-");
        map.put('l',".-..");
        map.put('m',"--");
        map.put('n',"-.");
        map.put('o',"---");
        map.put('p',".--.");
        map.put('q',"--.-");
        map.put('r',".-.");
        map.put('s',"...");
        map.put('t',"-");
        map.put('u',"..-");
        map.put('v',"...-");
        map.put('w',".--");
        map.put('x',"-..-");
        map.put('y',"-.--");
        map.put('z',"--..");

        int count  = 0;
        String[] out = new String[len];
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<len;i++){
            out[i] = "";
            for(int j=0;j<words[i].length();j++){
                out[i]+=map.get(words[i].charAt(j));
            }
        }
        for(int i=0;i<len;i++){
            if(set.contains(out[i])){
                
            }else{
            count++;
            set.add(out[i]);
            }
        }

    return count;


    }
}