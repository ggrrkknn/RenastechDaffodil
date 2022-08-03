package student.GurkanOzturk;

public class lab04 {
    public static void main(String[] args) {

        String unique="AAABBBCCCDEF";

        String answer="";

        for (int i = 0; i < unique.length() ; i++) {
            int count=0;

            for (int j = 0; j <unique.length() ; j++) {

                if (unique.charAt(i)==unique.charAt(j)){
                    count++;
                }
            }
            if (count==1){
                answer+=unique.charAt(i);
            }
        }
        System.out.println("answer = " + answer);
}}
