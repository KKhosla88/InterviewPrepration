package LinkedList.One.Assingments;

public class LastToFront {
    public static LinkedListNode<Integer> lastToFront(LinkedListNode<Integer> head){
        LinkedListNode<Integer> temp = head;
        while (temp.next.next != null){
            temp = temp.next;
        }
        LinkedListNode<Integer> newNode = null;
        newNode = temp.next;
        temp.next = null;
        newNode.next = head;
        return newNode;
    }

    public static void main(String[] args) {
        LinkedListNode<Integer> head = InputOutput.scan();
        InputOutput.print(lastToFront(head));
    }
}
