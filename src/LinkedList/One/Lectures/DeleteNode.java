package LinkedList.One.Lectures;

import java.util.Scanner;

public class DeleteNode extends InputOutput{
    public static LinkedListNode<Integer> deleteIthNode(LinkedListNode<Integer> head,int i){
        LinkedListNode<Integer> temp = head;
        LinkedListNode<Integer> node = null;
        int count = 0;
        if (i == 0){
            head = head.next;
            return head;
        }
        else {
            while (temp != null) {
                count++;
                if (count == i) {
                    node = temp;
                    temp = temp.next;
                    break;
                }
                temp = temp.next;
            }
            temp.next = node.next;
        }
        return head;
    }

    public static void main(String[] args) {
        LinkedListNode<Integer> ll = scan();
        Scanner scanner = new Scanner(System.in);
        print(deleteIthNode(ll,3));
    }
}
