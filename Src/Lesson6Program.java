import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson6Program {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter number");
        int n = scanner.nextInt();
        System.out.println("please enter number");
        int m = scanner.nextInt();
        int[][] matrix = new int[m][n];
        int[][] matrix2 = new int[n][m];

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("please enter number");
//        int userNum = scanner.nextInt();
//        System.out.println(userNum);
//        int randNum = random.nextInt(8) + 2;
//        System.out.println(randNum);
//        //int[][] array2d = new int[][]{{1,2,3}, {1,2,3,4}, {1,2,3}, {1,2,3}};
//
//        int[][] array2d = new int[5][4];
//        int arrayLen = 5;
//        for (int i = 0; i < array2d.length; i++) {
//            array2d[i] = new int[arrayLen];
//            if(arrayLen >= 5){
//                arrayLen++;
//            }
//            if (arrayLen >6){
//                arrayLen = 4;
//            }
//        }
//
//        for (int i = 0; i < array2d.length; i++) {
//            for (int j = 0; j < array2d[i].length; j++) {
//                array2d[i][j] = random.nextInt(10);
//            }
//        }
//
//        for (int i = 0; i < array2d.length; i++) {
//            for (int j = 0; j < array2d[i].length; j++) {
//                System.out.print(array2d[i][j] + ",\t");
//            }
//            System.out.println();
//        }

//        String str = "GFG";
//        String str2 = "GFG";
//        String str3 = new String("GFG");
//
//        char[] chars = str.toCharArray();
//        String str4 = new String(chars);
////        System.out.println(Arrays.toString(chars));
////        System.out.println(str4);
//        char[] chars1 = ("10" + "1").toCharArray();
//        System.out.println(Arrays.toString(chars1));
//        System.out.println(10 + 1);
//        System.out.println("10" + "1");
        //System.out.println(str.equals(str3));

//        int[] array = new int[100];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(100);
//        }
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//
//        for (int index = 0; index < array.length / 2; index++) {
//            int temp = array[index];
//            array[index] = array[array.length - index - 1];
//            array[array.length - index - 1] = temp;
//        }
//        System.out.println(Arrays.toString(array));
//        for (int i = array.length - 1; i >= 0; i--) {
//            System.out.print(array[i] + ", ");
//        }

//        int elementToSearch = 87;
//        int firstIndex = 0;
//        int lastIndex = array.length - 1;
//
//        // умова зупинки
//        while (firstIndex <= lastIndex) {
//            int middleIndex = (firstIndex + lastIndex) / 2;
//            // якщо середній елемент - цільовий елемент, вернути його індекс
//            if (array[middleIndex] == elementToSearch) {
//                System.out.println("find element = " +elementToSearch +
//                        " index = " + middleIndex);
//                break;
//            }
//
//            // якщо середній елемент менший
//            // прирівнюємо наш індекс в middle+1, прибираючи першу частину для перебирання
//            else if (array[middleIndex] < elementToSearch) {
//                firstIndex = middleIndex + 1;
//            }
//            // якщо середній елемент більший
//            // прирівнюємо наш індекс в middle-1, прибираючи другу частину для перебирання
//            else if (array[middleIndex] > elementToSearch) {
//                lastIndex = middleIndex - 1;
//            }
//        }


//        for (int index = 0; index < array.length; index++) {
//            if (array[index] == elementToSearch) {
//                System.out.println("find element = " +elementToSearch +
//                        " index = " + index);
//
//            }
//        }


        //int[] array = new int[]{6, 3, 4, 8, 1, 0, 13, 7};
        //System.out.println(Arrays.toString(array));
        //Arrays.sort(array);
//        for (int i = 0; i < array.length; i++) {
//            for (int j = array.length - 1; j > i ; j--) {
//                if(array[i] < array[j]) {
//                    int temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//                }
//            }
//        }
       // System.out.println(Arrays.toString(array));
    }
}
