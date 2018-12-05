package lab2_8;

import java.util.Arrays;

public class App_test {

    public static void main(String[] args) {
        int n=20,i,num;
        int mas[] = new int [n+1];
        for (i=1;i<=mas.length-1;i++)
            mas[i]=i;
        System.out.println(Arrays.toString(mas));
        for (num=1;num<=mas.length-1;num++){
            System.out.println("--start loop 1 num= " + num);

            for(i=2;i<=n-1;i++){
                System.out.println("--start loop 2 num= " + num + "i = " + i );
                if ((mas[num]!=i) & (mas[num]%i==0)) {
                    System.out.println("Ura IF mas[num]!=i " + mas[num] + " " + i + " mas[num]%i==0");
                    mas[num] = 0;
                }
            }
        }
        for (num=1;num<=mas.length-1;num++)
            if (mas[num]!=0)
                System.out.println("№i= "+num+" i= "+mas[num]);
        System.out.println(Arrays.toString(mas));


    }

}
