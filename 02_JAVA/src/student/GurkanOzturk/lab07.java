package student.GurkanOzturk;

import java.util.Arrays;

public class lab07 {


        public static void main(String[] args) {

            int[] a = {1,2,3};
            int[] b = {4,5,6};

            System.out.println("concat(a,b) = " + concat(a,b));
        }

        public static String concat(int[] a, int[] b) {
            int[] twoOfThem = new int[a.length + b.length];

            for (int i = 0; i < a.length; i++) {
                twoOfThem[i] = a[i];

            }
            for (int i = 0; i < b.length; i++) {
                twoOfThem[a.length + i] = b[i];

            }

            return Arrays.toString(twoOfThem);

        }
}
