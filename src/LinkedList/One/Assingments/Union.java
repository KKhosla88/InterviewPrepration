package LinkedList.One.Assingments;

import java.util.HashMap;

public class Union {
    public static LinkedListNode<Integer> Union(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2){
        LinkedListNode<Integer> temp = head1;
        LinkedListNode<Integer> tail = null;
        HashMap<Integer, Integer> hm = new HashMap<>();

        while (temp.next != null){
            if(hm.isEmpty()) {
                hm.put(temp.data, 1);
            }
            else if(hm.containsKey(temp.data)){
                hm.put(temp.data,hm.get(temp.data));
            }
            else if(!hm.containsKey(temp.data)){
                hm.put(temp.data,1);
            }
            temp = temp.next;
        }
        tail = temp;
        LinkedListNode<Integer> temp2 = head2;

        while (temp2 != null){
            if (hm.containsKey(temp2.data)){
                hm.put(temp2.data,hm.get(temp2.data) - 1);
                if(hm.get(temp2.data) == 0){
                    hm.remove(temp2.data);
                }
            }
            else if(!hm.containsKey(temp2.data)) {
                tail.next = new LinkedListNode<>(temp2.data);
                tail = tail.next;
            }
            temp2 = temp2.next;
        }
        return head1;
    }

    public static void main(String[] args) {
        LinkedListNode<Integer> one = InputOutput.scan();
        LinkedListNode<Integer> two = InputOutput.scan();
        InputOutput.print(Union(one,two));
    }
}
