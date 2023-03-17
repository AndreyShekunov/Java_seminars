import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework3 {

    public static void main(String[] args) {
//        1. Дан список ArrayList<Integer> целых чисел. Удалить из него нечетные числа.

        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        removeOdd(integers);
        System.out.println(integers);

//        2. Дан список ArrayList<String>. Удалить из него все строки, которые являются числами
//        Пример: ArrayList<String> list = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value"));
//        ["string", "s", "my_value"]
        ArrayList<String> list = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value"));
        removeNums(list);
        System.out.println(list);

    }
    private static void removeOdd(List<Integer> source) {
        for (int i = 0; i < source.size(); i++) {
            if (source.get(i) % 2 != 0) {
                source.remove(i--);
            }
        }

    }
    private static void removeNums(ArrayList<String> source) {
        for (int i = 0; i < source.size(); i++) {
            try {
                Integer.parseInt(source.get(i));
                source.remove(i--);
            }
            catch (Exception e){}
        }
    }

}
