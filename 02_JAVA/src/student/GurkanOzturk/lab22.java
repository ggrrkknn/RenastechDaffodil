package student.GurkanOzturk;

public class lab22 {

        public static void main(String[] args) {

            int a = -1905;
            System.out.println("reverseNegative(a) = " + reverseNegative(a));
        }

        public static int reverseNegative(int a) {
            int reverse = 0;
            while (a != 0) {
                int reminder = a % 10;
                reverse = reverse * 10 + reminder;
                a /= 10;
            }
            return reverse;
        }

    }
