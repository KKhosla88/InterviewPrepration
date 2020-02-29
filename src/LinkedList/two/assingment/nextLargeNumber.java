package LinkedList.two.assingment;

import java.util.Stack;

public class nextLargeNumber {
    private static LinkedListNode<Integer> nextNumber(LinkedListNode<Integer> head){
        LinkedListNode<Integer> temp = head;
        Stack<Integer> st = new Stack<>();
        int count = 0;
        while (temp != null){
            st.push(temp.data);
            temp = temp.next;
            count++;
        }
        Stack<Integer> reverse = new Stack<>();
        return head;
    }
    private static int count(LinkedListNode<Integer> head){
        LinkedListNode<Integer> temp = head;
        int count = 0;

        while (temp != null){
            temp = temp.next;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        LinkedListNode<Integer> head = InputOutput.scan();
        InputOutput.print(nextNumber(head));
    }
}
