package stack;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.Stack;

public class Application {

    public static void main(String[] args) {

        Stack<Integer> intStack = new Stack<>();

        intStack.push(10);
        intStack.push(11);
        intStack.push(12);
        intStack.push(13);
        intStack.push(14);
        intStack.push(15);

        System.out.println("intStack = " + intStack);

        //pop(): 해당스택의 가장 마지막요소를 반환 후 제거
        //peek():해당스택의 가장 마지막 요소를 반환

        System.out.println("intStack.pop() = " + intStack.pop());
        System.out.println("intStack.peek() = " + intStack.peek());

        Queue<Integer> intQue = new Queue<Integer>() {
            @Override
            public boolean add(Integer integer) {
                return false;
            }

            @Override
            public boolean offer(Integer integer) {
                return false;
            }

            @Override
            public Integer remove() {
                return 0;
            }

            @Override
            public Integer poll() {
                return 0;
            }

            @Override
            public Integer element() {
                return 0;
            }

            @Override
            public Integer peek() {
                return 0;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Integer> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Integer> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        }
    }
}
