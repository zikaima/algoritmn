package cn.cnsuh.q299_getHint;

import java.util.HashMap;

/*     输入: secret = "1807", guess = "7810"
        输出: "1A3B"
        解释: 1 公牛和 3 奶牛。公牛是 8，奶牛是 0, 1 和 7。

        来源：力扣（LeetCode）
        链接：https://leetcode-cn.com/problems/bulls-and-cows
        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
public class Main {
    public static void main(String[] args) {
        String secret = "11";
        String guess = "10";

        String hint = getHint(secret, guess);
        System.out.println(hint);
    }

    static String getHint(String secret, String guess) {
        HashMap<Character, Integer> map = new HashMap<>();
        boolean[] flag = new boolean[guess.length() + 1];

        int ca = 0;
        int cb = 0;
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                ca++;
                flag[i] = true;
                continue;
            }
            if (!map.containsKey(secret.charAt(i))) {
                map.put(secret.charAt(i), 1);
            } else {
                map.put(secret.charAt(i), map.get(secret.charAt(i)) + 1);
            }
        }
        for (int i = 0; i < guess.length(); i++) {
            if (flag[i] == false && map.containsKey(guess.charAt(i)) && map.get(guess.charAt(i)) > 0) {
                cb++;
                map.put(guess.charAt(i), map.get(guess.charAt(i)) - 1);
            }
        }
        return ca + "A" + cb + "B";
    }
}
