//Напишите программу, отображающую переданную строку задом наперёд. Напишите тесты.

package lab25;

public class ReverseStr {
    public static String getReverseStr1(String str) {
        String result = new StringBuilder(str).reverse().toString();;
        return result;
    }

    public static String getReverseStr2(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = str.charAt(i) + result;
        }
        return result;
    }
}
