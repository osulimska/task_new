package SevenHomework;

import java.util.Arrays;
import java.util.Random;

public class SevenTask {
    public static void main(String[] args) {
        int[][] twoDimArray = new int[6][];
        Random random = new Random();
        for (int i = 0; i < twoDimArray.length; i++){
            twoDimArray[i] = new int[(int) (Math.random()*10)];
        }
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                twoDimArray[i][j] = random.nextInt(10);
            }
        }
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                System.out.print(twoDimArray[i][j]);
            }
            System.out.println();
        }

    }
}
