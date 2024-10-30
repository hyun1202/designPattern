package ch9;

import java.util.List;

public class PancakeHouseIterator implements Iterator {
    int position = 0;
    List<MenuItem> items;

    public PancakeHouseIterator(List<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.size() || items.get(position) == null) {
            return false;
        }
        return true;
    }

    @Override
    public MenuItem next() {
        return items.get(position++);
    }
}
