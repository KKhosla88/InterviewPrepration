package ArraysAssingment.Day1;
//-8 2 3 -6 10
import java.util.Scanner;

public class FirstNegativeIntegerInWindow {
    public static void firstNegativeInteger(int[] arr,int WindowSize) {
        int start = 0;
        int end = WindowSize - 1;


        while (end < arr.length) {
            int negativeNumber = 0;
            for (int i = start; i <= end; i++) {
                if (arr[i] < 0) {
                    negativeNumber = arr[i];
                    break;
                }
            }
            System.out.print(negativeNumber + " ");
            start++;
            end++;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size;i++){
            arr[i] = scanner.nextInt();
        }
        int WindowSize = scanner.nextInt();
        firstNegativeInteger(arr,WindowSize);
    }
}
