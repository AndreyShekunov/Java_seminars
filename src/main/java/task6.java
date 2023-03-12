import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class task6 {

    public static void main(String[] args) throws IOException {
        // Чтение из файла
        FileInputStream fileInputStream = new FileInputStream("file.txt");
        byte[] bytes = new byte[7];
        fileInputStream.read(bytes);
        //byte[] bytes = fileInputStream.readAllBytes();
        System.out.println(Arrays.toString(bytes));
    }
}
