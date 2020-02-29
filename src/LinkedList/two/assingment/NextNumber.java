package LinkedList.two.assingment;

import java.util.Stack;

public class NextNumber {
    private static LinkedListNode<Integer> nextNumber(LinkedListNode<Integer> head){
        int carry = 0;
        Stack<Integer> st = new Stack<>();
        LinkedListNode<Integer> temp = head;

        while (temp != null){
            st.push(temp.data);
            temp = temp.next;
        }
        Stack<Integer> ans = new Stack<>();

        if(st.peek() + carry + 1 >= 10){
            ans.push((st.pop() + carry + 1) % 10);
            carry = 1;
        }
        else {
            ans.push((st.pop() + carry + 1));
            carry = 0;
        }
        while (!st.isEmpty()){
            if (st.size() > 1) {
                if (st.peek() + carry >= 10) {
                    ans.push((st.pop() + carry) % 10);
                    carry = 1;
                } else {
                    ans.push((st.pop() + carry));
                    carry = 0;
                }
            }
            else {
                if (st.peek() + carry >= 10) {
                    ans.push((st.pop() + carry) % 10);
                    ans.push(1);
                } else {
                    ans.push((st.pop() + carry));

                }
            }
        }
        LinkedListNode<Integer> newHead = null;
        LinkedListNode<Integer> newTail = null;

        while (!ans.isEmpty()){
            LinkedListNode<Integer> newNode = new LinkedListNode<>(ans.pop());
            if (newHead == null){
                newHead = newNode;
                newTail = newHead;
            }
            else {
                newTail.next = newNode;
                newTail = newTail.next;
            }
        }
        return newHead;
    }

    public static void main(String[] args) {
        LinkedListNode<Integer> head = InputOutput.scan();
        InputOutput.print(nextNumber(head));

    }
}
