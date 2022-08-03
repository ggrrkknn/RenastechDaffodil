package student.GurkanOzturk;

public class lab10 {
    public static void main(String[] args) {
        printSomething();
    }

    public static void printSomething(){

        for(int i=1;i<=30;i +=2)
        {
            if(i%3==0&&i%5 ==0)
            {
                System.out.println(i+"RA");
            }
            else if(i%5==0)
            {
                System.out.println(i+"FIN");
            }
            else {
                System.out.println(i+"FINRA");
            }

        }
    }
}
