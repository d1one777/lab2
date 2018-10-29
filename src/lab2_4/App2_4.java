package lab2_4;

public class App2_4 {
    public static void main(String[] args) {
       /* int cats[];
        cats = new int[8]; */
        //int[] cats = new int[8];
        int[] cats = new int [8];
        for (int i=0; i <8; i++) {
            cats[i]= i;
        }
        //String[] catNames = new String[8];
        String[] catsNames = {
                "Васька",
                "Кузя",
                "Барсик",
                "Мурзик",
                "Леопольд",
                "Бегемот",
                "Рыжик",
                "Матроскин"
        };
        for (int i =0; i<cats.length; i++)
            System.out.println("cat " + i + " = " + cats[i] + " cat name - " + catsNames[i]);

        System.out.println("foreach - - - -");

        for (int i:cats)
        {
            System.out.println("cat " + i + " = " + cats[i] + " cat name - " + catsNames[i]);
            
        }
        }








    }
