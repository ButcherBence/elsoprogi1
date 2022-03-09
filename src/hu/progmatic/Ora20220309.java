package hu.progmatic;

import java.util.Scanner;

public class Ora20220309 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*System.out.println("Adj meg 3 számot");
        int szam1 = scanner.nextInt();
        int szam2 = scanner.nextInt();
        int szam3 = scanner.nextInt();
        System.out.println("A három szám :" + szam1 + " "+ szam2 + " " + szam3);
        System.out.println("A három szám összege: " + (szam1+szam2+szam3));*/


        //////   TÖMB = ARRAY

        //int[] array;

        // "üres" tömb
        //int[] numbers = new int[5]; // ennek a tömbnek a tartalma : 0,0,0,0,0

        /*

         */
        /*int[] numbers = new int[5];

        numbers[0] = 33;
        numbers[1] = 22;
        numbers[2] = 44;
        numbers[3] = 55;
        numbers[4] = 66;

        numbers[3] = 10; // Bárhányszor módosíthatom a tömb elemét

        //Akár így is ->

        numbers[0] = numbers[1] + numbers[2];
        numbers[0] += 1;*/

        /*System.out.println("eredeti érték: " + numbers [0]);
        numbers[0] = 42;
        System.out.println("módosított érték: "+ numbers [0]);*/



        /*int[] numbers2 = new int[]{1, 2, 3, 4, 5};  /// Ez a kettő ekvivalens
        int[] numbers3 = {6, 7, 8, 9, 10};          /// Ez a kettő ekvivalens*/

       /* double[] doubles = new double[2];
        boolean[] booleans = new boolean[2];
        String[] Strings = new String[2];
        System.out.println(doubles[0]);
        System.out.println(booleans[0]);
        System.out.println(Strings[0]);

        System.out.println("Adj meg 5 számot!");
        int[] numbers3 = new int[5];
        numbers3[0] = scanner.nextInt();
        numbers3[1] = scanner.nextInt();
        numbers3[2] = scanner.nextInt();
        numbers3[3] = scanner.nextInt();
        numbers3[4] = scanner.nextInt();
        int sum = numbers3[0] + numbers3[1] + numbers3[2] + numbers3[3] + numbers3[4];
        System.out.println("A számok összege: " + sum);*/



        /*//JAVA EXCEPTIONS!!!!

        String s = null;
        System.out.println(s.length());
        char[] chars = new char[10];
        System.out.println(chars[10]);*/

        /*int[] number2 = {1,2,3,4,5};

        int index = 0;
        while (index < 5) {
            System.out.println(number2[index]);
            index++;*/



        /*System.out.println("Hány számot szeretnél megadni?");
        int userValue = scanner.nextInt();
        int[] numbers = new int[userValue];
        int index = 0;
        System.out.println("Add meg a számaid! ( Összesen " + userValue + " darab számot");
        while (index < numbers.length){
            numbers[index]= scanner.nextInt();
            index++;
        }
        index = 0;
        while (index < numbers.length){
            System.out.println(numbers[index]);
            index++;
        }
        System.out.println(numbers[numbers[0]]);
        System.out.println(numbers[numbers.length-index]);*/

        /*//
        int[] numbers3 = {2 , 4 ,6 ,8 ,10 ,12};
        System.out.println(numbers3[numbers3.length-1]);*/

        String[] strings = {"első", "második", "harmadik", "negyedik", "ötödik", "hatodik", "hetedik"};
        int index = 0;
        while (index < strings.length){
            System.out.println(strings[index]);
            index += 2;
        }
        index = 0;
        while (index < strings.length){
            index++;
            System.out.println(strings[strings.length-index]);

        }
        int[] years = {1999, 1988, 2006, 1743, 965, 2022, 1349, 1582, 1222, 1876, 2001, 1946, 1482};
        index = 0;
        while (index < years.length){
            if (years[index]>1582){
                System.out.println(years[index]);
            }
            index++;
        }
    }
}
