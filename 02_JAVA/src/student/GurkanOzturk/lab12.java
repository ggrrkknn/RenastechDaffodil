package student.GurkanOzturk;

import java.util.Scanner;

public class lab12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        evenOdd(input.nextInt());
    }

    public static void evenOdd(int number){
        System.out.println((number % 2 == 0) ? number+" is Even Number" : number +" is Odd Number");
    }

}
