//Напишите функцию, на входе которой расстояние до места назначения (S, м) и время в пути (T, мин). Вычислить скорость (км/ч). Напишите тесты.

package lab24;

public class Speed {
    public static double calcSpeed(int meters, int min) {
        if (meters < 1 || min < 1) {
            System.out.println("Некорректное расстояние и/или время");
            return 0;
        }

        double speedMM = ((double)meters / min);

        return ((double) Math.round((speedMM * 0.06) * 100) / 100);
    }
}
