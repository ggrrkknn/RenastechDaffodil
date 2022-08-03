package student.GurkanOzturk;

import java.util.Scanner;

public class lab21 {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");


        int number1 = input.nextInt();

        System.out.println("Enter second number");

        int number2 = input.nextInt();

        if (number2 == 0) {
            System.out.println("Number can not be divided by 0");
        }
        int count = 0;

        while (number1 >= number2) {
            number1 -= number2;
            count++;
        }
        System.out.println(count);


    }
}