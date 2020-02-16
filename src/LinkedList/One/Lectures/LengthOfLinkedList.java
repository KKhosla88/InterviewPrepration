package LinkedList.One.Lectures;

public class LengthOfLinkedList {
    public static int length(LinkedListNode<Integer> head){
        LinkedListNode<Integer> temp = head;
        int count = 1;

        while (temp.next != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}
