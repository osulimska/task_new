package SixHomework;

import java.util.Scanner;

public class SixTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число строк и столбцов массива: ");
        int n = in.nextInt();

        int[][] a = new int[n][n];
        System.out.println("Введите элементы массива: ");
        for (int i=0; i<n; i++)
        {
            for (int j=0; j<n; j++)
            {
                a[i][j] = in.nextInt();}}

        for (int i=0; i<n; i++)
        {
            for (int j=0; j<n; j++) {
                if (a[i][j] % 2 == 0) {
                    a[i][j] = 0;
                } else {
                    a[i][j] = 1;
                }
            }
        }
        for (int i=0; i<n; i++)
        {
            for (int j=0; j<n; j++)
            {
                System.out.printf(" %d", a[i][j]);
            }
            System.out.println();
        }
        in.close();


    }
}