package Recurssion.one.Lectures;

import java.util.ArrayList;
import java.util.Scanner;

public class LastIndex {
    public static int lastIndex(int arr[],int x){
        return lastIndex(arr,x,0,0,0);
    }
    public static int lastIndex(int arr[],int x,int index,int LastIndex,int count){
        if(index == arr.length - 1){
            if (arr[index] == x){
                return index;
            }
            else {
                if(count == 0){
                    return -1;
                }
                else {
                    return LastIndex;
                }
            }
        }
        if (arr[index] == x){
            LastIndex = index;
            count++;
        }
        return lastIndex(arr,x,index + 1,LastIndex,count);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[] = new int[size];

        for(int i = 0; i < size;i++){
            arr[i] = scanner.nextInt();
        }

        int x = scanner.nextInt();
        System.out.println(lastIndex(arr,x));
    }
}
