package cn.cnsuh.q67_addbinary;

/**
 * @author Magic
 * @create 2020-06-23 12:15
 */
public class Main {
    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";

        String res = addBinary(a, b);
        System.out.println(res);
    }

    static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int ca = 0;//进位
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
            int sum = ca;
            sum += i >= 0 ? a.charAt(i) - '0' : 0;
            sum += j >= 0 ? b.charAt(j) - '0' : 0;
            sb.append(sum % 2);
            ca = sum / 2;
        }
        sb.append(ca == 1 ? ca : "");
        return sb.reverse().toString();
    }
}
