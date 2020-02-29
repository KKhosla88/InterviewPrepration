package StacksAndQueues.assingment;
import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue<T>{
    public int count = 0;
    public Queue<T> q1;
    public Queue<T> q2;

    public StackUsingQueue(){
        this.q1 = new LinkedList<>();
        this.q2 = new LinkedList<>();
    }

    public int getSize(){
        return count;
    }

    public void push(T x){
        count++;
        q1.add(x);
        while (!q1.isEmpty()){
            q2.add(q1.remove());
        }
        Queue<T> q = q1;
        q1 = q2;
        q2 = q;
    }

    public void pop(){
        if (q1.isEmpty()){
            return;
        }
        q1.remove();
        count--;

    }

    public void poll(){
        q1.poll();
    }

}
