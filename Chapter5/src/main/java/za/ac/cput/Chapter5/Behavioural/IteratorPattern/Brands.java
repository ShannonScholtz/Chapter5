package za.ac.cput.Chapter5.Behavioural.IteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by student on 2015/03/09.
 */
public class Brands {

    List<ShoeBrand> namebrands;

    public Brands(){
        namebrands = new ArrayList<ShoeBrand>();
    }

    public void addItem(ShoeBrand item){
        namebrands.add(item);
    }

    public Iterator<ShoeBrand> iterator()
    {
        return new MenuIterator();
    }

    class MenuIterator implements Iterator<ShoeBrand>
    {
        int index = 0;

        @Override
        public boolean hasNext() {
            if(index >= namebrands.size())
                return false;
            else
                return true;
        }

        @Override
        public ShoeBrand next() {
            return namebrands.get(index++);
        }

        @Override
        public void remove()
        {
            namebrands.remove(--index);
        }

    }

}
