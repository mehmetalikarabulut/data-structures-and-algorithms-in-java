package apppack;

import java.util.Arrays;
import java.util.Scanner;

public class MainApp {

    public static void main(String args[]) {

        int length = 10; //arraylength
        int k= 0;
        int array[] = new int[length];

        Scanner input = new Scanner(System.in);
        System.out.print("Please write the array elements according to the array length with a space between them : ");

        for (k = 0; k < array.length; k++){
            array[k] = input.nextInt();
        }

        InsertionSort is = new InsertionSort();
        is.insertionSort(array);

        System.out.print ("Sorted array : ");
        System.out.println(Arrays.toString(array));
    }

}
