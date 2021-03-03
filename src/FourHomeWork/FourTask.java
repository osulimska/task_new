package FourHomeWork;

import java.util.Scanner;

public class FourTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число элементов массива: ");
        int n = in.nextInt();

        int[] a = new int[n];
        int sum = 0;
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < a.length; i++) { // честно признаюсь, я на такой простой задаче закопалась, точнее "в трех
            //березах за путалась" сама не знаю где и как так// "
            if (i < 0);
            sum += a[i];
            System.out.println("Сумма чисел массива: " + sum);
        }
        in.close();
    }
}