// Надо реализовать метод, который принимает на вход String, удаляет рядом стоящие парные буквы и возвращает остаток. Примеры ожидаемого поведения программы:
// "aab" -> "b", "aabb" -> "", "abfbaf" -> "abfbaf”, "abccbaf" -> "f"
// Реализовать метод и описать его алгоритмическую сложность. Напишите junit-тесты.

package lab8;

public class DuplicatesSymbols {
    public static String removeDuplicatesSymbols(String inputStr) {
        StringBuilder outStr = new StringBuilder();
        if(inputStr.length() < 2) {
            return inputStr;
        }

        if (inputStr.charAt(0) != inputStr.charAt(1)) {
            outStr.append(inputStr.charAt(0));
        }

        for (int i = 1; i < inputStr.length() - 1; i++) {
            if (inputStr.charAt(i) != inputStr.charAt(i-1) && inputStr.charAt(i) != inputStr.charAt(i+1)) {
                outStr.append(inputStr.charAt(i));
            }
        }

        if (inputStr.charAt(inputStr.length() - 1) != inputStr.charAt(inputStr.length() - 2)) {
            outStr.append(inputStr.charAt(inputStr.length() - 1));
        }

        return outStr.toString();
    }
}
