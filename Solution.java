import java.util.*;
public class Solution {
    public int lengthOfLastWord(String s) {
        List<String> words = new ArrayList<>(); 
        int beginIndex = -1;
        int endIndex = -1;
        int curIndex = 0;
        while (curIndex < s.length()) {
            char curChar = s.charAt(curIndex);
            if (Character.isAlphabetic(curChar) && beginIndex == -1) beginIndex = curIndex;
            
            if (!Character.isAlphabetic(curChar) && beginIndex != -1) {
                endIndex = curIndex + 1;
                words.add(s.substring(beginIndex, endIndex));
                beginIndex = -1;
                endIndex = -1;
            }

            if (curIndex + 1 >= s.length() && beginIndex != -1) {
                endIndex = curIndex + 1;
                words.add(s.substring(beginIndex, endIndex));
                beginIndex = -1;
                endIndex = -1;
            }
            curIndex++;
        }
        
        return words.get(words.size()-1).length();
    }
}
