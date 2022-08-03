package student.GurkanOzturk;

import java.util.Scanner;

public class lab18 {
    public static int findFactorial(int number) {

        int i, fact = 1;
        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to find factorial = ");
        num = sc.nextInt();
        System.out.println("Factorial " + num + "! 3is: " + findFactorial(num));
    }
}
