package Recurssion.two.Lecture;
import java.util.Scanner;

public class QuickSort {

    public static void quickSort(int[] input) {
        if (input.length <= 1)
            return;

        int[] a = new int[input.length / 2];
        int[] b = new int[input.length - a.length];

        for (int i = 0; i < input.length; i++) {
            if (i < a.length) {
                a[i] = input[i];
            } else {
                b[i - a.length] = input[i];
            }
        }

        quickSort(a);
        quickSort(b);

        int ai = 0;
        int bi = 0;
        while (ai + bi < input.length) {
            if (bi >= b.length || (ai < a.length && a[ai] < b[bi])) {
                input[ai + bi] = a[ai];
                ai++;
            } else {
                input[ai + bi] = b[bi];
                bi++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for(int i = 0 ; i < size;i++){
            arr[i] = scanner.nextInt();
        }
        quickSort(arr);

        for(int i = 0 ; i < size;i++){
            System.out.print(arr[i] + " ");
        }

    }
}
