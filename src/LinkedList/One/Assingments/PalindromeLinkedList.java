package LinkedList.One.Assingments;
import java.util.Stack;

public class PalindromeLinkedList{
    public static boolean checkPalindrome(LinkedListNode<Integer> head){
        Stack<Integer> st = new Stack<>();
        LinkedListNode<Integer> temp = head;

        while (temp != null){
            if (st.isEmpty()){
                st.push(temp.data);
            }
            else {
                if (temp.data.equals(st.peek())){
                    st.push(temp.data);
                }
                else {
                    st.pop();
                }
            }
            temp = temp.next;
        }
        return st.isEmpty();
    }

    public static void main(String[] args){
        LinkedListNode<Integer> ll = InputOutput.scan();
        System.out.println(checkPalindrome(ll));

    }
}
