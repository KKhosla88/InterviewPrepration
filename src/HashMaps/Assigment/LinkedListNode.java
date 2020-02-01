package HashMaps.Assigment;

public class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    LinkedListNode(T data){
        this.data = data;
        next = null;
    }


    public LinkedListNode<T> next(LinkedListNode<T> temp) {
        LinkedListNode<T> temp2 = new LinkedListNode<>(data);
        temp.next(temp2);
        return temp;
    }
}
