import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task10 {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 1, 6, 3, 5, 6, 11, 9));
        System.out.println(integers); // [1, 1, 2, 3, 1, 6, 3, 5, 6, 11, 9]
        removeDuplicates(integers);
        System.out.println(integers); //[1, 2, 3, 6, 5, 11, 9]
    }

    private static void removeDuplicates(List<Integer> source) {
        // нужно удалить в нем все дубликаты более быстрый вариант решения, но
        // затрачивает больше памяти
        List<Integer> duplicates = new ArrayList<>();
        int i = 0;
        while (i < source.size()) {
            Integer element = source.get(i);
            if (!duplicates.contains(element)) {
                duplicates.add(element);
            } else {
                source.remove(i--);
            }
            i++;
        }
    }
}
