package dcll.etud.tp2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

/**
 * Created by HP on 10/04/2016.
 */
public class Stack {
    ArrayList<Item> itm=new ArrayList<Item>();


    public boolean isEmpty(){
        if(itm.size()==0)
        return true;
        else
            return false;
    }

    public int getSize(){
        return itm.size();
    }

    public void push(Item item) {
          itm.add(0,item);
    }

    public Item peek() throws EmptyStackException {

             return itm.get(0);
    }

    public Item pop() throws EmptyStackException {
            Item it=itm.remove(0);
            return it;
    }

}
