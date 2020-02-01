package ArraysAssingment.Day3;

import java.util.HashMap;
import java.util.Scanner;

public class RainWaterCollection {


    public static HashMap<Integer, Integer> hashMapOfArray(HashMap<Integer, Integer> hm,int arr[]){
        for(int i = 0; i < arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i] + 1));
            }
            else{
                hm.put(arr[i],1);
            }
        }
        return hm;
    }

    public static int rainWaterCollection(int arr[]){
        int start = 0;
        int end = 0;
        int sum = 0;
        for(int i = 1; i<arr.length;i++){
            if(arr[start] < arr[i]){
                end = i;
            }

            else if(arr[i] < arr[start]){
                end = i;
                sum = sum + arr[start] - arr[end];
            }
            else if(arr[i] > arr[start] && arr[i] > arr[end]){
                System.out.println("*");
                   end = i;
                   start = i;


            }
            System.out.print("start is" + start + " ");
            System.out.print("end is" + end + " ");
            System.out.print("sum is" + sum  + " ");
            System.out.println();
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int rainWater[] = new int[size];
        for(int i = 0; i<rainWater.length;i++){
            rainWater[i] = scan.nextInt();
        }
        System.out.println(rainWaterCollection(rainWater));

    }
}
