package HashMaps;
import java.util.*;

public class PairOf0 {
      private static void pairOf0(int arr[]){
        HashMap<Integer, Integer> integerHashMap = new HashMap<>();
        ArrayList<Integer> ar = new ArrayList<>();

        for(int i =0; i < arr.length ; i++){
            if(integerHashMap.containsKey(arr[i])){
                integerHashMap.put(arr[i],integerHashMap.get(arr[i]) + 1);
            }
            else if(!integerHashMap.containsKey(arr[i])) {
                integerHashMap.put(arr[i],1);
                if(arr[i] > 0){
                    ar.add(arr[i]);
                }
            }
            else if(integerHashMap.isEmpty()){
                integerHashMap.put(arr[i],1);
                if(arr[i] > 0){
                    ar.add(arr[i]);
                }
            }
        }

        Collections.sort(ar);
        System.out.println(ar);
        for(int i = 0; i < ar.size();i++) {
            if (integerHashMap.containsKey(ar.get(i) * -1)) {
                for (int j = 0; j < integerHashMap.get(ar.get(i)) * integerHashMap.get(ar.get(i) * -1); j++) {
                    System.out.print(ar.get(i) * -1 + " " + ar.get(i) + "   ");
                }
                integerHashMap.remove(ar.get(i));
                integerHashMap.remove(ar.get(i) * -1);
            }
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrSize = scanner.nextInt();
        int[] arr = new int[arrSize];

        for (int i = 0; i < arrSize; i++) {
            arr[i] = scanner.nextInt();
        }

        pairOf0(arr);
    }
}

