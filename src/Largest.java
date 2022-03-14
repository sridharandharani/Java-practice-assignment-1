//wtp to find the largest among 3 numbers.
public class Largest {
    public static void main(String[] args) {
        Integer a = 50 , b = 10 , c = 2 ;
        if (a >= b && a >= c) {
            System.out.println("a is greater");
        }
        else if ( b >= a && b >= c)
        {
            System.out.println("b is greater ");
        }
        else
        {
            System.out.println("c is greater");
        }
    }
}
