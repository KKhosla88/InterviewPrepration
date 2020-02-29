package LinkedList.two.assingment;

import java.util.Scanner;

public class MoveToLast {
    public static LinkedListNode<Integer> move(LinkedListNode<Integer> head,int i){
        int count = 0;
        LinkedListNode<Integer> temp = head;
        while (head.data == i){
            head = head.next;
            count++;
        }
        while (temp.next != null){
            if (temp.next.data == i){
                temp.next = temp.next.next;
                count++;
            }
            else {
                temp = temp.next;
            }
        }
        System.out.println(temp.data);
        LinkedListNode<Integer> newNode = new LinkedListNode<>(i);
        for (int a = 0 ; a < count ; a++){
            temp.next = newNode;
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedListNode<Integer> head = InputOutput.scan();
        int i = scanner.nextInt();
        InputOutput.print(move(head,i));
    }
}
