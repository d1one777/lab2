package lab2_8;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        final short d = 12;
        short num;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num (up 12)");
        num = sc.nextShort();
        if (num < 1 || num >12)
        {
            System.out.printf(" :( next time");
        }
        else {
            System.out.printf("Congratulation !!!");
        }
    }

}
