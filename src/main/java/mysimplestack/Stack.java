package mysimplestack;

import java.util.ArrayList;


public class Stack implements SimpleStack {
    private ArrayList<Item> tab;
    private Item top;
    private int size;

    public Stack() {
        size = 0;
        this.tab = new ArrayList<>();
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public void push(Item item) {
        tab.add(item);
        top = item;
        size++;
    }

    public Item peek() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException("pile vide pour peek");
        } else {
            return top;
        }

    }

    public Item pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException("pile vide pour pop");
        }else {
            Item it = top;
            tab.remove(top);
            size--;
            if (!isEmpty()) {
                top = tab.get(size - 1);
            }
            return it;
        }
    }
}
