package ch8;

import java.util.List;

public class MyStringListTest {
    public static void main(String[] args) {
        String[] ducks = {"Mallard Duck", "ReadHead Duck", "Rubber Duck", "Decoy Duck"};
        MyStringList duckList = new MyStringList(ducks);
        List<String> duckSubList = duckList.subList(1, 4);

        duckSubList.forEach(System.out::println);
    }
}
