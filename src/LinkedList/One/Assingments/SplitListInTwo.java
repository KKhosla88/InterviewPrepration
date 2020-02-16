package LinkedList.One.Assingments;
import java.util.Stack;

public class SplitListInTwo {
    private static void make2List(LinkedListNode<Integer> head) {
        int count = 0;
        LinkedListNode<Integer> evenHead = null;
        LinkedListNode<Integer> evenTail = null;

        LinkedListNode<Integer> oddHead = null;
        LinkedListNode<Integer> oddTail = null;

        LinkedListNode<Integer> temp = head;
        while (temp != null) {
            if (count % 2 == 0) {
                LinkedListNode<Integer> evenTemp = new LinkedListNode<>(temp.data);
                if (evenHead == null) {
                    evenHead = evenTemp;
                    evenTail = evenHead;
                } else {
                    evenTail.next = evenTemp;
                    evenTail = evenTail.next;
                }
            } else {
                LinkedListNode<Integer> oddTemp = new LinkedListNode<>(temp.data);
                if (oddHead == null) {
                    oddHead = oddTemp;
                    oddTail = oddHead;
                } else {
                    oddTail.next = oddTemp;
                    oddTail = oddTail.next;
                }
            }
            temp = temp.next;
            count++;
        }
        Stack<Integer> even = new Stack<>();
        Stack<Integer> odd = new Stack<>();

        while (evenHead != null){
            even.push(evenHead.data);
            evenHead = evenHead.next;
        }

        while (oddHead != null){
            odd.push(oddHead.data);
            oddHead = oddHead.next;
        }
        while (!even.isEmpty()){
            System.out.print(even.pop() + " ");
        }
        System.out.println();
        while (!odd.isEmpty()){
            System.out.print(odd.pop() + " ");
        }
    }

    public static void main(String[] args) {
        LinkedListNode<Integer> ll = InputOutput.scan();
        make2List(ll);
    }
}
