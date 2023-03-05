import java.util.Arrays;

public class task2 {
    // Задача 2.
    // Дан массив nums = [1, 2, 2, 3, 1, 5, 3, 1, 3] и число val = 3.
    // Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
    // Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
    // а остальные - равны ему.
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 1, 5, 3, 1, 3};
        int val = 3;

        swap(nums, val); // вызов метода swap, который описан ниже

        System.out.println(Arrays.toString(nums)); // метод для распечатки массива [1, 2, 2, 1, 1, 5, 3, 3, 3]

        for (int x : nums) {
            System.out.print(x + " "); // вывод массива nums в консоль 1 2 2 1 1 5 3 3 3
        }
    }

    // метод, который принимает исходны массив и число val и выполняет перенос чисел равных val
    // в конец массива
    static void swap(int[] array, int val) {
        int size = array.length; // создаем переменную для сокращения кода
        int shift = 1; // переменная сдвига
        for (int i = 0; i < size - shift; i++) { // пробегаем по массиву до длина минус сдвиг
            while (array[size - shift] == val) { // проверяем является ли последний элемент равный val
                shift++;
            }

            if (array[i] == val) { // меняем значение ячеек массива через временную переменную
                int tmp = array[i];
                array[i] = array[size - shift];
                array[size - shift] = tmp;
                shift++;
            }
        }

    }
}
