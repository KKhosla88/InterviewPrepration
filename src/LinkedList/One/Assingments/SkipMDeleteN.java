package LinkedList.One.Assingments;

import java.util.Scanner;

public class SkipMDeleteN {
    public static LinkedListNode<Integer> skipMDeleteN(LinkedListNode<Integer> head,int m,int n){
        LinkedListNode<Integer> temp = head;
        LinkedListNode<Integer> start;
        while (temp != null){
            Boolean check = false;
            int count = 0;
            while (count < m && temp != null){
                temp = temp.next;
                count++;
            }
            start = temp;
            count = 0;
            while (count < n && temp != null){
                check = true;
                temp = temp.next;
                count++;
            }
            if(check)
            start.next = temp;
        }
        return head;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedListNode<Integer> head = InputOutput.scan();
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        InputOutput.print(skipMDeleteN(head,m,n));
    }
}
