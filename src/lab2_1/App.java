package lab2_1;

public class App {
    public static void main(String[] args) {
        int i;
        double d;
        char c;
        byte by;
        short sh;
        long l;
        float f;
        boolean bool;

        System.out.println("Lab 2.1");
        i = 11; //int initialization
        System.out.println("int i = " + i);
        d = 5.5; //double initialization
        System.out.println("double d = " + d);
        c = 'z'; //char initialization
        System.out.println("char c = " + c);
        by = 8; //byte initialization
        System.out.println(by);
        sh = 18; //short initialization
        System.out.println(sh);
        l = 8; //long initialization
        System.out.println(l);
        f = 2.2f; //float initialization
        System.out.println(f);
        bool = false; //initialization
        System.out.println(bool);

        System.out.println(Integer.toHexString(i));
        System.out.println(Double.toHexString(d));
        System.out.println(Integer.toHexString(by));
        //The 8-bit byte, which is signed in Java, is sign-extended to a 32-bit int
        System.out.println(Integer.toHexString(sh));
        //Integer is of 32 bit, and Short is of 16 bit
        System.out.println(Long.toHexString(l));
        System.out.println(Float.toHexString(f));


    }
}