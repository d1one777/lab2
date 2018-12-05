package lab2_10;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter lenght of array: ");
        n = sc.nextInt();
        System.out.println(n);
        int[] arr;
        arr = new int[n];
        System.out.println("arr.length = " + arr.length);
        arr_fill(arr);
        arr_print(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 1; i <=arr.length; i++) {
            System.out.println("--start loop i = " + i);

            for (int element = 2; element <= n - 1; element++) {
                System.out.println("--start second loop i = " + i + "element = " + element);
                if ((arr[element] != i) & (arr[element]%i==0))
                    System.out.println("ura IF");
                {arr[element]=0;}

            }
        }
        System.out.println(Arrays.toString(arr));

    }



     static void arr_fill(int[] arr) {
         for (int i=1; i<=arr.length; i++)
         {
             arr[i-1] = i;
             System.out.println(i);

         }

    }

    static void arr_print(int[] arr)
    {
        System.out.println(Arrays.toString(arr));

    }
}
