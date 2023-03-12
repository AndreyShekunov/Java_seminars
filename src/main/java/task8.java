import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class task8 {

    // Создание файла и запись в него в тестовом формате

    public static void main(String[] args) throws IOException {
        Path of = Path.of("file.txt"); // абстрактный путь
//        Path path = of.toAbsolutePath(); // абсолютный путь
        System.out.println(Files.exists(of)); // проверка на наличие создаваемого файла false

        Path file = Files.createFile(of); // создаем файл с помощью пути и названия файла в переменной of
        System.out.println(Files.exists(of)); // проверка на наличие создаваемого файла true

        Files.writeString(of, "my text"); // запись строки в файл, который находится в пути of
    }
}
