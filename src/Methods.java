import java.util.Arrays;

public class Methods {

    public static void main(String[] args) {

        something();


//        int a = getNumber("",30, 40, 50, 70);

//        System.out.println(getTrueOrFalse(10));

//        int[] array = {1, 2, 3, 4, 5, 6};
//
//        System.out.println(getSumFromArray(array));

//        char[] arr = {'H', 'e', 'l', 'l', 'o'};
//
//        System.out.println(Arrays.toString(getArrayIntFromArrayChar(arr)));

    }

//    public static int[] getArrayIntFromArrayChar(char[] arr) {
//        int[] numbers = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            numbers[i] = arr[i];
//        }
//        return numbers;
//    }


//    public static int getSumFromArray(int[] array) {
//        int sum = 0;
//        for (int i : array) {
//            sum += i;
//        }
//        return sum;
//    }

//    public static boolean getTrueOrFalse(int number) {
//        return number % 2 == 0;
//    }


    public static int getNumber(int a, int b) {
        return a + b;
    }

    public static void getNumber() {
        System.out.println();
    }

    public static int getNumber(int a, long b) {
        return (int) (b - a);
    }

    public static int getNumber(int a) {
        return a;
    }

    public static int getNumber(int a, int b, int c) {
        return a * b * c;
    }

    public static Integer getNumber(String text, int ...b) {
        int sum = 0;
        for (int i = 0; i < b.length; i++) {
            sum += b[i];
        }
        return sum;
    }

    public static void something() {
        int a = getNumber(10, 10);

        int b = getNumber(a, 12L);

        System.out.println(b);
    }
}