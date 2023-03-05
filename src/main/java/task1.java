public class task1 {
    public static void main(String[] args) {
        // Задача 1
        // Дан массив двоичных чисел, например [1,1,0,1,1,1],
        // вывести максимальное количество подряд идущих 1.

        int[] array = {1, 1, 0, 1, 1, 1}; // создание массива явное

        int curr = 0; // счетчик для посчета повторяющихся чисел
        int best = 0; // счетчик для лучшего результата

        for (int i = 0; i < array.length; i++) {
            int a = array[i];
            if (a == 1) {
                curr++;
            }else {
                if (curr > best) {
                    best = curr;
                }
                curr = 0;
            }
        }
        if (curr > best) {
            best = curr;
        }

        System.out.println(best);
    }
}
