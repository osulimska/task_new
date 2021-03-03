package FiveHomework;

public class FoveTask {
    public static void main(String[] args)
    {
        int arr[] ={8,54,20,6,91};
        System.out.println("Array BEFORE Bubble Sort");
        printArray(arr);
        bubbleSort(arr);
        System.out.println("Array AFTER Bubble Sort");
        printArray(arr);
    }
    static void bubbleSort(int[] array) {
        int n = array.length;
        int temp = 0;
        for(int i=0; i < n; i++)
        {  System.out.println("Sort Pass Number "+(i+1));
            for(int j=1; j < (n-i); j++) {
                System.out.println("Comparing "+ array[j-1]+ " and " + array[j]);
                if(array[j-1] > array[j]) {
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                    System.out.println(array[j]  + " is greater than " + array[j-1]);
                    System.out.println("Swapping Elements: New Array After Swap");
                    printArray(array);
                }

            }
        }

    }
    static void printArray(int[] array){
        for(int i=0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
