package student.GurkanOzturk;

import java.util.Arrays;

public class lab09 {

    public static void main(String[] args) {
        int[] arr = {10,20,7,8,90};
        System.out.println(Arrays.toString(sort(arr)));
    }
    public static int [] sort(int [] arr){

        int temp =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {


                if(arr[i]>arr[j]){

                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;

    }


}

