public class task3 {
    // Задача 3.
    // Напишите метод, который находит самую длинную строку общего префикса (начальная часть слова)
    // среди всех строк массива. Если общего префикса нет, вернуть пустую строку "".
    public static void main(String[] args) {
        String[] array = {"abcdef", "abc", "abcggggg", "abeee"}; // в данном случае общий префикс ab

        String commonPrefix = findCommonPrefix(array); // обрашение к методу поиска общего префикса

        System.out.println(commonPrefix); // вывод на экран общего префикса

    }

    // метод поиска общего префикса в массиве строк
    static String findCommonPrefix(String[] arr) {
        String shortString = arr[0]; // за самую короткую строку в массиве берем первый элемент массива
        for (int i = 1; i < arr.length; i++) { // ищем самую короткую строку в массиве
            if (arr[i].length() < shortString.length()) { // стравниваем дины строк, если самая коротка строка больше элемента массивы
                shortString = arr[i]; // то берем за самую коротку найденый элемент массива
            }
        }

        String result = ""; // пустая строка для записи результата поиска
        first: for (int index = 0; index < shortString.length(); index++) { // проходим по индексам самой короткой строки
            char firstIndexChar = shortString.charAt(index); // метод .charAt позволяет получить символ наименьшей строки
            for (int i = 1; i < arr.length; i++) {
                char secondStringChar = arr[i].charAt(index); // метод .charAt позволяет получить символ i-той строки
                if (firstIndexChar != secondStringChar) { // если символы не равны двух соседних элементов массива ->
                    break first; // -> то останавливаем внешний цикл по метке shortString
                }
            }
            result += shortString.charAt(index); // в первом цикле записываем общие символы строк массива в переменную
        }

        return result;
    }
}
