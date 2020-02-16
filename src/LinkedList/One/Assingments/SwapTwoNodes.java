package LinkedList.One.Assingments;

import java.util.Scanner;

public class SwapTwoNodes {
    private static LinkedListNode<Integer> swap(LinkedListNode<Integer> head, int i, int j){
        LinkedListNode<Integer> temp = head;
        if(j == i + 1){
            int count = 0;
            LinkedListNode<Integer> swapHead;
            LinkedListNode<Integer> swapTail;

            LinkedListNode<Integer> subListHead;
            LinkedListNode<Integer> subListTail;

            while (count <= i - 1){
                temp = temp.next;
                count++;
            }

            swapHead = temp;
            temp = temp.next;
            subListHead = temp;
            temp = temp.next;
            subListTail = temp;
            temp = temp.next;
            swapTail = temp;

            swapHead.next = subListTail;
            subListTail.next = subListHead;
            subListHead.next = swapTail;

        }
        else {
            int count = 0;
            LinkedListNode<Integer> firstSwapHead;
            LinkedListNode<Integer> firstSwapTail;

            LinkedListNode<Integer> secondSwapHead;
            LinkedListNode<Integer> secondSwapTail;

            LinkedListNode<Integer> swapOne;
            LinkedListNode<Integer> swapTwo;

            while (count <= i - 1){
                temp = temp.next;
                count++;
            }
            firstSwapHead = temp;
            temp = temp.next;
            swapOne = temp;
            temp = temp.next;
            firstSwapTail = temp;

            while (count <= j - 1){
                temp = temp.next;
                count++;
            }

            secondSwapHead = temp;
            temp = temp.next;
            swapTwo = temp;
            temp = temp.next;
            secondSwapTail = temp;

            firstSwapHead.next = swapTwo;
            swapTwo.next = firstSwapTail;

            secondSwapHead.next = swapOne;
            swapOne.next = secondSwapTail;
        }
        return head;
    }

    public static void main(String[] args) {
        LinkedListNode<Integer> ll = InputOutput.scan();
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        swap(ll,i,j);
        InputOutput.print(ll);
    }
}
