package ch9;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {
    int position = 0;
    MenuItem[] items;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        }
        return true;
    }

    @Override
    public MenuItem next() {
        return items[position++];
    }
}
