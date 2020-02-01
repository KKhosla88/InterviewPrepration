package HashMaps.Assigment;
import java.util.HashMap;
import java.util.Scanner;

public class ZeroSumSubArray {
    public static boolean zeroSumSubArray(int[] arr){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i]) + 1);
            }
            else{
                hm.put(arr[i],1);
            }
        }
        for(int i = 0; i< arr.length;i++){
            if(hm.containsKey(arr[i]*-1)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[scan.nextInt()];

        for(int i = 0;i < arr.length ;i++){
            arr[i] = scan.nextInt();
        }

    }
}
