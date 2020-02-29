package LinkedList.two.assingment;

public class SwapEveryPair {
    private static LinkedListNode<Integer> swap(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> start = head;
        LinkedListNode<Integer> end = head.next;
        LinkedListNode<Integer> tempNode = head;
        int count = 0;
        while (tempNode != null){
            tempNode = tempNode.next;
            count++;
        }
        if (count % 2 == 1) {
            while (end.next.next != null) {
                int temp;
                temp = start.data;
                start.data = end.data;
                end.data = temp;
                start = start.next.next;
                end = end.next.next;
            }
        }
        else {
            while (start.next.next != null) {
                int temp;
                temp = start.data;
                start.data = end.data;
                end.data = temp;
                start = start.next.next;
                end = end.next.next;
            }
        }
        int temp;
        temp = start.data;
        start.data = end.data;
        end.data = temp;


        return head;
    }
    public static void main(String[] args) {
        LinkedListNode<Integer> head = InputOutput.scan();
        InputOutput.print(swap(head));
    }
}
