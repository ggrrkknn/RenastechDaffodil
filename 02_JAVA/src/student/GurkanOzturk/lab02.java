package student.GurkanOzturk;

import java.util.Arrays;

public class lab02 {
    public static void main(String[] args) {

        System.out.println(same("abc","abb"));
        System.out.println(same("abc","cab"));
    }

    private static boolean same(String word1, String word2) {
        char[] firstWord= word1.toCharArray();
        char[] secondWord= word2.toCharArray();
        for (char ch : firstWord) {
            System.out.println(ch);

        }
        Arrays.sort(firstWord);
        Arrays.sort(secondWord);
        return Arrays.equals(firstWord,secondWord);

    }
}
