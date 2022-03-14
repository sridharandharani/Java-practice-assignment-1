//wtp to check whether a year is leap year or not
public class Leapyear {
    public static void main(String[] args) {
        Integer year = 2012;
        if (year % 4 == 0)
        {
            System.out.println("the year is leap year");
        }
        else
        {
            System.out.println("not a leap year");
        }
    }
}
