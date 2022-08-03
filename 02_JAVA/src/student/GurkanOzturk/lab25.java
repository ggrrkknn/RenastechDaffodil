package student.GurkanOzturk;

import java.util.ArrayList;
import java.util.Arrays;


public class lab25 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<>();

        numbers.addAll(Arrays.asList(19, 21, 42, 48, 78, 9, 7, 65, 8, 2));
        for (int i = 0; i <numbers.size() ; i++) {
            for (int j= numbers.size()-1;j>i;j--) {
                if(numbers.get(i)>numbers.get(j)){
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
