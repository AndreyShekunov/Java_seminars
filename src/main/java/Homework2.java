import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Homework2 {

    public static void main(String[] args) throws IOException {
        System.out.println(buildString(6, 'a', 'b')); // "ababab"

//        2. Создать файл с названием file.txt. Если файл уже есть,
//        то создавать не надо Записать в него Слово "TEXT" 100 раз
        FileOutputStream of = new FileOutputStream("file.txt");

        String text = "TEXT\n";
        for (int i = 0; i < 100; i++) {
            byte[] bytes = text.getBytes(StandardCharsets.UTF_8);
            of.write(bytes);
        }
        of.close();
    }

//    1. Дано четное число N (>0) и символы c1 и c2.
//    Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
//    (6, 'a', 'b') -> "ababab"
    static String buildString(int n, char c1, char c2) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += c1;
            if (result.length() == n) {
                break;
            }
            result += c2;
            if (result.length() == n) {
                break;
            }
        }
        return result;
    }
}
