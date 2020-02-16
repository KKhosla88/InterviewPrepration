package LinkedList.One.Lectures;

import java.util.Scanner;

public class PrintIthNode {
    public static void printIth(LinkedListNode<Integer> head, int num){
        LinkedListNode<Integer> temp = head;
        int count = 0;

        while (temp.next != null){
            count++;
            if (count == num){
                System.out.println(temp.data);
                break;
            }
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        InputOutput obj = new InputOutput();
        Scanner scanner = new Scanner(System.in);
        LinkedListNode<Integer> ll = obj.scan();
//      System.out.println(printIth(ll,i));
    }
}
