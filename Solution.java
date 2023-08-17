import java.util.*;
public class Solution {
    public int lengthOfLastWord(String s) {
        String[] sb = s.split(" ");
        return sb[sb.length - 1].length();
    }
}
