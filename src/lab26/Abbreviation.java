//Напишите функцию, создающую аббревиатуры. Например,
//на входе строка: "Санкт-Петербургский Государственный " +
//"Технический Институт им. Патриса Лумумбы". На выходе строка: СПБГТИПЛ.

package lab26;

public class Abbreviation {
    public static String getAbbreviation(String str) {
        String result = str.replaceAll("\\B.|\\P{L}", "").toUpperCase();
        return result;
    }
}
