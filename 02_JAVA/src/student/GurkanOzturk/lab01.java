package student.GurkanOzturk;

import java.util.Scanner;

public class lab01 {
    public static void main(String[] args) {

        Scanner elements = new Scanner(System.in);
        System.out.println("Enter String Word : ");

        String  word = elements.nextLine();

        for(int i=word.length()-1 ; i>=0; i--) {

            System.out.print(word.charAt(i));
        }
    }
}

