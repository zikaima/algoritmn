package cn.cnsuh.q20_isValid;

/**
 * @author Magic
 * @create 2020-07-03 21:53
 */
public class Main {
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }

    static boolean isValid(String s) {
        if (s.contains("()") || s.contains("[]") || s.contains("{}")) {
            return isValid(s.replace("()", "").replace("[]", "").replace("{}", ""));
        } else {
            return "".equals(s);
        }
    }
}
