import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class task5 {

    // запись в файл

    // JAVA PROCESS <------[OS]-------> FILE

    public static void main(String[] args) throws IOException {
        // FileOutputStream поток записи в файл
        FileOutputStream fileOutputStream = new FileOutputStream("file.txt");

        String text = "My text";
        byte[] bytes = text.getBytes(StandardCharsets.UTF_8); // строку text преобразуем в массива байт
        fileOutputStream.write(bytes); // запись в файл созданный массив байт

        fileOutputStream.close(); // закрытие ресурса, в данном случае file.txt
    }
}
