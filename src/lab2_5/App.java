package lab2_5;

import java.util.Scanner;

public class App {
    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
        THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        short d;
        Scanner sc = new Scanner(System.in);
        //d = sc.nextShort();
        do
        {
            System.out.println("please enter 1-7 value");
            d = sc.nextShort();
        }while (d < 1 || d >7);
        switch (d) {
            case 1    : System.out.println(Day.MONDAY); break;
            case 2    : System.out.println(Day.TUESDAY); break;
            case 3    : System.out.println(Day.WEDNESDAY); break;
            case 4    : System.out.println(Day.THURSDAY); break;
            case 5    : System.out.println(Day.FRIDAY); break;
            case 6    : System.out.println(Day.SATURDAY); break;
            case 7    : System.out.println(Day.SUNDAY); break;
        }

    }
}
