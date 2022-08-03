package student.GurkanOzturk;

import java.util.ArrayList;
import java.util.Arrays;


public class lab26 {
    public static void main(String[] args) {


        ArrayList<Integer> numbers=new ArrayList<>();

        numbers.addAll(Arrays.asList(35, 91, 55, 42, 34, 9, 2, 75, 1, 5));
        for (int i = 0; i <numbers.size() ; i++) {
            for (int j= numbers.size()-1;j>i;j--) {
                if(numbers.get(i)<numbers.get(j)){
                    Integer temp= numbers.get(i);
                    numbers.set(i, numbers.get(j));
                    numbers.set(j,temp);
                }
            }
        }for(int i:numbers){
            System.out.print(i+",");
        }
    }
}