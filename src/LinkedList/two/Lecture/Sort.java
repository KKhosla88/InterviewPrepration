package LinkedList.two.Lecture;

import java.util.PriorityQueue;

public class Sort {
    private static LinkedListNode<Integer> sort(LinkedListNode<Integer> head){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        LinkedListNode<Integer> temp = head;

        while (temp != null){
            pq.add(temp.data);
            temp = temp.next;
        }
        LinkedListNode<Integer> newHead = null;
        LinkedListNode<Integer> tail = null;

        while (!pq.isEmpty()){
            LinkedListNode<Integer> newNode = new LinkedListNode<>(pq.poll());
            if (newHead == null){
                newHead = newNode;
                tail = newHead;
            }
            else {
                tail.next = newNode;
                tail = tail.next;
            }
        }
        return newHead;
    }

    public static void main(String[] args) {
        LinkedListNode<Integer> head = InputOutput.scan();
        InputOutput.print(sort(head));
    }
}
