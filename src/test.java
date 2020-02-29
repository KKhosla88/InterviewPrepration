import LinkedList.One.Lectures.LinkedListNode;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

public class test {
    public static int check(){
        Scanner scanner = new Scanner(System.in);
        int ans = 0;
        int sum = 0;
        LinkedListNode<Integer> head = null;
        LinkedListNode<Integer> tail = null;
        LinkedListNode<Integer> start = null;
        LinkedListNode<Integer> end = null;


        for(int i = 0 ; i < 8 ; i++){
            LinkedListNode<Integer> newNode = new LinkedListNode<>(scanner.nextInt());
            if(i < 4){
                sum = sum + newNode.data;
            }
            if (head == null){
                head = newNode;
                tail = head;
            }
            else {
                tail.next = newNode;
                if(i == 3){
                    end = newNode;
                }
                tail = tail.next;
            }
        }
        tail.next = head;
        start = head;

        while (start != tail){
            int temp = sum - start.data + end.data;
            if(temp > ans){
                ans = temp;
            }
            start = start.next;
            end = end.next;
        }
        return ans;
    }
    public static int arrowCount(){
        Scanner scanner = new Scanner(System.in);
        int ans = 0;
        int size = scanner.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i < size ; i++){
            int var = scanner.nextInt();
            al.add(var);
            pq.add(var);
        }

        Stack<Integer> st = new Stack<>();
        while (!pq.isEmpty()){
            st.push(pq.poll());
        }

        while (!al.isEmpty()){
            int arrow = st.peek();
            System.out.println(arrow);
            int i = 0;
            while (i < al.size()){
                if (al.get(i) == arrow) {
                    al.remove(i);
                    st.pop();
                    arrow--;
                }
                i++;
            }
            ans++;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(arrowCount());

    }

}
