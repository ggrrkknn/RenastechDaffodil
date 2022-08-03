package student.GurkanOzturk;

import java.util.ArrayList;
import java.util.Arrays;

public class lab17 {


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));

        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (!(list.get(i).equals(0))) {
                list1.add(list.get(i));
            }

        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(0)) {
                list1.add(list.get(i));
            }
        }

        System.out.println(list1);


    }
}