import java.util.Arrays;
import java.util.Random;

public class tack4 {

    // создание рандомного двумерного массива

    public static void main(String[] args) {
        int[][] array = new int[4][4];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10); // заполнение массива рандомными значениями от 0 до 9
            }
        }

        // вывод в консоль двумерного массива

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(array)); // выриант вывода массива массивов
    }
}
