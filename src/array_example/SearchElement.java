package array_example;

import java.util.Arrays;

import static java.lang.String.format;

public class SearchElement {
    int[] items = {77, 99, 44, 55, 22, 88, 11, 0, 66, 77, 33};

    public static void main(String[] args) {
        var search = new SearchElement();
        System.out.println("Initial array " + Arrays.toString(search.items));
        search.searchFor(66);
        search.searchFor(77);
        search.searchFor(27);
    }

    public void searchFor(int searchFor) {
        System.out.println(format("Try find element %d ...", searchFor));
        boolean isFind = false;
        for (int i = 0; i < items.length; i++) {
            if (items[i] == searchFor) {
                isFind = true;
                System.out.println(format("Find: item[%d] = %d", i, searchFor));
            }
        }
        if (!isFind) {
            System.out.println("Can't find element");
        }
    }
}
