package student.GurkanOzturk;

public class lab14 {
    public static void main(String[] args) {
        System.out.println(sumOfDigits("Galatasaray17052000"));
    }

    public  static int  sumOfDigits(String s) {

        int total = 0;

        char[] ch =  s.toCharArray();

        for(char each: ch) {

            if(Character.isDigit(each)) {

                total += Integer.valueOf(""+each);

            }

        }

        return total;

    }
}
