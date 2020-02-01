package Recurssion.one.Lectures;
import java.util.*;
public class allIndexes {
    public static int[] allIndexes(int arr[],int x){
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> ans = allIndexes(arr,x,0,arrayList);
        int[] output = new int[ans.size()];
        for (int i = 0;i < ans.size();i++){
            output[i] = ans.get(i);
        }
        return output;
    }
    public static ArrayList<Integer> allIndexes(int arr[], int x, int index, ArrayList<Integer> arrayList){
        if(index == arr.length - 1){
            if (arr[index] == x){
                arrayList.add(index);
                return arrayList;
            }
            else {
                return arrayList;
            }
        }
        if (arr[index] == x){
            arrayList.add(index);
        }
        return allIndexes(arr,x,index + 1,arrayList);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[] = new int[size];

        for(int i = 0; i < size;i++){
            arr[i] = scanner.nextInt();
        }

        int x = scanner.nextInt();
        int[] ans = allIndexes(arr,x);
        for (int i = 0 ; i < ans.length;i++){
            System.out.print(ans[i] + " ");
        }
    }
}
