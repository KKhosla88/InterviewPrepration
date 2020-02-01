package ArrayStringsAssingment;

import java.util.Scanner;

public class PushZeroToEnd {
    public static void pushZerosAtEnd(int[] arr){
        int tempPointer = 0;
        int temp;
        while(tempPointer < arr.length - 1){
            if ((arr[tempPointer] == 0 && arr[tempPointer + 1] == 0)||(arr[tempPointer] != 0 && arr[tempPointer + 1] != 0)){
                tempPointer++;
                tempPointer++;
            }
            else if(arr[tempPointer] == 0 && arr[tempPointer + 1] != 0){
                temp = arr[tempPointer];
                arr[tempPointer] = arr[tempPointer + 1];
                arr[tempPointer + 1] = temp;
                if(tempPointer != 0) {
                    tempPointer--;
                }
                else if (tempPointer == 0){

                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ;  i < arr.length ; i++){
            arr[i] = scanner.nextInt();
        }
        pushZerosAtEnd(arr);
        for(int i = 0; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
