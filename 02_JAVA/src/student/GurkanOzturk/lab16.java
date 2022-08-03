package student.GurkanOzturk;

public class lab16 {
    public static void main(String[] args) {
        System.out.println("verifyPassword(\"Galatasaray1905****\") = " + verifyPassword("Galatasaray1905****"));
    }

    public static boolean verifyPassword(String a)
    {


        boolean atLeast6 = false; //completed
        boolean containSpace = false;
        boolean oneUpper = false;
        boolean oneLower = false;
        boolean oneSpecial = false;
        boolean digit=false;


        for(int i=0;i<a.length();i++)
        {

            int ascii = a.charAt(i);
            if(ascii<=90 && ascii>=65)
            {
                oneUpper = true;

            }
            else if(ascii>=97 && ascii<=122)
            {
                oneLower = true;
            }

            else if(ascii<=57 && ascii>=48)
            {
                digit = true;
            }
            else if(ascii == 32)
            {
                containSpace =true;
            }

            else
            {
                oneSpecial = true;
            }

        }
        if(a.length()>=6)
        {
            atLeast6=true;

        }

        return atLeast6 && oneUpper && oneLower && oneSpecial && digit;
    }
}
