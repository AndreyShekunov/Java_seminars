import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task9 {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 1, 6, 3, 5, 6, 11, 9));
        System.out.println(integers); // [1, 1, 2, 3, 1, 6, 3, 5, 6, 11, 9]
        removeDuplicates(integers);
        System.out.println(integers); //[1, 2, 3, 6, 5, 11, 9]
    }

    private static void removeDuplicates(List<Integer> source) {
        // нужно удалить в нем все дубликаты
        int i = 0;
        while (i < source.size()) {
            int j = i + 1;
            while (j < source.size()) {
                if (source.get(i).equals(source.get(j))) {   // .equals это аналог ==
                    source.remove(j);
                }
                j++;
            }
            i++;
        }
    }
}
