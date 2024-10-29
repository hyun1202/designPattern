package ch8;

import java.util.AbstractList;

public class MyStringList extends AbstractList<String> {
    private String[] myList;

    public MyStringList(String[] myList) {
        this.myList = myList;
    }

    @Override
    public String get(int index) {
        return myList[index];
    }

    @Override
    public int size() {
        return myList.length;
    }

}
