package LinkedList.two.Lecture;

import java.util.LinkedList;

public class MiddlePoint {
    private static int mid(LinkedListNode<Integer> head){
        LinkedListNode<Integer> temp1 = head;
        LinkedListNode<Integer> temp2 = head;

        while (temp1.next.next != null){
            temp2 = temp2.next;
            temp1 = temp1.next.next;
        }

        return temp2.data;
    }

    public static void main(String[] args) {
        LinkedListNode<Integer> listNode = InputOutput.scan();
        System.out.println((mid(listNode)));
    }
}
