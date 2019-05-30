package leetcode;

import java.util.HashSet;
import java.util.Set;

public class L3 {

    public static void main(String[] args) {

        L3 l3 = new L3();
        int num = l3.lengthOfLongestSubstring("asdfasdfasfdasdfasfasdfasfasdfasdfasfasfasfdasfasdfasfasdfasdfasdf");
        System.out.println("num = " + num);

    }



    /**
     * 官方暴力解决法，思路很清晰啊，学到了取出一段字符串中所有子串的方法，
     * 和判断一个字符串是否有重复字符的方法用（hashset）实现。
     *
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        //这两个for循环取出所有的字符串
        for (int i = 0; i < n; i++) {
            for (int j = i; j <= n; j++) {
                if (allUnique(s, i, j)) {
                    ans = Math.max(ans, j - i);
                }
            }
        }
        return ans;
    }

    public boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet<>();
        for (int i = start; i < end; i++) {
            Character ch = s.charAt(i);
            if (set.contains(ch)) return false;
            set.add(ch);
        }
        return true;
    }

    /**
     * 笨办法
     * 写完之后自己都看不懂了
     * 结果超出了时间限制
     *
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring1(String s) {
        //先找出所有不重复的子串，然后比大小
        int length = s.length();

        System.out.println("length = " + length);
        if (length == 1) {
            return 1;
        }
        char[] chars = s.toCharArray();
        int num = 0;
        int tempJ = 0;
        for (int i = 0; i < chars.length; i++) {
            int tempNum = 0;
            char x = chars[i];
            System.out.println("\n x = " + i + x);
            for (int j = tempJ; j < i; j++) {
                char charJ = chars[j];
                System.out.println("    y = " + j + charJ);
                if (x != charJ) {
                    tempNum = j - tempJ + 2;
                    System.out.println("      tempNum = " + tempNum);
                } else {
                    //两个数相等
                    tempJ = j + 1;
                    tempNum = 1;
                    System.out.println("tempNum = " + tempJ);
                    break;
                }
            }

            if (tempNum > num) {
                num = tempNum;
            }
        }
        return num;
    }

}
