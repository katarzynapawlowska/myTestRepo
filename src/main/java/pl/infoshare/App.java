package pl.infoshare;

import java.util.Random;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
//        int result = 10 + 5;
//        System.out.println(result);
//        String name = "Kasia";
//        String lastname = "Pawlowska";
//        double a = 90.99;
//        System.out.println(a);
//        int b = (int) a;
//        System.out.println(b);
//        char c = 'a';
//        System.out.println(c);
//        int d = (int) c;
//        System.out.println(d);
//        System.out.println(b / a + d + "Wynik to: " + (b / a + d));
//
//        short wiekBis = 19;
//        System.out.println("Wiek wiekszy od 18? : " + (wiekBis > 18 ? "TAK" : "NIE"));
//
//        byte age = 26;
//        if (age >= 20 && age <= 30) {
//            System.out.println("Wiek jest wiekszy rowny 20 lat i mniejszy rowny 30");
//        }
//        if (age == 26 || age == 28) {
//            System.out.println("Wiek jest rowny 26 lat lub 28");
//        } else if (age == 25) {
//            System.out.println("Wiek jest rowny 25)");
//        }
//
//        if (true) {
//
//        }
//
//        int agePrim = 24;
//        switch (agePrim) {
//            case 20:;{
//                System.out.println("Wiek jest rowny 20");
//                break;
//            }
//            case 22: {
//                System.out.println("Wiek inny");
//            }
//                case 23: {
//                    System.out.println("Wiek inny");
//                }
//            case 24: {
//                System.out.println("Wiek inny");
//
//            }
//                case 25: {
//                    System.out.println("Wiek inny");
//                }
//            case 26: {
//                System.out.println("Wiek inny");
//            }
//            case 27: {
//                System.out.println("Wiek inny");
//            }
//
//            case 30: {
//                System.out.println("Wiek jest rowny 30");
//                break;
//            }
//            default: {
//                System.out.println("Po prostu jestes stary");
//            }
//        }
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Podaj swoj wiek: ");
//        String ageFromKeyboard = scanner.nextLine();
//
//    System.out.println("Podales: "+ ageFromKeyboard);
//
        /*
        zadanie 1
         */

//        int[] array = new int[6];
//
//                array[0] = 5
//                array[1] = 7
//                array[2] = 0
//                array[3] = 3
//                array[4] = 5
//                array[5] = 6
//
//                        System.out.println("Elementy: " + array[0] + " " + array[2] + " " + array[4]);
//        System.out.println(array[6]);
//

//        System.out.println("1" + "2" + "3" + "4" + "5" + "6" + "7" + "8" + "9" + "10");
//        for(int i = 1 ; i < 1001 ; i++){System.out.println( i );}
//
//        for (int i = 2000 ; i>0 ; i--){System.out.println(i);}
//
//        int i = 1;
//        while ( i < 1001 ){System.out.println( i );
//        i++;}
//
//        int[] arrayFor = new int[1000];
//        for (i = 0; i <1000 ; i++){arrayFor[i] = i + 1;}
//        for (int element : arrayFor){System.out.println(element);}


//        int[][] array2D = new int[10][10];
//        for (int i = 0; i < array2D.length ; i++);{
//            System.out.println("I'm in row no. " + i);
//        }
//            for (int j = 0 ; j <array2D.length ; j++);{
//                System.out.println("I'm in column no. " + j);
//            }
//
//            for (i = 1; i <array2D.length + 1 ; i++){
//                System.out.println(i + ". ");
//                for (int j = 1 ; j <array2D.length ; j++){
//                    System.out.println(j + " ");
//                }
//                System.out.println();
//            }


//        int[][] array2DFor = new int[10][10];
//        for(int i = 0; i< array2DFor.length; i++){
//            for(int j = 0;j < array2DFor.length; j++){
//                array2DFor[i][j] = j + 1;
//            }
//        }
//
//        for(int[] oneDimarray : array2DFor){
//            for(int singleElem: oneDimarray){
//                System.out.println();
//            }
//        }

        int[] array = new int[11];
        Random random = new Random();
        int randomInt = random.nextInt(100) + 1;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) System.out.println(array[i]);
        }


        char[][] array2DTask = new char[10][10];

        for (int i = 0; i < array2DTask.length; i++) {
            for (int j = 0; j < array2DTask.length; j++) {
                array2DTask[i][j] = '*';

            }
        }

        for (int i = 0; i < array2DTask.length; i++) {
            for (int j = 0; j < array2DTask.length; j++) {
                if (i % 2 == 0) System.out.print(array2DTask[i][j]);
                else System.out.print(" ");
            }
            System.out.println();

        }

        int winningNumber = new Random();

        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("Podaj liczbe od 1 do 10: ");
            int userNumber = scanner.nextInt();

            if (userNumber < 1 || userNumber > 10) {
                System.out.println("Podales liczbe z innego przedzialu ");

            }

            if (userNumber == winningNumber) System.out.println("Wygrales ");
            break;
        }
        else System.out.println("Graj dalej ");






    }
}


