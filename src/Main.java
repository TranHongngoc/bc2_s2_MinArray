import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size array : ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i< array.length; i++){
            System.out.println("enter the element " + (i+1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Array: " + Arrays.toString(array));

        int min = array[0];
        for (int i = 0; i<array.length;i++){
            if (array[i]<min){
                min = array[i];
            }
        }

        System.out.println("min of array is : " + min);
    }

}
