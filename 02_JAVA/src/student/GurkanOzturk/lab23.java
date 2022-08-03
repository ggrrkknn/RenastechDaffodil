package student.GurkanOzturk;

import java.util.ArrayList;
import java.util.Arrays;


public class lab23 {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Amed", "Eric", "John", "Eric", "Amed", "Eric"));
        System.out.println(names);

        names.removeAll(Arrays.asList("Eric"));
        System.out.println(names);


    }
}