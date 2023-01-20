package part1_dataStructure;

import java.util.ArrayList;

/**
 * - JAVA ArrayList 클래스를 활용해서 큐를 다루는 enqueue, dequeue 기능 구현해보기
 * - dequeue 기능 호출 시, 큐에 데이터가 없을 경우, null 을 리턴하도록 함
 */
class Queue<T> {
    private ArrayList<T> queue = new ArrayList<T>();

    public void enqueue(T text) {
        queue.add(text);
    }

    public T dequeue() {
        if (queue.isEmpty()) {
            return null;
        } else {
            return queue.remove(0);
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue1 = new Queue<Integer>();
        queue1.enqueue(1);
        queue1.enqueue(2);
        queue1.enqueue(3);
        System.out.println(queue1.dequeue());
        System.out.println(queue1.dequeue());
        System.out.println(queue1.dequeue());
        System.out.println(queue1.dequeue());
    }

}
