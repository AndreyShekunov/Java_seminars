public class task7 {

    //

    public static void main(String[] args) {
        String str = "aaaabbbcdde";
        String compressed = compress(str); // вызов метода
        System.out.println(compressed);  // вывод в консоль результата

    }

    // метод, который сжимает строку:
    // например: aaaabbbcdd -> a4b3cd2
    static String compress(String input) {
        String result = ""; // переменная для результата
        int count = 1;  // счетчки для подсчета повторяющихся символов
        char tmp = input.charAt(0); // первый символ в строке для сравнения
        for (int i = 1; i < input.length(); i++) {
            char c = input.charAt(i); // получаем символ строки
            if (tmp == c) {
                count++;
            } else {
                if (count > 1) {
                    result += String.valueOf(tmp) + count; // к результату добавляем символ, конвертирова его в строку и количество повторений этого символа в строке
                } else {
                    result += tmp;
                }
                tmp = c;
                count = 1;
            }
        }
        if (count > 1) {
            result += String.valueOf(tmp) + count;
        } else {
            result += tmp;
        }
        return result;
    }
}
