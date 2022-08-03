package student.GurkanOzturk;

public class lab06 {
    public static void main(String[] args) {
        int [] n2={2,6,7,1,99,33};
        min(n2);
    }

    public static void min(int[] n2){

        int minNumber=n2[0];

        for (int i = 0; i < n2.length; i++) {

            if(n2[i]<minNumber){

                minNumber=n2[i];
            }
        }
        System.out.println(minNumber);

    }
}
