public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.lengthOfLastWord("hello world"));
        System.out.println(sol.lengthOfLastWord("    fly me     to    the   moon   "));
        System.out.println(sol.lengthOfLastWord("luffy is still joyboy"));
        System.out.println(sol.lengthOfLastWord("this                       is                            a                       lovely        world               "));
    }
}