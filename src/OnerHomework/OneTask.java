package OnerHomework;
import java.util.Scanner;

public class OneTask {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину прямоугольника: ");
        float a = in.nextFloat();
        System.out.print("Введите ширину прямоугольника: ");
        float b = in.nextFloat();
        System.out.print("Введите радиус окружности: ");
        float r = in.nextFloat();
        in.close();
        double d = Math.sqrt(a * a + b * b) / 2;
        System.out.println("Половина диагонали: " +d);
        if (r >= d) {
            System.out.println("Круг подходит");
        } else {
            System.out.println("Круг не подходит");
        }
    }
}
