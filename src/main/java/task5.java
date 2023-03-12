import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class task5 {

    // запись в файл

    // JAVA PROCESS <------[OS]-------> FILE

    public static void main(String[] args) throws IOException {
        // BufferedOutputStream буферизированный поток записи в файл
        BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream("file.txt"));

        String text = "My text";
        byte[] bytes = text.getBytes(StandardCharsets.UTF_8); // строку text преобразуем в массива байт
        os.write(bytes); // накапливает данные в буфере
        os.flush(); // записывает накопленные данные из буфера в файл
    }
}
