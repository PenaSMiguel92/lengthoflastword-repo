import java.util.*;
public class Solution {
    public String lengthOfLastWord(String s) {
        List<String> words = new ArrayList<>(); 
        int beginIndex = -1;
        int endIndex = -1;
        int curIndex = 0;
        while (curIndex < s.length()) {
            char curChar = s.charAt(curIndex);
            if (Character.isAlphabetic(curChar) && beginIndex == -1) {
                beginIndex = curIndex;
            } else if ((!Character.isAlphabetic(curChar) || curIndex == s.length() - 1) && beginIndex != -1) {
                endIndex = curIndex;
                words.add(s.substring(beginIndex, endIndex));
                beginIndex = -1;
                endIndex = -1;
            }
            curIndex++;
        }
        
        return words.get(words.size()-1);
    }
}
