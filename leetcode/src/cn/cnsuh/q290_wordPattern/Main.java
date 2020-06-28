package cn.cnsuh.q290_wordPattern;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String pattern = "abba";
        String str = "dog cat cat dog";

        boolean b = wordPattern(pattern, str);
        System.out.println(b);

    }

    static boolean wordPattern(String pattern, String str) {
        String[] word = str.split(" ");
        HashMap<Character, String> map = new HashMap<>();
        if (word.length != pattern.length()) {
            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {
            char key = pattern.charAt(i);
            if(map.containsKey(key)){
                if(!map.get(key).equals(word[i])){
                    return false;
                }
            }else{
                if(map.containsValue(word[i])){
                    return false;
                }
                map.put(key,word[i]);
            }
        }
        return true;
    }
}
