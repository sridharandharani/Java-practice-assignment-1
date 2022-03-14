//wtp to find reverse of a number
public class Reverse {
    public static void main(String[] args) {
        Integer num = 1234, rev = 0 , rem;
        while (num != 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        System.out.println("The reverse of the given number is: " + rev);
    }
}
