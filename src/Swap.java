//wtp to swap 2 number
public class Swap {
    public static void main(String[] args) {
        Integer a = 10 , b = 5 , c ;
        System.out.println("before swap");
        System.out.println("the first number :" + a);
        System.out.println("the second number :" + b);
        c = a ;
        a = b ;
        b = c ;
        System.out.println("after swap");
        System.out.println("the first number :" + a);
        System.out.println("the second number :" + b);
    }
}
