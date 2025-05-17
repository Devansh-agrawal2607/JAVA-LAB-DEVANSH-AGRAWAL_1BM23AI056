/*Write a Java program to implement a dynamic, growable queue using generics.
The queue should be able to store elements of any data type and dynamically resize
itself as needed to accommodate more elements.*/
import java.util.Arrays;
public class GenericQueue<T> {
    T[] queue;
    static int size;
    public GenericQueue(){
        queue = (T[]) new Object[2];
        size=0;
    }
    public void enqueue(T element){
        if (size == queue.length){
            int newCapacity = queue.length*2;
            queue = Arrays.copyOf(queue, newCapacity);
        }
        queue[size++] = element;
    }
    public T dequeue(){
        if (size==0){
            System.out.println("Queue is empty");
        }
        T del_element = queue[0];
        System.arraycopy(queue,1,queue,0, size-1);
        queue[--size]=null;
        return del_element;
    }
    public void display(){
        for (T element:queue){
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        GenericQueue<Integer> IntegerQueue = new GenericQueue<>();
        IntegerQueue.enqueue(1);
        IntegerQueue.enqueue(2);
        IntegerQueue.enqueue(3);
        System.out.println("Elements in the queue are: ");
        IntegerQueue.display();
        int dequeueele = IntegerQueue.dequeue();
        System.out.println("Dequeued Element: "+ dequeueele);
        IntegerQueue.display();
        System.out.println("Queue size: " +(++size));
    }
}
