package dcll.etud.tp2;

import java.util.EmptyStackException;

/**
 * Created by HP on 10/04/2016.
 */
public class SimpleStackImpl implements SimpleStack {
     Stack stack=new Stack();
    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public int getSize() {
        return stack.getSize();
    }

    @Override
    public void push(Item item) {
        stack.push(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        return stack.peek();
    }

    @Override
    public Item pop() throws EmptyStackException {
        return stack.pop();
    }
}
