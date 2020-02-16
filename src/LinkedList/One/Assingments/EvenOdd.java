package LinkedList.One.Assingments;

public class EvenOdd {
    private static LinkedListNode<Integer> sortEvenOdd(LinkedListNode<Integer> head){
        boolean check = false;
        int count = 0;
        LinkedListNode<Integer> evenHead = null;
        LinkedListNode<Integer> evenTail = null;

        LinkedListNode<Integer> oddHead = null;
        LinkedListNode<Integer> oddTail = null;

        LinkedListNode<Integer> temp = head;
        while (temp != null){
            if(count % 2 == 0){
                LinkedListNode<Integer> evenTemp = new LinkedListNode<>(temp.data);
                if (evenHead == null){
                    evenHead = evenTemp;
                    evenTail = evenHead;
                }
                else {
                    evenTail.next = evenTemp;
                    evenTail = evenTail.next;
                }
            }
            else {
                check = true;
                LinkedListNode<Integer> oddTemp = new LinkedListNode<>(temp.data);
                if (oddHead == null){
                    oddHead = oddTemp;
                    oddTail = oddHead;
                }
                else {
                    oddTail.next = oddTemp;
                    oddTail = oddTail.next;
                }
            }
            temp = temp.next;
            count++;
        }
        if (check) {
            oddTail.next = evenHead;
            return oddHead;
        }

        return head;
    }

    public static void main(String[] args) {
        LinkedListNode<Integer> ll = InputOutput.scan();
        InputOutput.print(sortEvenOdd(ll));
    }
}
