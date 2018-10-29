package lab2_7;

import java.io.PrintStream;

public class App {
    public static void main(String[] args) {

        int a;
        int b;
        int c;
        //initial HEX start 0x..

        a= 0xba;
        b= 0xca;
        c= 0xff;
        ///out
        //System.out.println(" 1 ");
        System.out.println(" a (dec) = " + a);
        System.out.println(" b (dec) = " + b);
        System.out.println(" c (dec) = " + c);
        ///operation
        /*
        a << 1; // беззнаковый сдвиг влево, эквивалентно умножению на 2
        a >> 1; // сдвиг вправо с учётом знака (эквивалентно делению на 2)
        a >>> 1; // сдвиг вправо без учёта знака (эквивалентно беззнаковому делению на 2)
        */
        System.out.println(String.valueOf("(a << 1)" + (int) (a << 1))); // *2
        System.out.println(String.valueOf((int) (a >> 1))); // /2
        System.out.println(String.valueOf((int) (a >>> 1))); // /2

        System.out.println(String.valueOf((byte) (b << 1))); // *2
        System.out.println(String.valueOf((byte) (b >> 1))); // /2
        System.out.println(String.valueOf((byte) (b >>> 1))); // /2


    }
}
