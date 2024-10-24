package ch7;

import java.util.ArrayList;

public class AdapterTest2 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>() {{
            add("1");
            add("2");
            add("3");
        }};

        IteratorEnumeration adapter = new IteratorEnumeration(arr.iterator());
        adapter.nextElement();
        adapter.nextElement();
        System.out.println(adapter.hasMoreElements());
        adapter.nextElement();
        System.out.println(adapter.hasMoreElements());
    }
}
