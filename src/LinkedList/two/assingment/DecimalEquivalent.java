package LinkedList.two.assingment;
import java.util.Stack;

public class DecimalEquivalent {
    public static int decimal(LinkedListNode<Integer> head){
        LinkedListNode<Integer> temp = head;
        Stack<Integer> st = new Stack<>();

        while (temp != null){
            st.push(temp.data);
            temp = temp.next;
        }
        int ans = 0;
        int i = 0;
        while (!st.isEmpty()){
            ans = ans + st.pop()*(int)(Math.pow(2,i));
            i++;
        }
        return ans;
    }

    public static void main(String[] args) {
        LinkedListNode<Integer> head = InputOutput.scan();
        System.out.println(decimal(head));
    }
}
