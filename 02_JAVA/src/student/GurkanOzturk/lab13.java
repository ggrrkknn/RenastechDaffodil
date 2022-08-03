package student.GurkanOzturk;
public class lab13 {
    public static void main(String[] args) {

        System.out.println(frequency("sampiyonGalatsaray"));

    }


    public static String frequency ( String word ) {

        String result1="";


        for (int i = 0; i < word.length(); i++) {
            int count1=0;
            for (int a = 0; a < word.length(); a++) {
                if (word.charAt(i) == word.charAt(a))   {  count1++;   } }

            if (! (result1.contains(""+word.charAt(i))))
            { result1 +=word.charAt(i)+" - "+ count1+"\n";  }  }

        return  result1; }
}

