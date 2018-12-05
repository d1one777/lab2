package lab2_6;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        final double inch = 2.54;
        final double newtone = 9.8;

        double n;
        double s;
        byte b;
        Scanner sc = new Scanner(System.in);
        System.out.println("+++ Welcome to MyCalc +++");
        do
        {
            System.out.println("To do list:");
            System.out.println("1. cm to inch");
            System.out.println("2. speed in vakuum");
            System.out.println("3. exit");
            b = sc.nextByte();
        }while (b < 1 || b >3);
        switch (b) {
            case 1    :
                System.out.println("How much inch convert to cm?");
                n = sc.nextDouble();
                System.out.println(n*inch+" cm");
                break;
            case 2    :
                System.out.println("Please enter speed in m/s: ");
                n = sc.nextDouble();
                System.out.println("Please time in seconds: ");
                s = sc.nextDouble();
                System.out.println(n*s*newtone+" m/s");
                break;
            case 3    :  break;

        }



        //n = sc.nextShort();


    }



}
