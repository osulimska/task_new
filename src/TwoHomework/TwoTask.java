package TwoHomework;

import java.util.Scanner;

public class TwoTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число : ");
        byte n = in.nextByte();
        in.close();
        if(0 < n && n < 10) {
            switch (n) {
                case 1:
                    System.out.println("Понедельник");
                    break;
                case 2:
                    System.out.println("Вторник");
                    break;
                case 3:
                    System.out.println("Среда");
                    break;
                case 4:
                    System.out.println("Четверг");
                    break;
                case 5:
                    System.out.println("Пятница");
                    break;
                case 6:
                    System.out.println("Суббота");
                    break;
                case 7:
                    System.out.println("Воскресенье");
                    break;
                default:
                    System.out.println("Соответствий не найдено");

            }
        }
        else {
            System.out.println("Значение n от 0 до 10!");
        }

    }
}
