package loops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        int[] arr = new int[10];
//        int[] arr2 = new int[] {1, 2, 3, 4, 5, 7, 4, 2, 12, 53, 1};
//        String[] arr3 = new String[] {"Hello", "World", "Java"};
//        boolean[] bool = {true, false, true, true};
//        Cat[] cats = {new Cat(), new Cat()};

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        arr2 = Arrays.copyOf(arr1, 20);

        System.out.println(Arrays.toString(arr2));

        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        array[1][2] = 10;

        for (int i = 0 ; i < array.length; i++) {
            for (int j = 0; j < array[1].length; j++) {
                if (array[i][j] == 10) {
                    array[i][j] *= 2;
                }
            }
        }

        System.out.println(Arrays.deepToString(array));
//        arr[0] = 40;
//        arr[9] = 100;
//
//        System.out.println(arr[9]);
//        System.out.println(Arrays.toString(arr));

//        Scanner scanner = new Scanner(System.in);
//
//        while (scanner.nextLine().equals("quit")) {
//            System.out.println("Hello");
//        }

//        do {
//            System.out.println("Hello");
//        } while (scanner.nextLine().equals("quit"));

//        int[][] array = new int[3][3];
//
//
//        for (int i = 0; i < arr2.length - 1; i++) {
//            for (int j = arr2.length - 1; j > i; j--) {
//                if (arr2[j - 1] > arr2[j]) {
//                    int tmp = arr2[j - 1];
//                    arr2[j - 1] = arr2[j];
//                    arr2[j] = tmp;
//                }
//            }
//        }


//        System.out.println(Arrays.toString(arr2));


//        for (int number: arr2) {
//            System.out.println(number);
//        }

//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                array[i][j] = j + i;
//            }
//        }

//        System.out.println(array[1][2]);


//        for (int i = 0; i < arr3.length; i++) {
//            if (arr3[i].equals("World")) {
//                arr3[i] += "2";
//            }
//        }

//        int max = Integer.MAX_VALUE;
//
//        for (int i = 0; i < arr2.length; i++) {
//            if (arr2[i] < max) {
//                max = arr2[i];
//            }
//        }
//
//        System.out.println(max);


//        System.out.println(Arrays.toString(arr));

//        Scanner scanner = new Scanner(System.in);
//
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//
//        var number = a > b ? "string" : 4.5;
//
//        System.out.println(number);


//        switch (a) {
//            case 12:
//            case 1:
//            case 2:
//                System.out.println("Winter");
//                break;
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Spring");
//                break;
//            case 6:
//            case 7:
//            case 8:
//                System.out.println("Summer");
//                break;
//            case 9:
//            case 10:
//            case 11:
//                System.out.println("Fall");
//                break;
//            default:
//                System.out.println("No true answer");
//        }


//        switch (s) {
//            case "Winter":
//                System.out.println("This is winter");
//                break;
//            case "Summer":
//                System.out.println("This is summer");
//                break;
//            case "Fall":
//                System.out.println("This is fall");
//                break;
//            case "Spring":
//                System.out.println("This is spring");
//                break;
//            default:
//                System.out.println("There is no any condition");
//        }

//        if (s.equals("Winter")) {
//            System.out.println("This is winter");
//        } else if (s.equals("Summer")) {
//            System.out.println("This is summer");
//        } else if (s.equals("Fall")) {
//            System.out.println("This is fall");
//        } else if (s.equals("Spring")) {
//            System.out.println("This is spring");
//        }


//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//
//        if (a > b) {
//            int abc = 10;
//            System.out.println("a > b");
//            if (b >= 1) {
//                System.out.println("a");
//            }
//            System.out.println("end of the first if statement");
//        } else {
//            System.out.println("else block first if");
//        }

    }
}