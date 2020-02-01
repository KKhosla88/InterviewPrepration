package HashMaps.Assigment;
import java.util.*;

public class LongestConsecutiveSequence {
    public static ArrayList<Integer> longestConsecutiveSequence(int[] arr) {

        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer,Boolean> index = new HashMap<>();
        HashMap<Integer,ArrayList<Integer>> arrayListHashMap = new HashMap<>();
        int length = 0;
        int head = 0;
        int tail = 0;

        for(int i = 0;i  < arr.length;i++){
            index.put(arr[i],true);
        }
        for(int i=0 ; i< arr.length;i++){
            if(index.get(arr[i]).equals(true)){
                ArrayList<Integer> ar = new ArrayList<>();
                ar.add(arr[i]);
                head = arr[i];
                tail = arr[i];
                while (index.containsKey(tail + 1)){
                    ar.add(tail + 1);
                    index.put(tail + 1,false);
                    tail = ar.get(ar.size() - 1);
                }
                while (index.containsKey(head - 1)){
                    ar.add(0,head);

                    head = ar.get(head);
                }
                arrayListHashMap.put(ar.size(),ar);
                
                if(ar.size() > length){
                    length = ar.size();
                }
            }
        }
        return arrayListHashMap.get(length);
    }

    public static void print(LinkedListNode<Integer> head) {
        while (head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for(int i = 0;i< size;i++){
            arr[i] = scanner.nextInt();
        }
        longestConsecutiveSequence(arr);

    }
}
